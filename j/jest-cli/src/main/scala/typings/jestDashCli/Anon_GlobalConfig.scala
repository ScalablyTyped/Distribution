package typings.jestDashCli

import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.atJestTypes.buildConfigMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GlobalConfig extends js.Object {
  var globalConfig: GlobalConfig
  var results: AggregatedResult
}

object Anon_GlobalConfig {
  @scala.inline
  def apply(globalConfig: GlobalConfig, results: AggregatedResult): Anon_GlobalConfig = {
    val __obj = js.Dynamic.literal(globalConfig = globalConfig.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GlobalConfig]
  }
}

