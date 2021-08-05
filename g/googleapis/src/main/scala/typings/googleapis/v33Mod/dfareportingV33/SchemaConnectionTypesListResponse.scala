package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Connection Type List Response
  */
trait SchemaConnectionTypesListResponse extends StObject {
  
  /**
    * Collection of connection types such as broadband and mobile.
    */
  var connectionTypes: js.UndefOr[js.Array[SchemaConnectionType]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#connectionTypesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaConnectionTypesListResponse {
  
  inline def apply(): SchemaConnectionTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionTypesListResponse]
  }
  
  extension [Self <: SchemaConnectionTypesListResponse](x: Self) {
    
    inline def setConnectionTypes(value: js.Array[SchemaConnectionType]): Self = StObject.set(x, "connectionTypes", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypesUndefined: Self = StObject.set(x, "connectionTypes", js.undefined)
    
    inline def setConnectionTypesVarargs(value: SchemaConnectionType*): Self = StObject.set(x, "connectionTypes", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
