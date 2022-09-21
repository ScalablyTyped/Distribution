package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAnnotationStoresResponse extends StObject {
  
  /**
    * The returned Annotation stores. Won't be more Annotation stores than the value of page_size in the request.
    */
  var annotationStores: js.UndefOr[js.Array[SchemaAnnotationStore]] = js.undefined
  
  /**
    * Token to retrieve the next page of results or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAnnotationStoresResponse {
  
  inline def apply(): SchemaListAnnotationStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAnnotationStoresResponse]
  }
  
  extension [Self <: SchemaListAnnotationStoresResponse](x: Self) {
    
    inline def setAnnotationStores(value: js.Array[SchemaAnnotationStore]): Self = StObject.set(x, "annotationStores", value.asInstanceOf[js.Any])
    
    inline def setAnnotationStoresUndefined: Self = StObject.set(x, "annotationStores", js.undefined)
    
    inline def setAnnotationStoresVarargs(value: SchemaAnnotationStore*): Self = StObject.set(x, "annotationStores", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
