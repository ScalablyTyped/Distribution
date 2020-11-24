package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Export advanced options
  */
@js.native
trait SchemaExportOptions extends js.Object {
  
  /**
    * Option available for Drive export.
    */
  var driveOptions: js.UndefOr[SchemaDriveExportOptions] = js.native
  
  /**
    * Option available for groups export.
    */
  var groupsOptions: js.UndefOr[SchemaGroupsExportOptions] = js.native
  
  /**
    * Option available for hangouts chat export.
    */
  var hangoutsChatOptions: js.UndefOr[SchemaHangoutsChatExportOptions] = js.native
  
  /**
    * Option available for mail export.
    */
  var mailOptions: js.UndefOr[SchemaMailExportOptions] = js.native
  
  /**
    * The requested export location.
    */
  var region: js.UndefOr[String] = js.native
}
object SchemaExportOptions {
  
  @scala.inline
  def apply(): SchemaExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportOptions]
  }
  
  @scala.inline
  implicit class SchemaExportOptionsOps[Self <: SchemaExportOptions] (val x: Self) extends AnyVal {
    
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
    def setDriveOptions(value: SchemaDriveExportOptions): Self = this.set("driveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveOptions: Self = this.set("driveOptions", js.undefined)
    
    @scala.inline
    def setGroupsOptions(value: SchemaGroupsExportOptions): Self = this.set("groupsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupsOptions: Self = this.set("groupsOptions", js.undefined)
    
    @scala.inline
    def setHangoutsChatOptions(value: SchemaHangoutsChatExportOptions): Self = this.set("hangoutsChatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHangoutsChatOptions: Self = this.set("hangoutsChatOptions", js.undefined)
    
    @scala.inline
    def setMailOptions(value: SchemaMailExportOptions): Self = this.set("mailOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailOptions: Self = this.set("mailOptions", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
