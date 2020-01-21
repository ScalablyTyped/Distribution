package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(annotationStores: js.Array[SchemaAnnotationStore] = null, nextPageToken: String = null): SchemaListAnnotationStoresResponse = {
    val __obj = js.Dynamic.literal()
    if (annotationStores != null) __obj.updateDynamic("annotationStores")(annotationStores.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAnnotationStoresResponse]
  }
}

