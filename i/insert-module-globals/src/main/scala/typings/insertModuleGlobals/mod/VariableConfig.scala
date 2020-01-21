package typings.insertModuleGlobals.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableConfig extends js.Object {
  var id: String
  var source: String
  var suffix: js.UndefOr[String] = js.undefined
}

object VariableConfig {
  @scala.inline
  def apply(id: String, source: String, suffix: String = null): VariableConfig = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableConfig]
  }
}

