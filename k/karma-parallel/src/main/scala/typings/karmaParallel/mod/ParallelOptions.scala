package typings.karmaParallel.mod

import typings.karmaParallel.karmaParallelStrings.`description-length`
import typings.karmaParallel.karmaParallelStrings.`round-robin`
import typings.karmaParallel.karmaParallelStrings.custom
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelOptions extends js.Object {
  /**
    * regex or function used to determine if a reporter needs to only received aggregated events from the browser shards.
    * It is used to ensure coverage reporting is accurate amongst all the shards of a browser
    *  It is also useful for some programmatic reporters such as junit reporters that need to operate on a single set of test outputs and not once for each shard.
    * Set to null to disable aggregated reporting
    */
  var aggregatedReporterTest: js.UndefOr[(js.Function1[/* reporter */ js.Object, Boolean]) | RegExp | Null] = js.undefined
  /**
    * Custom function that will determine if a describe block should run in the current executor.
    * It is a function that is serialized and re-constructed on each executor.
    * The function will be called for every top level describe block and should return true if the describe block should run for a the current executor
    */
  var customShardStrategy: js.UndefOr[js.Function1[/* options */ ShardStrategOptions, Boolean]] = js.undefined
  /**
    * The number of browser instances to use to test.
    * If you test on multiple types of browsers, this spin up the number of executors for each browser type
    * @default cpu_cores-1
    */
  var executors: js.UndefOr[Double] = js.undefined
  /**
    * This plugin works by overriding the test suite describe() function.
    * When it encounters a describe, it must decide if it will skip the tests inside of it, or not
    * @default 'round-robin'
    */
  var shardStrategy: js.UndefOr[`round-robin` | `description-length` | custom] = js.undefined
}

object ParallelOptions {
  @scala.inline
  def apply(
    aggregatedReporterTest: (js.Function1[/* reporter */ js.Object, Boolean]) | RegExp = null,
    customShardStrategy: /* options */ ShardStrategOptions => Boolean = null,
    executors: Int | Double = null,
    shardStrategy: `round-robin` | `description-length` | custom = null
  ): ParallelOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregatedReporterTest != null) __obj.updateDynamic("aggregatedReporterTest")(aggregatedReporterTest.asInstanceOf[js.Any])
    if (customShardStrategy != null) __obj.updateDynamic("customShardStrategy")(js.Any.fromFunction1(customShardStrategy))
    if (executors != null) __obj.updateDynamic("executors")(executors.asInstanceOf[js.Any])
    if (shardStrategy != null) __obj.updateDynamic("shardStrategy")(shardStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelOptions]
  }
}

