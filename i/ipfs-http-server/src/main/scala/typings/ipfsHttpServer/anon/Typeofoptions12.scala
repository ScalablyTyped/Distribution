package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions12 extends StObject {
  
  val payload_1: Typeofpayload1
  
  val pre_1: js.Array[AssignStringMethod]
  
  val validate_6: Typeofvalidate6
}
object Typeofoptions12 {
  
  @scala.inline
  def apply(payload_1: Typeofpayload1, pre_1: js.Array[AssignStringMethod], validate_6: Typeofvalidate6): Typeofoptions12 = {
    val __obj = js.Dynamic.literal(payload_1 = payload_1.asInstanceOf[js.Any], pre_1 = pre_1.asInstanceOf[js.Any], validate_6 = validate_6.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions12]
  }
  
  @scala.inline
  implicit class Typeofoptions12MutableBuilder[Self <: Typeofoptions12] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload_1(value: Typeofpayload1): Self = StObject.set(x, "payload_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre_1(value: js.Array[AssignStringMethod]): Self = StObject.set(x, "pre_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre_1Varargs(value: AssignStringMethod*): Self = StObject.set(x, "pre_1", js.Array(value :_*))
    
    @scala.inline
    def setValidate_6(value: Typeofvalidate6): Self = StObject.set(x, "validate_6", value.asInstanceOf[js.Any])
  }
}
