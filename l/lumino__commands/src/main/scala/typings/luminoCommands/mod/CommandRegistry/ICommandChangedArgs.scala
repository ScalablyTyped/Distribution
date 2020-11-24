package typings.luminoCommands.mod.CommandRegistry

import typings.luminoCommands.luminoCommandsStrings.`many-changed`
import typings.luminoCommands.luminoCommandsStrings.added
import typings.luminoCommands.luminoCommandsStrings.changed
import typings.luminoCommands.luminoCommandsStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An arguments object for the `commandChanged` signal.
  */
@js.native
trait ICommandChangedArgs extends js.Object {
  
  /**
    * The id of the associated command.
    *
    * This will be `undefined` when the type is `'many-changed'`.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * Whether the command was added, removed, or changed.
    */
  val `type`: added | removed | changed | `many-changed` = js.native
}
object ICommandChangedArgs {
  
  @scala.inline
  def apply(`type`: added | removed | changed | `many-changed`): ICommandChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandChangedArgs]
  }
  
  @scala.inline
  implicit class ICommandChangedArgsOps[Self <: ICommandChangedArgs] (val x: Self) extends AnyVal {
    
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
    def setType(value: added | removed | changed | `many-changed`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
