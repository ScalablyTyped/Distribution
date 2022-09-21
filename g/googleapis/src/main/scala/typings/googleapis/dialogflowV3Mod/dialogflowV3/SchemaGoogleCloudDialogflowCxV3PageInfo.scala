package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3PageInfo extends StObject {
  
  /**
    * Always present for WebhookRequest. Ignored for WebhookResponse. The unique identifier of the current page. Format: `projects//locations//agents//flows//pages/`.
    */
  var currentPage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Always present for WebhookRequest. Ignored for WebhookResponse. The display name of the current page.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional for both WebhookRequest and WebhookResponse. Information about the form.
    */
  var formInfo: js.UndefOr[SchemaGoogleCloudDialogflowCxV3PageInfoFormInfo] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3PageInfo {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3PageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3PageInfo]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3PageInfo](x: Self) {
    
    inline def setCurrentPage(value: String): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageNull: Self = StObject.set(x, "currentPage", null)
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFormInfo(value: SchemaGoogleCloudDialogflowCxV3PageInfoFormInfo): Self = StObject.set(x, "formInfo", value.asInstanceOf[js.Any])
    
    inline def setFormInfoUndefined: Self = StObject.set(x, "formInfo", js.undefined)
  }
}
