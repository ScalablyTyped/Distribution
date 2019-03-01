package typings
package jestDashCliLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GlobalConfig extends js.Object {
  var globalConfig: jestDashCliLib.jestDashCliMod.GlobalConfig
  var results: jestDashCliLib.jestDashCliMod.AggregatedResult
}

object Anon_GlobalConfig {
  @scala.inline
  def apply(
    globalConfig: jestDashCliLib.jestDashCliMod.GlobalConfig,
    results: jestDashCliLib.jestDashCliMod.AggregatedResult
  ): Anon_GlobalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("globalConfig")(globalConfig)
    __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[Anon_GlobalConfig]
  }
}

