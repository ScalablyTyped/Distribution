package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofoptionsPayload extends StObject {
  
  val payload: Typeofpayload = js.native
  
  val pre: js.Array[Method] = js.native
  
  val validate: Typeofvalidate = js.native
}
object TypeofoptionsPayload {
  
  @scala.inline
  def apply(payload: Typeofpayload, pre: js.Array[Method], validate: Typeofvalidate): TypeofoptionsPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofoptionsPayload]
  }
  
  @scala.inline
  implicit class TypeofoptionsPayloadMutableBuilder[Self <: TypeofoptionsPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Typeofpayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre(value: js.Array[Method]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreVarargs(value: Method*): Self = StObject.set(x, "pre", js.Array(value :_*))
    
    @scala.inline
    def setValidate(value: Typeofvalidate): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
