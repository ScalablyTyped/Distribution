package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Opens the given URI.
  */
trait SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction extends StObject {
  
  /**
    * Required. The HTTP or HTTPS scheme URI.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
