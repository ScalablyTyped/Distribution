package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommandChannel extends StObject {
  
  def onCommand(command: Command): Any
  
  def sendCommand(command: Command): Unit
}
object ICommandChannel {
  
  inline def apply(onCommand: Command => Any, sendCommand: Command => Unit): ICommandChannel = {
    val __obj = js.Dynamic.literal(onCommand = js.Any.fromFunction1(onCommand), sendCommand = js.Any.fromFunction1(sendCommand))
    __obj.asInstanceOf[ICommandChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICommandChannel] (val x: Self) extends AnyVal {
    
    inline def setOnCommand(value: Command => Any): Self = StObject.set(x, "onCommand", js.Any.fromFunction1(value))
    
    inline def setSendCommand(value: Command => Unit): Self = StObject.set(x, "sendCommand", js.Any.fromFunction1(value))
  }
}
