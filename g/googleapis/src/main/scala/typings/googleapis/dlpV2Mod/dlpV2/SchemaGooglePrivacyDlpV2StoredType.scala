package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaGooglePrivacyDlpV2StoredType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredType]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2StoredTypeOps[Self <: SchemaGooglePrivacyDlpV2StoredType] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
