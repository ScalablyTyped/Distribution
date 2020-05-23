package typings.jestCore.anon

import typings.jestTestResult.typesMod.AggregatedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalConfig extends js.Object {
  var globalConfig: typings.jestTypes.configMod.GlobalConfig
  var results: AggregatedResult
}

object GlobalConfig {
  @scala.inline
  def apply(globalConfig: typings.jestTypes.configMod.GlobalConfig, results: AggregatedResult): GlobalConfig = {
    val __obj = js.Dynamic.literal(globalConfig = globalConfig.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfig]
  }
}

