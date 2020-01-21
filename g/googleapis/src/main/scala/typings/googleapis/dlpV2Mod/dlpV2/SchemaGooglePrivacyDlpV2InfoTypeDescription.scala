package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InfoType description.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeDescription extends js.Object {
  /**
    * Description of the infotype. Translated when language is provided in the
    * request.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Human readable form of the infoType name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Internal name of the infoType.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Which parts of the API supports this InfoType.
    */
  var supportedBy: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGooglePrivacyDlpV2InfoTypeDescription {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    name: String = null,
    supportedBy: js.Array[String] = null
  ): SchemaGooglePrivacyDlpV2InfoTypeDescription = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (supportedBy != null) __obj.updateDynamic("supportedBy")(supportedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeDescription]
  }
}

