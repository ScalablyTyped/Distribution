package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a StoredInfoType to use with scanning.
  */
@js.native
trait SchemaGooglePrivacyDlpV2StoredType extends js.Object {
  /**
    * Timestamp indicating when the version of the `StoredInfoType` used for
    * inspection was created. Output-only field, populated by the system.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Resource name of the requested `StoredInfoType`, for example
    * `organizations/433245324/storedInfoTypes/432452342` or
    * `projects/project-id/storedInfoTypes/432452342`.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2StoredType {
  @scala.inline
  def apply(createTime: String = null, name: String = null): SchemaGooglePrivacyDlpV2StoredType = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredType]
  }
}

