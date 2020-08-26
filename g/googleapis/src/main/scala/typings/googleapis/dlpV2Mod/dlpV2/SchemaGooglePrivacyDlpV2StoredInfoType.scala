package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StoredInfoType resource message that contains information about the current
  * version and any pending updates.
  */
@js.native
trait SchemaGooglePrivacyDlpV2StoredInfoType extends js.Object {
  /**
    * Current version of the stored info type.
    */
  var currentVersion: js.UndefOr[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion] = js.native
  /**
    * Resource name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Pending versions of the stored info type. Empty if no versions are
    * pending.
    */
  var pendingVersions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion]] = js.native
}

object SchemaGooglePrivacyDlpV2StoredInfoType {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2StoredInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredInfoType]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2StoredInfoTypeOps[Self <: SchemaGooglePrivacyDlpV2StoredInfoType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentVersion(value: SchemaGooglePrivacyDlpV2StoredInfoTypeVersion): Self = this.set("currentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentVersion: Self = this.set("currentVersion", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPendingVersionsVarargs(value: SchemaGooglePrivacyDlpV2StoredInfoTypeVersion*): Self = this.set("pendingVersions", js.Array(value :_*))
    @scala.inline
    def setPendingVersions(value: js.Array[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion]): Self = this.set("pendingVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingVersions: Self = this.set("pendingVersions", js.undefined)
  }
  
}

