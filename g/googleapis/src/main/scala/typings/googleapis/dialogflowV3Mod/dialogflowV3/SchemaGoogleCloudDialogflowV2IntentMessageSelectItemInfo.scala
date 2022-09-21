package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2IntentMessageSelectItemInfo extends StObject {
  
  /**
    * Required. A unique key that will be sent back to the agent if this response is given.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A list of synonyms that can also be used to trigger this item in dialog.
    */
  var synonyms: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageSelectItemInfo {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageSelectItemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageSelectItemInfo]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageSelectItemInfo](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsNull: Self = StObject.set(x, "synonyms", null)
    
    inline def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    inline def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value*))
  }
}
