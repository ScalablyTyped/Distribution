package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetrosListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#metrosListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metro collection.
    */
  var metros: js.UndefOr[js.Array[SchemaMetro]] = js.undefined
}
object SchemaMetrosListResponse {
  
  inline def apply(): SchemaMetrosListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetrosListResponse]
  }
  
  extension [Self <: SchemaMetrosListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetros(value: js.Array[SchemaMetro]): Self = StObject.set(x, "metros", value.asInstanceOf[js.Any])
    
    inline def setMetrosUndefined: Self = StObject.set(x, "metros", js.undefined)
    
    inline def setMetrosVarargs(value: SchemaMetro*): Self = StObject.set(x, "metros", js.Array(value*))
  }
}
