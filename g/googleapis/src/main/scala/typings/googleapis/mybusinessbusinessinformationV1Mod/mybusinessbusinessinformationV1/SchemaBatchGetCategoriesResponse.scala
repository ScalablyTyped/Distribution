package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchGetCategoriesResponse extends StObject {
  
  /**
    * Categories that match the GConcept ids provided in the request. They will not come in the same order as category ids in the request.
    */
  var categories: js.UndefOr[js.Array[SchemaCategory]] = js.undefined
}
object SchemaBatchGetCategoriesResponse {
  
  inline def apply(): SchemaBatchGetCategoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetCategoriesResponse]
  }
  
  extension [Self <: SchemaBatchGetCategoriesResponse](x: Self) {
    
    inline def setCategories(value: js.Array[SchemaCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: SchemaCategory*): Self = StObject.set(x, "categories", js.Array(value*))
  }
}
