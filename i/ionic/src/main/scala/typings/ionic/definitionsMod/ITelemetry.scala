package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITelemetry extends StObject {
  
  def sendCommand(command: String, args: js.Array[String]): js.Promise[Unit] = js.native
}
object ITelemetry {
  
  @scala.inline
  def apply(sendCommand: (String, js.Array[String]) => js.Promise[Unit]): ITelemetry = {
    val __obj = js.Dynamic.literal(sendCommand = js.Any.fromFunction2(sendCommand))
    __obj.asInstanceOf[ITelemetry]
  }
  
  @scala.inline
  implicit class ITelemetryMutableBuilder[Self <: ITelemetry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSendCommand(value: (String, js.Array[String]) => js.Promise[Unit]): Self = StObject.set(x, "sendCommand", js.Any.fromFunction2(value))
  }
}
