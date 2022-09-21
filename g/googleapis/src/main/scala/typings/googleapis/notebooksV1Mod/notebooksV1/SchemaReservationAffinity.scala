package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReservationAffinity extends StObject {
  
  /**
    * Optional. Type of reservation to consume
    */
  var consumeReservationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Corresponds to the label key of reservation resource.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Corresponds to the label values of reservation resource.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaReservationAffinity {
  
  inline def apply(): SchemaReservationAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservationAffinity]
  }
  
  extension [Self <: SchemaReservationAffinity](x: Self) {
    
    inline def setConsumeReservationType(value: String): Self = StObject.set(x, "consumeReservationType", value.asInstanceOf[js.Any])
    
    inline def setConsumeReservationTypeNull: Self = StObject.set(x, "consumeReservationType", null)
    
    inline def setConsumeReservationTypeUndefined: Self = StObject.set(x, "consumeReservationType", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
