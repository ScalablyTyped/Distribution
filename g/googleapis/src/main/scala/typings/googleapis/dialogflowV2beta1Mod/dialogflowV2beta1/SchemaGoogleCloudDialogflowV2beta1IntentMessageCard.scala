package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The card response message.
  */
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageCard extends StObject {
  
  /**
    * Optional. The collection of card buttons.
    */
  var buttons: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageCardButton]] = js.undefined
  
  /**
    * Optional. The public URI to an image file for the card.
    */
  var imageUri: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The subtitle of the card.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The title of the card.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageCard {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageCard]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageCardMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageCardButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageCardButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
