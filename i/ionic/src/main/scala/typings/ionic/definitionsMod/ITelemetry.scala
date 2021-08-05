package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITelemetry extends StObject {
  
  def sendCommand(command: String, args: js.Array[String]): js.Promise[Unit]
}
object ITelemetry {
  
  inline def apply(sendCommand: (String, js.Array[String]) => js.Promise[Unit]): ITelemetry = {
    val __obj = js.Dynamic.literal(sendCommand = js.Any.fromFunction2(sendCommand))
    __obj.asInstanceOf[ITelemetry]
  }
  
  extension [Self <: ITelemetry](x: Self) {
    
    inline def setSendCommand(value: (String, js.Array[String]) => js.Promise[Unit]): Self = StObject.set(x, "sendCommand", js.Any.fromFunction2(value))
  }
}
