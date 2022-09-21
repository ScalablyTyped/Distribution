package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3CompareVersionsResponse extends StObject {
  
  /**
    * JSON representation of the base version content.
    */
  var baseVersionContentJson: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp when the two version compares.
    */
  var compareTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * JSON representation of the target version content.
    */
  var targetVersionContentJson: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3CompareVersionsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3CompareVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3CompareVersionsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3CompareVersionsResponse](x: Self) {
    
    inline def setBaseVersionContentJson(value: String): Self = StObject.set(x, "baseVersionContentJson", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionContentJsonNull: Self = StObject.set(x, "baseVersionContentJson", null)
    
    inline def setBaseVersionContentJsonUndefined: Self = StObject.set(x, "baseVersionContentJson", js.undefined)
    
    inline def setCompareTime(value: String): Self = StObject.set(x, "compareTime", value.asInstanceOf[js.Any])
    
    inline def setCompareTimeNull: Self = StObject.set(x, "compareTime", null)
    
    inline def setCompareTimeUndefined: Self = StObject.set(x, "compareTime", js.undefined)
    
    inline def setTargetVersionContentJson(value: String): Self = StObject.set(x, "targetVersionContentJson", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionContentJsonNull: Self = StObject.set(x, "targetVersionContentJson", null)
    
    inline def setTargetVersionContentJsonUndefined: Self = StObject.set(x, "targetVersionContentJson", js.undefined)
  }
}
