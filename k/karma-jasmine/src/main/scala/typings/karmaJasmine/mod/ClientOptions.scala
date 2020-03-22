package typings.karmaJasmine.mod

import typings.karmaJasmine.EnvConfigurationtimeoutIn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var jasmine: js.UndefOr[EnvConfigurationtimeoutIn] = js.undefined
  /**
    * run a subset of the full set of specs.
    * Complete sharding support needs to be done in the process that calls karma,
    * and would need to support test result integration across shards.
    * See {@link https://github.com/karma-runner/karma-jasmine#sharding}
    *
    */
  var shardIndex: js.UndefOr[Double] = js.undefined
  /**
    * run a subset of the full set of specs.
    * Complete sharding support needs to be done in the process that calls karma,
    * and would need to support test result integration across shards.
    * See {@link https://github.com/karma-runner/karma-jasmine#sharding}
    */
  var totalShards: js.UndefOr[Double] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    jasmine: EnvConfigurationtimeoutIn = null,
    shardIndex: Int | Double = null,
    totalShards: Int | Double = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (jasmine != null) __obj.updateDynamic("jasmine")(jasmine.asInstanceOf[js.Any])
    if (shardIndex != null) __obj.updateDynamic("shardIndex")(shardIndex.asInstanceOf[js.Any])
    if (totalShards != null) __obj.updateDynamic("totalShards")(totalShards.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

