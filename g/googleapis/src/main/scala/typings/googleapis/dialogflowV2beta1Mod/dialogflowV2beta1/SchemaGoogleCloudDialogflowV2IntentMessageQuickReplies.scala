package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The quick replies response message.
  */
trait SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies extends StObject {
  
  /**
    * Optional. The collection of quick replies.
    */
  var quickReplies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The title of the collection of quick replies.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies](x: Self) {
    
    inline def setQuickReplies(value: js.Array[String]): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
    
    inline def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
    
    inline def setQuickRepliesVarargs(value: String*): Self = StObject.set(x, "quickReplies", js.Array(value :_*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
