package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the FHIR stores in the given dataset.
  */
@js.native
trait SchemaListFhirStoresResponse extends js.Object {
  /**
    * The returned FHIR stores. Won&#39;t be more FHIR stores than the value of
    * page_size in the request.
    */
  var fhirStores: js.UndefOr[js.Array[SchemaFhirStore]] = js.native
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListFhirStoresResponse {
  @scala.inline
  def apply(fhirStores: js.Array[SchemaFhirStore] = null, nextPageToken: String = null): SchemaListFhirStoresResponse = {
    val __obj = js.Dynamic.literal()
    if (fhirStores != null) __obj.updateDynamic("fhirStores")(fhirStores.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListFhirStoresResponse]
  }
}

