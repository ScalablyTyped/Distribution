package typings.jupyterlabSettingregistry.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: TypeString = js.native
  var command: TypeString = js.native
  var disabled: Default = js.native
  var keys: MinItems = js.native
  var selector: TypeString = js.native
}

object Args {
  @scala.inline
  def apply(args: TypeString, command: TypeString, disabled: Default, keys: MinItems, selector: TypeString): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgs(value: TypeString): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: TypeString): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Default): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeys(value: MinItems): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: TypeString): Self = this.set("selector", value.asInstanceOf[js.Any])
  }
  
}

