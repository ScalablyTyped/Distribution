package typings.mangopay2NodejsSdk.baseMod.base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FallbackReasonData extends StObject {
  
  var Code: String
  
  var Message: String
}
object FallbackReasonData {
  
  inline def apply(Code: String, Message: String): FallbackReasonData = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[FallbackReasonData]
  }
  
  extension [Self <: FallbackReasonData](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
  }
}
