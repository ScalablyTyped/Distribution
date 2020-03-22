package typings.jupyterlabSettingregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: AnonTypeString
  var command: AnonTypeString
  var disabled: AnonDefault
  var keys: AnonMinItems
  var selector: AnonTypeString
}

object AnonArgs {
  @scala.inline
  def apply(
    args: AnonTypeString,
    command: AnonTypeString,
    disabled: AnonDefault,
    keys: AnonMinItems,
    selector: AnonTypeString
  ): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgs]
  }
}

