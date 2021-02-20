package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageQuickReplies extends StObject {
  
  /** Optional. The collection of quick replies. */
  var quickReplies: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. The title of the collection of quick replies. */
  var title: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageQuickReplies {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageQuickReplies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageQuickReplies]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageQuickReplies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuickReplies(value: js.Array[String]): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
    
    @scala.inline
    def setQuickRepliesVarargs(value: String*): Self = StObject.set(x, "quickReplies", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
