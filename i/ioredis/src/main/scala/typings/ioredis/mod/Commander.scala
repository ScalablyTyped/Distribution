package typings.ioredis.mod

import typings.ioredis.anon.Lua
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commander extends StObject {
  
  def createBuiltinCommand(commandName: String): js.Object
  
  def defineCommand(name: String, definition: Lua): Unit
  
  def getBuiltinCommands(): js.Array[String]
  
  def sendCommand(): Unit
}
object Commander {
  
  inline def apply(
    createBuiltinCommand: String => js.Object,
    defineCommand: (String, Lua) => Unit,
    getBuiltinCommands: () => js.Array[String],
    sendCommand: () => Unit
  ): Commander = {
    val __obj = js.Dynamic.literal(createBuiltinCommand = js.Any.fromFunction1(createBuiltinCommand), defineCommand = js.Any.fromFunction2(defineCommand), getBuiltinCommands = js.Any.fromFunction0(getBuiltinCommands), sendCommand = js.Any.fromFunction0(sendCommand))
    __obj.asInstanceOf[Commander]
  }
  
  extension [Self <: Commander](x: Self) {
    
    inline def setCreateBuiltinCommand(value: String => js.Object): Self = StObject.set(x, "createBuiltinCommand", js.Any.fromFunction1(value))
    
    inline def setDefineCommand(value: (String, Lua) => Unit): Self = StObject.set(x, "defineCommand", js.Any.fromFunction2(value))
    
    inline def setGetBuiltinCommands(value: () => js.Array[String]): Self = StObject.set(x, "getBuiltinCommands", js.Any.fromFunction0(value))
    
    inline def setSendCommand(value: () => Unit): Self = StObject.set(x, "sendCommand", js.Any.fromFunction0(value))
  }
}
