package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response from searching fact-checked claims.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse extends js.Object {
  /**
    * The list of claims and all of their associated information.
    */
  var claims: js.UndefOr[js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim]] = js.native
  /**
    * The next pagination token in the Search response. It should be used as
    * the `page_token` for the following request. An empty value means no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse {
  @scala.inline
  def apply(
    claims: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim] = null,
    nextPageToken: String = null
  ): SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse = {
    val __obj = js.Dynamic.literal()
    if (claims != null) __obj.updateDynamic("claims")(claims.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse]
  }
}

