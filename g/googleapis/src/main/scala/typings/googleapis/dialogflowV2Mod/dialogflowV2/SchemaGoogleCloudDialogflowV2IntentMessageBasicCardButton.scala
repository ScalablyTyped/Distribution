package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The button object that appears at the bottom of a card.
  */
trait SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton extends StObject {
  
  /**
    * Required. Action to take when a user taps on the button.
    */
  var openUriAction: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction] = js.undefined
  
  /**
    * Required. The title of the button.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton](x: Self) {
    
    inline def setOpenUriAction(value: SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction): Self = StObject.set(x, "openUriAction", value.asInstanceOf[js.Any])
    
    inline def setOpenUriActionUndefined: Self = StObject.set(x, "openUriAction", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
