package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContentCategoriesListResponse extends StObject {
  
  /**
    * Content category collection.
    */
  var contentCategories: js.UndefOr[js.Array[SchemaContentCategory]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#contentCategoriesListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaContentCategoriesListResponse {
  
  inline def apply(): SchemaContentCategoriesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentCategoriesListResponse]
  }
  
  extension [Self <: SchemaContentCategoriesListResponse](x: Self) {
    
    inline def setContentCategories(value: js.Array[SchemaContentCategory]): Self = StObject.set(x, "contentCategories", value.asInstanceOf[js.Any])
    
    inline def setContentCategoriesUndefined: Self = StObject.set(x, "contentCategories", js.undefined)
    
    inline def setContentCategoriesVarargs(value: SchemaContentCategory*): Self = StObject.set(x, "contentCategories", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
