package typings.ioredis.mod

import typings.ioredis.anon.Lua
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commander extends StObject {
  
  def createBuiltinCommand(commandName: String): js.Object = js.native
  
  def defineCommand(name: String, definition: Lua): Unit = js.native
  
  def getBuiltinCommands(): js.Array[String] = js.native
  
  def sendCommand(): Unit = js.native
}
object Commander {
  
  @scala.inline
  def apply(
    createBuiltinCommand: String => js.Object,
    defineCommand: (String, Lua) => Unit,
    getBuiltinCommands: () => js.Array[String],
    sendCommand: () => Unit
  ): Commander = {
    val __obj = js.Dynamic.literal(createBuiltinCommand = js.Any.fromFunction1(createBuiltinCommand), defineCommand = js.Any.fromFunction2(defineCommand), getBuiltinCommands = js.Any.fromFunction0(getBuiltinCommands), sendCommand = js.Any.fromFunction0(sendCommand))
    __obj.asInstanceOf[Commander]
  }
  
  @scala.inline
  implicit class CommanderMutableBuilder[Self <: Commander] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateBuiltinCommand(value: String => js.Object): Self = StObject.set(x, "createBuiltinCommand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefineCommand(value: (String, Lua) => Unit): Self = StObject.set(x, "defineCommand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBuiltinCommands(value: () => js.Array[String]): Self = StObject.set(x, "getBuiltinCommands", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSendCommand(value: () => Unit): Self = StObject.set(x, "sendCommand", js.Any.fromFunction0(value))
  }
}
