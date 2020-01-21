package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for a StoredInfoType.
  */
@js.native
trait SchemaGooglePrivacyDlpV2StoredInfoTypeConfig extends js.Object {
  /**
    * Description of the StoredInfoType (max 256 characters).
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Display name of the StoredInfoType (max 256 characters).
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * StoredInfoType where findings are defined by a dictionary of phrases.
    */
  var largeCustomDictionary: js.UndefOr[SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig] = js.native
}

object SchemaGooglePrivacyDlpV2StoredInfoTypeConfig {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    largeCustomDictionary: SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig = null
  ): SchemaGooglePrivacyDlpV2StoredInfoTypeConfig = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (largeCustomDictionary != null) __obj.updateDynamic("largeCustomDictionary")(largeCustomDictionary.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredInfoTypeConfig]
  }
}

