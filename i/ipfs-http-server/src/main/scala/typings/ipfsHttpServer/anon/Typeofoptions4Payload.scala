package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions4Payload extends StObject {
  
  val payload: Typeofpayload
  
  val pre: js.Array[AssignStringMethod]
  
  val validate_2: Typeofvalidate2
}
object Typeofoptions4Payload {
  
  @scala.inline
  def apply(payload: Typeofpayload, pre: js.Array[AssignStringMethod], validate_2: Typeofvalidate2): Typeofoptions4Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], validate_2 = validate_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions4Payload]
  }
  
  @scala.inline
  implicit class Typeofoptions4PayloadMutableBuilder[Self <: Typeofoptions4Payload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Typeofpayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre(value: js.Array[AssignStringMethod]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreVarargs(value: AssignStringMethod*): Self = StObject.set(x, "pre", js.Array(value :_*))
    
    @scala.inline
    def setValidate_2(value: Typeofvalidate2): Self = StObject.set(x, "validate_2", value.asInstanceOf[js.Any])
  }
}
