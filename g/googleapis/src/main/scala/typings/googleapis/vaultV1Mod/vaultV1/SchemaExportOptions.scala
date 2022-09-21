package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExportOptions extends StObject {
  
  /**
    * Options for Drive exports.
    */
  var driveOptions: js.UndefOr[SchemaDriveExportOptions] = js.undefined
  
  /**
    * Options for Groups exports.
    */
  var groupsOptions: js.UndefOr[SchemaGroupsExportOptions] = js.undefined
  
  /**
    * Options for Chat exports.
    */
  var hangoutsChatOptions: js.UndefOr[SchemaHangoutsChatExportOptions] = js.undefined
  
  /**
    * Options for Gmail exports.
    */
  var mailOptions: js.UndefOr[SchemaMailExportOptions] = js.undefined
  
  /**
    * The requested data region for the export.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Options for Voice exports.
    */
  var voiceOptions: js.UndefOr[SchemaVoiceExportOptions] = js.undefined
}
object SchemaExportOptions {
  
  inline def apply(): SchemaExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportOptions]
  }
  
  extension [Self <: SchemaExportOptions](x: Self) {
    
    inline def setDriveOptions(value: SchemaDriveExportOptions): Self = StObject.set(x, "driveOptions", value.asInstanceOf[js.Any])
    
    inline def setDriveOptionsUndefined: Self = StObject.set(x, "driveOptions", js.undefined)
    
    inline def setGroupsOptions(value: SchemaGroupsExportOptions): Self = StObject.set(x, "groupsOptions", value.asInstanceOf[js.Any])
    
    inline def setGroupsOptionsUndefined: Self = StObject.set(x, "groupsOptions", js.undefined)
    
    inline def setHangoutsChatOptions(value: SchemaHangoutsChatExportOptions): Self = StObject.set(x, "hangoutsChatOptions", value.asInstanceOf[js.Any])
    
    inline def setHangoutsChatOptionsUndefined: Self = StObject.set(x, "hangoutsChatOptions", js.undefined)
    
    inline def setMailOptions(value: SchemaMailExportOptions): Self = StObject.set(x, "mailOptions", value.asInstanceOf[js.Any])
    
    inline def setMailOptionsUndefined: Self = StObject.set(x, "mailOptions", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setVoiceOptions(value: SchemaVoiceExportOptions): Self = StObject.set(x, "voiceOptions", value.asInstanceOf[js.Any])
    
    inline def setVoiceOptionsUndefined: Self = StObject.set(x, "voiceOptions", js.undefined)
  }
}
