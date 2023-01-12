package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings extends StObject {
  
  /** If enabled, we will automatically exports conversations to Insights and Insights runs its analyzers. */
  var enableInsightsExport: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings {
  
  inline def apply(): GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings] (val x: Self) extends AnyVal {
    
    inline def setEnableInsightsExport(value: Boolean): Self = StObject.set(x, "enableInsightsExport", value.asInstanceOf[js.Any])
    
    inline def setEnableInsightsExportUndefined: Self = StObject.set(x, "enableInsightsExport", js.undefined)
  }
}
