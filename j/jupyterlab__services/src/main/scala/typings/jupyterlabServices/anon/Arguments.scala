package typings.jupyterlabServices.anon

import typings.jupyterlabServices.jupyterlabServicesStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arguments extends StObject {
  
  var arguments: js.UndefOr[js.Any] = js.native
  
  var command: String = js.native
  
  var seq: Double = js.native
  
  var `type`: request = js.native
}
object Arguments {
  
  @scala.inline
  def apply(command: String, seq: Double, `type`: request): Arguments = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arguments]
  }
  
  @scala.inline
  implicit class ArgumentsMutableBuilder[Self <: Arguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: request): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
