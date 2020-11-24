package typings.irc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessage extends js.Object {
  
  /** Command arguments */
  var args: js.Array[String] = js.native
  
  /** Mapped IRC command */
  var command: String = js.native
  
  /** Command type */
  var commandType: CommandType = js.native
  
  /** Prefix */
  var prefix: js.UndefOr[String] = js.native
  
  /** Raw IRC command */
  var rawCommand: String = js.native
}
object IMessage {
  
  @scala.inline
  def apply(args: js.Array[String], command: String, commandType: CommandType, rawCommand: String): IMessage = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], commandType = commandType.asInstanceOf[js.Any], rawCommand = rawCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
  
  @scala.inline
  implicit class IMessageOps[Self <: IMessage] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandType(value: CommandType): Self = this.set("commandType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawCommand(value: String): Self = this.set("rawCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
