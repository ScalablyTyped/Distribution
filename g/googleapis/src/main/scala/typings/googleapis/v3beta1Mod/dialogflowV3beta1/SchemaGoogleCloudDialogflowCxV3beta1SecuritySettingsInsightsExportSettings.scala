package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettings extends StObject {
  
  /**
    * If enabled, we will automatically exports conversations to Insights and Insights runs its analyzers.
    */
  var enableInsightsExport: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettings {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettings]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettings](x: Self) {
    
    inline def setEnableInsightsExport(value: Boolean): Self = StObject.set(x, "enableInsightsExport", value.asInstanceOf[js.Any])
    
    inline def setEnableInsightsExportNull: Self = StObject.set(x, "enableInsightsExport", null)
    
    inline def setEnableInsightsExportUndefined: Self = StObject.set(x, "enableInsightsExport", js.undefined)
  }
}
