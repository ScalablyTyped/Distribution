package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  The List companies response object.
  */
@js.native
trait SchemaListCompaniesResponse extends js.Object {
  /**
    * Companies for the current client.
    */
  var companies: js.UndefOr[js.Array[SchemaCompany]] = js.native
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.native
  /**
    * A token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListCompaniesResponse {
  @scala.inline
  def apply(
    companies: js.Array[SchemaCompany] = null,
    metadata: SchemaResponseMetadata = null,
    nextPageToken: String = null
  ): SchemaListCompaniesResponse = {
    val __obj = js.Dynamic.literal()
    if (companies != null) __obj.updateDynamic("companies")(companies.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListCompaniesResponse]
  }
}

