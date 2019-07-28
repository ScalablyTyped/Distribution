package typings.jestDashCli

import typings.jestDashCli.jestDashCliMod.AggregatedResult
import typings.jestDashCli.jestDashCliMod.GlobalConfig
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
    val __obj = js.Dynamic.literal(globalConfig = globalConfig, results = results)
  
    __obj.asInstanceOf[Anon_GlobalConfig]
  }
}

