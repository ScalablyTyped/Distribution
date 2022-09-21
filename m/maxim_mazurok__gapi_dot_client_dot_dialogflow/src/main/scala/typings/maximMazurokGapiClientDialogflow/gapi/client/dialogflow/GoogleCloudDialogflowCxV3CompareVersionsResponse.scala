package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3CompareVersionsResponse extends StObject {
  
  /** JSON representation of the base version content. */
  var baseVersionContentJson: js.UndefOr[String] = js.undefined
  
  /** The timestamp when the two version compares. */
  var compareTime: js.UndefOr[String] = js.undefined
  
  /** JSON representation of the target version content. */
  var targetVersionContentJson: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3CompareVersionsResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3CompareVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3CompareVersionsResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3CompareVersionsResponse](x: Self) {
    
    inline def setBaseVersionContentJson(value: String): Self = StObject.set(x, "baseVersionContentJson", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionContentJsonUndefined: Self = StObject.set(x, "baseVersionContentJson", js.undefined)
    
    inline def setCompareTime(value: String): Self = StObject.set(x, "compareTime", value.asInstanceOf[js.Any])
    
    inline def setCompareTimeUndefined: Self = StObject.set(x, "compareTime", js.undefined)
    
    inline def setTargetVersionContentJson(value: String): Self = StObject.set(x, "targetVersionContentJson", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionContentJsonUndefined: Self = StObject.set(x, "targetVersionContentJson", js.undefined)
  }
}
