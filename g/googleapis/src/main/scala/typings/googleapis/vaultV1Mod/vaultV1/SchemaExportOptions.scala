package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Export advanced options
  */
@js.native
trait SchemaExportOptions extends StObject {
  
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
  implicit class SchemaExportOptionsMutableBuilder[Self <: SchemaExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveOptions(value: SchemaDriveExportOptions): Self = StObject.set(x, "driveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveOptionsUndefined: Self = StObject.set(x, "driveOptions", js.undefined)
    
    @scala.inline
    def setGroupsOptions(value: SchemaGroupsExportOptions): Self = StObject.set(x, "groupsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsOptionsUndefined: Self = StObject.set(x, "groupsOptions", js.undefined)
    
    @scala.inline
    def setHangoutsChatOptions(value: SchemaHangoutsChatExportOptions): Self = StObject.set(x, "hangoutsChatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangoutsChatOptionsUndefined: Self = StObject.set(x, "hangoutsChatOptions", js.undefined)
    
    @scala.inline
    def setMailOptions(value: SchemaMailExportOptions): Self = StObject.set(x, "mailOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailOptionsUndefined: Self = StObject.set(x, "mailOptions", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
