package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommandChannel extends StObject {
  
  def onCommand(command: Command): js.Any
  
  def sendCommand(command: Command): Unit
}
object ICommandChannel {
  
  inline def apply(onCommand: Command => js.Any, sendCommand: Command => Unit): ICommandChannel = {
    val __obj = js.Dynamic.literal(onCommand = js.Any.fromFunction1(onCommand), sendCommand = js.Any.fromFunction1(sendCommand))
    __obj.asInstanceOf[ICommandChannel]
  }
  
  extension [Self <: ICommandChannel](x: Self) {
    
    inline def setOnCommand(value: Command => js.Any): Self = StObject.set(x, "onCommand", js.Any.fromFunction1(value))
    
    inline def setSendCommand(value: Command => Unit): Self = StObject.set(x, "sendCommand", js.Any.fromFunction1(value))
  }
}
