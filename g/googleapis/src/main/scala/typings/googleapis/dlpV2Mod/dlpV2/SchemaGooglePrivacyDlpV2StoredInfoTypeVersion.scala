package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Version of a StoredInfoType, including the configuration used to build it,
  * create timestamp, and current state.
  */
@js.native
trait SchemaGooglePrivacyDlpV2StoredInfoTypeVersion extends js.Object {
  
  /**
    * StoredInfoType configuration.
    */
  var config: js.UndefOr[SchemaGooglePrivacyDlpV2StoredInfoTypeConfig] = js.native
  
  /**
    * Create timestamp of the version. Read-only, determined by the system when
    * the version is created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Errors that occurred when creating this storedInfoType version, or
    * anomalies detected in the storedInfoType data that render it unusable.
    * Only the five most recent errors will be displayed, with the most recent
    * error appearing first. &lt;p&gt;For example, some of the data for stored
    * custom dictionaries is put in the user&#39;s Google Cloud Storage bucket,
    * and if this data is modified or deleted by the user or another system,
    * the dictionary becomes invalid. &lt;p&gt;If any errors occur, fix the
    * problem indicated by the error message and use the UpdateStoredInfoType
    * API method to create another version of the storedInfoType to continue
    * using it, reusing the same `config` if it was not the source of the
    * error.
    */
  var errors: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Error]] = js.native
  
  /**
    * Stored info type version state. Read-only, updated by the system during
    * dictionary creation.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2StoredInfoTypeVersion {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2StoredInfoTypeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2StoredInfoTypeVersionOps[Self <: SchemaGooglePrivacyDlpV2StoredInfoTypeVersion] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: SchemaGooglePrivacyDlpV2StoredInfoTypeConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SchemaGooglePrivacyDlpV2Error*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[SchemaGooglePrivacyDlpV2Error]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
