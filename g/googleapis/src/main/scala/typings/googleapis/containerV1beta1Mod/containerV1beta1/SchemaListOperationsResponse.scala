package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListOperationsResponse extends StObject {
  
  /**
    * If any zones are listed here, the list of operations returned may be missing the operations from those zones.
    */
  var missingZones: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of operations in the project in the specified zone.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.undefined
}
object SchemaListOperationsResponse {
  
  inline def apply(): SchemaListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOperationsResponse]
  }
  
  extension [Self <: SchemaListOperationsResponse](x: Self) {
    
    inline def setMissingZones(value: js.Array[String]): Self = StObject.set(x, "missingZones", value.asInstanceOf[js.Any])
    
    inline def setMissingZonesNull: Self = StObject.set(x, "missingZones", null)
    
    inline def setMissingZonesUndefined: Self = StObject.set(x, "missingZones", js.undefined)
    
    inline def setMissingZonesVarargs(value: String*): Self = StObject.set(x, "missingZones", js.Array(value*))
    
    inline def setOperations(value: js.Array[SchemaOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: SchemaOperation*): Self = StObject.set(x, "operations", js.Array(value*))
  }
}
