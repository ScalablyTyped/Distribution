package typings.karmaParallel.mod

import typings.karmaParallel.karmaParallelStrings.`description-length`
import typings.karmaParallel.karmaParallelStrings.`round-robin`
import typings.karmaParallel.karmaParallelStrings.custom
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParallelOptions extends js.Object {
  
  /**
    * regex or function used to determine if a reporter needs to only received aggregated events from the browser shards.
    * It is used to ensure coverage reporting is accurate amongst all the shards of a browser
    *  It is also useful for some programmatic reporters such as junit reporters that need to operate on a single set of test outputs and not once for each shard.
    * Set to null to disable aggregated reporting
    */
  var aggregatedReporterTest: js.UndefOr[(js.Function1[/* reporter */ js.Object, Boolean]) | RegExp | Null] = js.native
  
  /**
    * Custom function that will determine if a describe block should run in the current executor.
    * It is a function that is serialized and re-constructed on each executor.
    * The function will be called for every top level describe block and should return true if the describe block should run for a the current executor
    */
  var customShardStrategy: js.UndefOr[js.Function1[/* options */ ShardStrategOptions, Boolean]] = js.native
  
  /**
    * The number of browser instances to use to test.
    * If you test on multiple types of browsers, this spin up the number of executors for each browser type
    * @default cpu_cores-1
    */
  var executors: js.UndefOr[Double] = js.native
  
  /**
    * This plugin works by overriding the test suite describe() function.
    * When it encounters a describe, it must decide if it will skip the tests inside of it, or not
    * @default 'round-robin'
    */
  var shardStrategy: js.UndefOr[`round-robin` | `description-length` | custom] = js.native
}
object ParallelOptions {
  
  @scala.inline
  def apply(): ParallelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelOptions]
  }
  
  @scala.inline
  implicit class ParallelOptionsOps[Self <: ParallelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregatedReporterTestFunction1(value: /* reporter */ js.Object => Boolean): Self = this.set("aggregatedReporterTest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAggregatedReporterTest(value: (js.Function1[/* reporter */ js.Object, Boolean]) | RegExp): Self = this.set("aggregatedReporterTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregatedReporterTest: Self = this.set("aggregatedReporterTest", js.undefined)
    
    @scala.inline
    def setAggregatedReporterTestNull: Self = this.set("aggregatedReporterTest", null)
    
    @scala.inline
    def setCustomShardStrategy(value: /* options */ ShardStrategOptions => Boolean): Self = this.set("customShardStrategy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomShardStrategy: Self = this.set("customShardStrategy", js.undefined)
    
    @scala.inline
    def setExecutors(value: Double): Self = this.set("executors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutors: Self = this.set("executors", js.undefined)
    
    @scala.inline
    def setShardStrategy(value: `round-robin` | `description-length` | custom): Self = this.set("shardStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardStrategy: Self = this.set("shardStrategy", js.undefined)
  }
}
