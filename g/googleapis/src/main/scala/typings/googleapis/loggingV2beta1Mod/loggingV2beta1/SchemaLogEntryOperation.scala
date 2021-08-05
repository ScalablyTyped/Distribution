package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional information about a potentially long-running operation with
  * which a log entry is associated.
  */
trait SchemaLogEntryOperation extends StObject {
  
  /**
    * Optional. Set this to True if this is the first log entry in the
    * operation.
    */
  var first: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. An arbitrary operation identifier. Log entries with the same
    * identifier are assumed to be part of the same operation.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Set this to True if this is the last log entry in the
    * operation.
    */
  var last: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. An arbitrary producer identifier. The combination of id and
    * producer must be globally unique. Examples for producer:
    * &quot;MyDivision.MyBigCompany.com&quot;,
    * &quot;github.com/MyProject/MyApplication&quot;.
    */
  var producer: js.UndefOr[String] = js.undefined
}
object SchemaLogEntryOperation {
  
  inline def apply(): SchemaLogEntryOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogEntryOperation]
  }
  
  extension [Self <: SchemaLogEntryOperation](x: Self) {
    
    inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setProducer(value: String): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
    
    inline def setProducerUndefined: Self = StObject.set(x, "producer", js.undefined)
  }
}
