package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCategoriesResponse extends StObject {
  
  /**
    * The matching categories based on the requested parameters.
    */
  var categories: js.UndefOr[js.Array[SchemaCategory]] = js.undefined
  
  /**
    * If the number of categories exceeded the requested page size, this field will be populated with a token to fetch the next page of categories on a subsequent call to `ListCategories`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCategoriesResponse {
  
  inline def apply(): SchemaListCategoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCategoriesResponse]
  }
  
  extension [Self <: SchemaListCategoriesResponse](x: Self) {
    
    inline def setCategories(value: js.Array[SchemaCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: SchemaCategory*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
