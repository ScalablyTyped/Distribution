package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The text response message.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageText extends StObject {
  
  /**
    * Optional. The collection of the agent&#39;s responses.
    */
  var text: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGoogleCloudDialogflowV2IntentMessageText {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageText]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageTextMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2IntentMessageText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
  }
}
