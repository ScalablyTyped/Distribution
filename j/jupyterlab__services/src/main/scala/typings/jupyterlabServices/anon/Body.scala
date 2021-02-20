package typings.jupyterlabServices.anon

import typings.jupyterlabServices.jupyterlabServicesStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends StObject {
  
  var body: js.UndefOr[js.Any] = js.native
  
  var command: String = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var request_seq: Double = js.native
  
  var seq: Double = js.native
  
  var success: Boolean = js.native
  
  var `type`: response = js.native
}
object Body {
  
  @scala.inline
  def apply(command: String, request_seq: Double, seq: Double, success: Boolean, `type`: response): Body = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setRequest_seq(value: Double): Self = StObject.set(x, "request_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: response): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
