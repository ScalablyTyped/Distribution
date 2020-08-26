package typings.luminoCommands.mod.CommandRegistry

import typings.luminoCommands.luminoCommandsStrings.added
import typings.luminoCommands.luminoCommandsStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `keyBindingChanged` signal.
  */
@js.native
trait IKeyBindingChangedArgs extends js.Object {
  /**
    * The key binding which was changed.
    */
  val binding: IKeyBinding = js.native
  /**
    * Whether the key binding was added or removed.
    */
  val `type`: added | removed = js.native
}

object IKeyBindingChangedArgs {
  @scala.inline
  def apply(binding: IKeyBinding, `type`: added | removed): IKeyBindingChangedArgs = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyBindingChangedArgs]
  }
  @scala.inline
  implicit class IKeyBindingChangedArgsOps[Self <: IKeyBindingChangedArgs] (val x: Self) extends AnyVal {
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
    def setBinding(value: IKeyBinding): Self = this.set("binding", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: added | removed): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

