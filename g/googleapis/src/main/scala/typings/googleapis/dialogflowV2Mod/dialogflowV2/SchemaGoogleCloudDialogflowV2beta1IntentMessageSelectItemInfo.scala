package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional info about the select item for when it is triggered in a dialog.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo extends StObject {
  
  /**
    * Required. A unique key that will be sent back to the agent if this
    * response is given.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Optional. A list of synonyms that can also be used to trigger this item
    * in dialog.
    */
  var synonyms: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    @scala.inline
    def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
  }
}
