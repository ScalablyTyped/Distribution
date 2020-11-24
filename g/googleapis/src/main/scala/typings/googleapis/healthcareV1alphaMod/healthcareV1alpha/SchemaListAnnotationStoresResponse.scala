package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the Annotation stores in the given dataset.
  */
@js.native
trait SchemaListAnnotationStoresResponse extends js.Object {
  
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
  implicit class SchemaListAnnotationStoresResponseOps[Self <: SchemaListAnnotationStoresResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotationStoresVarargs(value: SchemaAnnotationStore*): Self = this.set("annotationStores", js.Array(value :_*))
    
    @scala.inline
    def setAnnotationStores(value: js.Array[SchemaAnnotationStore]): Self = this.set("annotationStores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationStores: Self = this.set("annotationStores", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
