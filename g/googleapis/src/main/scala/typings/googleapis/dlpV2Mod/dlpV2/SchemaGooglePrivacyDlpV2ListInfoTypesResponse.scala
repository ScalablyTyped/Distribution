package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to the ListInfoTypes request.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListInfoTypesResponse extends js.Object {
  /**
    * Set of sensitive infoTypes.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeDescription]] = js.native
}

object SchemaGooglePrivacyDlpV2ListInfoTypesResponse {
  @scala.inline
  def apply(infoTypes: js.Array[SchemaGooglePrivacyDlpV2InfoTypeDescription] = null): SchemaGooglePrivacyDlpV2ListInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (infoTypes != null) __obj.updateDynamic("infoTypes")(infoTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListInfoTypesResponse]
  }
}

