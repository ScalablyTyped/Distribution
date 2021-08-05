package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * City List Response
  */
trait SchemaCitiesListResponse extends StObject {
  
  /**
    * City collection.
    */
  var cities: js.UndefOr[js.Array[SchemaCity]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#citiesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaCitiesListResponse {
  
  inline def apply(): SchemaCitiesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCitiesListResponse]
  }
  
  extension [Self <: SchemaCitiesListResponse](x: Self) {
    
    inline def setCities(value: js.Array[SchemaCity]): Self = StObject.set(x, "cities", value.asInstanceOf[js.Any])
    
    inline def setCitiesUndefined: Self = StObject.set(x, "cities", js.undefined)
    
    inline def setCitiesVarargs(value: SchemaCity*): Self = StObject.set(x, "cities", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
