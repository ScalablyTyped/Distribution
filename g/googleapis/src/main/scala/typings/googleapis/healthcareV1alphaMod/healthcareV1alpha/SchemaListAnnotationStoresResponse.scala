package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the Annotation stores in the given dataset.
  */
@js.native
trait SchemaListAnnotationStoresResponse extends StObject {
  
  /**
    * The returned Annotation stores. Won&#39;t be more Annotation stores than
    * the value of page_size in the request.
    */
  var annotationStores: js.UndefOr[js.Array[SchemaAnnotationStore]] = js.native
  
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListAnnotationStoresResponse {
  
  @scala.inline
  def apply(): SchemaListAnnotationStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAnnotationStoresResponse]
  }
  
  @scala.inline
  implicit class SchemaListAnnotationStoresResponseMutableBuilder[Self <: SchemaListAnnotationStoresResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationStores(value: js.Array[SchemaAnnotationStore]): Self = StObject.set(x, "annotationStores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationStoresUndefined: Self = StObject.set(x, "annotationStores", js.undefined)
    
    @scala.inline
    def setAnnotationStoresVarargs(value: SchemaAnnotationStore*): Self = StObject.set(x, "annotationStores", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
