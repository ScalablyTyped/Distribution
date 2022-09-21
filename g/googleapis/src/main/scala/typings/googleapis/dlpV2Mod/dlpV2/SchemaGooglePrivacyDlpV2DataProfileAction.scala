package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2DataProfileAction extends StObject {
  
  /**
    * Export data profiles into a provided location.
    */
  var exportData: js.UndefOr[SchemaGooglePrivacyDlpV2Export] = js.undefined
  
  /**
    * Publish a message into the Pub/Sub topic.
    */
  var pubSubNotification: js.UndefOr[SchemaGooglePrivacyDlpV2PubSubNotification] = js.undefined
}
object SchemaGooglePrivacyDlpV2DataProfileAction {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DataProfileAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DataProfileAction]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DataProfileAction](x: Self) {
    
    inline def setExportData(value: SchemaGooglePrivacyDlpV2Export): Self = StObject.set(x, "exportData", value.asInstanceOf[js.Any])
    
    inline def setExportDataUndefined: Self = StObject.set(x, "exportData", js.undefined)
    
    inline def setPubSubNotification(value: SchemaGooglePrivacyDlpV2PubSubNotification): Self = StObject.set(x, "pubSubNotification", value.asInstanceOf[js.Any])
    
    inline def setPubSubNotificationUndefined: Self = StObject.set(x, "pubSubNotification", js.undefined)
  }
}
