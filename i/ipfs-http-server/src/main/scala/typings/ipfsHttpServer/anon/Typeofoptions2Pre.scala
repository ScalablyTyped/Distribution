package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions2Pre extends StObject {
  
  val payload: Typeofpayload = js.native
  
  val pre: js.Array[AssignString] = js.native
  
  val validate_1: Typeofvalidate1 = js.native
}
object Typeofoptions2Pre {
  
  @scala.inline
  def apply(payload: Typeofpayload, pre: js.Array[AssignString], validate_1: Typeofvalidate1): Typeofoptions2Pre = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], validate_1 = validate_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions2Pre]
  }
  
  @scala.inline
  implicit class Typeofoptions2PreMutableBuilder[Self <: Typeofoptions2Pre] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Typeofpayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre(value: js.Array[AssignString]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreVarargs(value: AssignString*): Self = StObject.set(x, "pre", js.Array(value :_*))
    
    @scala.inline
    def setValidate_1(value: Typeofvalidate1): Self = StObject.set(x, "validate_1", value.asInstanceOf[js.Any])
  }
}
