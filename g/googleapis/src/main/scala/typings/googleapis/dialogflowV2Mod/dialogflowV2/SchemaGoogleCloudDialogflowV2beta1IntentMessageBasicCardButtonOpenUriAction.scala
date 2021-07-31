package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Opens the given URI.
  */
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction extends StObject {
  
  /**
    * Required. The HTTP or HTTPS scheme URI.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
