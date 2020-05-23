package typings.jupyterlabSettingregistry.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: TypeString
  var command: TypeString
  var disabled: Default
  var keys: MinItems
  var selector: TypeString
}

object Args {
  @scala.inline
  def apply(args: TypeString, command: TypeString, disabled: Default, keys: MinItems, selector: TypeString): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

