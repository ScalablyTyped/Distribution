package typings.jupyterlabServices.anon

import typings.jupyterlabServices.jupyterlabServicesStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arguments extends StObject {
  
  var arguments: js.UndefOr[Any] = js.undefined
  
  var command: String
  
  var seq: Double
  
  var `type`: request
}
object Arguments {
  
  inline def apply(command: String, seq: Double): Arguments = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[Arguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arguments] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    inline def setType(value: request): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
