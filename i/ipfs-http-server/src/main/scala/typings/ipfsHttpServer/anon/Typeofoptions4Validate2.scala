package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions4Validate2 extends StObject {
  
  val payload: TypeofpayloadMaxBytes = js.native
  
  val validate_2: Typeofvalidate2 = js.native
}
object Typeofoptions4Validate2 {
  
  @scala.inline
  def apply(payload: TypeofpayloadMaxBytes, validate_2: Typeofvalidate2): Typeofoptions4Validate2 = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], validate_2 = validate_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions4Validate2]
  }
  
  @scala.inline
  implicit class Typeofoptions4Validate2MutableBuilder[Self <: Typeofoptions4Validate2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: TypeofpayloadMaxBytes): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate_2(value: Typeofvalidate2): Self = StObject.set(x, "validate_2", value.asInstanceOf[js.Any])
  }
}
