package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListStoredInfoTypes.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse extends js.Object {
  /**
    * If the next page is available then the next page token to be used in
    * following ListStoredInfoTypes request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
    */
  var storedInfoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2StoredInfoType]] = js.native
}

object SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    storedInfoTypes: js.Array[SchemaGooglePrivacyDlpV2StoredInfoType] = null
  ): SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (storedInfoTypes != null) __obj.updateDynamic("storedInfoTypes")(storedInfoTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse]
  }
}

