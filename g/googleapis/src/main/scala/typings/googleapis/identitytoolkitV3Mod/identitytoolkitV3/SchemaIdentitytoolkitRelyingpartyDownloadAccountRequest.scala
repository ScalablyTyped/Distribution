package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to download user account in batch.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest extends js.Object {
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  /**
    * The max number of results to return in the response.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The token for the next page. This should be taken from the previous
    * response.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Specify which project (field value is actually project id) to operate.
    * Only used when provided credential.
    */
  var targetProjectId: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest {
  @scala.inline
  def apply(
    delegatedProjectNumber: String = null,
    maxResults: Int | Double = null,
    nextPageToken: String = null,
    targetProjectId: String = null
  ): SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (targetProjectId != null) __obj.updateDynamic("targetProjectId")(targetProjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest]
  }
}

