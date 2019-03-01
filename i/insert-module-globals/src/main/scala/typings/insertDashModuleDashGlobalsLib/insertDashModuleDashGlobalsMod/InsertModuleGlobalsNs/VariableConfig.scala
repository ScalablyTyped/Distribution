package typings
package insertDashModuleDashGlobalsLib.insertDashModuleDashGlobalsMod.InsertModuleGlobalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableConfig extends js.Object {
  var id: java.lang.String
  var source: java.lang.String
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

object VariableConfig {
  @scala.inline
  def apply(id: java.lang.String, source: java.lang.String, suffix: java.lang.String = null): VariableConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("source")(source)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[VariableConfig]
  }
}

