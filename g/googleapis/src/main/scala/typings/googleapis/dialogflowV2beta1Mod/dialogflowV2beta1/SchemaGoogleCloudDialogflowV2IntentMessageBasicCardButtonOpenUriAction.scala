package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Opens the given URI.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction extends StObject {
  
  /**
    * Required. The HTTP or HTTPS scheme URI.
    */
  var uri: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
