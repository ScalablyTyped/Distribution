package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1LogEntryOperation extends StObject {
  
  /**
    * Optional. Set this to True if this is the first log entry in the operation.
    */
  var first: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. An arbitrary operation identifier. Log entries with the same identifier are assumed to be part of the same operation.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Set this to True if this is the last log entry in the operation.
    */
  var last: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. An arbitrary producer identifier. The combination of `id` and `producer` must be globally unique. Examples for `producer`: `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
    */
  var producer: js.UndefOr[String | Null] = js.undefined
}
object SchemaV1LogEntryOperation {
  
  inline def apply(): SchemaV1LogEntryOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1LogEntryOperation]
  }
  
  extension [Self <: SchemaV1LogEntryOperation](x: Self) {
    
    inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setFirstNull: Self = StObject.set(x, "first", null)
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastNull: Self = StObject.set(x, "last", null)
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setProducer(value: String): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
    
    inline def setProducerNull: Self = StObject.set(x, "producer", null)
    
    inline def setProducerUndefined: Self = StObject.set(x, "producer", js.undefined)
  }
}
