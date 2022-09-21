package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsignedType extends StObject {
  
  var age: js.UndefOr[Double] = js.undefined
  
  var redacted_because: js.UndefOr[RawEvent[EventContentTypeMessage, EventType]] = js.undefined
  
  var transaction_id: js.UndefOr[String] = js.undefined
}
object UnsignedType {
  
  inline def apply(): UnsignedType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsignedType]
  }
  
  extension [Self <: UnsignedType](x: Self) {
    
    inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setRedacted_because(value: RawEvent[EventContentTypeMessage, EventType]): Self = StObject.set(x, "redacted_because", value.asInstanceOf[js.Any])
    
    inline def setRedacted_becauseUndefined: Self = StObject.set(x, "redacted_because", js.undefined)
    
    inline def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
    
    inline def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
  }
}
