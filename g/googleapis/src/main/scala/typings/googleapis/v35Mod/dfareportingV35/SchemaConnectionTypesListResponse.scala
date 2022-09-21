package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnectionTypesListResponse extends StObject {
  
  /**
    * Collection of connection types such as broadband and mobile.
    */
  var connectionTypes: js.UndefOr[js.Array[SchemaConnectionType]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#connectionTypesListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaConnectionTypesListResponse {
  
  inline def apply(): SchemaConnectionTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionTypesListResponse]
  }
  
  extension [Self <: SchemaConnectionTypesListResponse](x: Self) {
    
    inline def setConnectionTypes(value: js.Array[SchemaConnectionType]): Self = StObject.set(x, "connectionTypes", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypesUndefined: Self = StObject.set(x, "connectionTypes", js.undefined)
    
    inline def setConnectionTypesVarargs(value: SchemaConnectionType*): Self = StObject.set(x, "connectionTypes", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
