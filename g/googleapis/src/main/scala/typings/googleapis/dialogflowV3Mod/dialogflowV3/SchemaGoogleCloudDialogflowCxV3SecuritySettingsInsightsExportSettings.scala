package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings extends StObject {
  
  /**
    * If enabled, we will automatically exports conversations to Insights and Insights runs its analyzers.
    */
  var enableInsightsExport: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings](x: Self) {
    
    inline def setEnableInsightsExport(value: Boolean): Self = StObject.set(x, "enableInsightsExport", value.asInstanceOf[js.Any])
    
    inline def setEnableInsightsExportNull: Self = StObject.set(x, "enableInsightsExport", null)
    
    inline def setEnableInsightsExportUndefined: Self = StObject.set(x, "enableInsightsExport", js.undefined)
  }
}
