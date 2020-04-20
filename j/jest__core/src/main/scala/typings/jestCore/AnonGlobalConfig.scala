package typings.jestCore

import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlobalConfig extends js.Object {
  var globalConfig: GlobalConfig
  var results: AggregatedResult
}

object AnonGlobalConfig {
  @scala.inline
  def apply(globalConfig: GlobalConfig, results: AggregatedResult): AnonGlobalConfig = {
    val __obj = js.Dynamic.literal(globalConfig = globalConfig.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlobalConfig]
  }
}

