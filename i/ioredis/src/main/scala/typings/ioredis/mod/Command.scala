package typings.ioredis.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends js.Object {
  
  var args: js.Array[ValueType] = js.native
  
  def getKeys(): js.Array[String | Buffer] = js.native
  
  def getSlot(): Double | Null = js.native
  
  var isCustomCommand: Boolean = js.native
}
object Command {
  
  @scala.inline
  def apply(
    args: js.Array[ValueType],
    getKeys: () => js.Array[String | Buffer],
    getSlot: () => Double | Null,
    isCustomCommand: Boolean
  ): Command = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], getKeys = js.Any.fromFunction0(getKeys), getSlot = js.Any.fromFunction0(getSlot), isCustomCommand = isCustomCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: ValueType*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[ValueType]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetKeys(value: () => js.Array[String | Buffer]): Self = this.set("getKeys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSlot(value: () => Double | Null): Self = this.set("getSlot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCustomCommand(value: Boolean): Self = this.set("isCustomCommand", value.asInstanceOf[js.Any])
  }
}
