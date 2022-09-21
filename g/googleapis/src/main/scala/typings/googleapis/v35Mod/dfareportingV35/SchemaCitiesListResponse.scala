package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCitiesListResponse extends StObject {
  
  /**
    * City collection.
    */
  var cities: js.UndefOr[js.Array[SchemaCity]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#citiesListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaCitiesListResponse {
  
  inline def apply(): SchemaCitiesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCitiesListResponse]
  }
  
  extension [Self <: SchemaCitiesListResponse](x: Self) {
    
    inline def setCities(value: js.Array[SchemaCity]): Self = StObject.set(x, "cities", value.asInstanceOf[js.Any])
    
    inline def setCitiesUndefined: Self = StObject.set(x, "cities", js.undefined)
    
    inline def setCitiesVarargs(value: SchemaCity*): Self = StObject.set(x, "cities", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
