package typings.ionic.commandsConfigBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseConfigContext extends js.Object {
  var force: Boolean
  var json: Boolean
  var property: js.UndefOr[String] = js.undefined
  var root: Boolean
  var value: js.UndefOr[js.Any] = js.undefined
}

object BaseConfigContext {
  @scala.inline
  def apply(force: Boolean, json: Boolean, root: Boolean, property: String = null, value: js.Any = null): BaseConfigContext = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseConfigContext]
  }
}

