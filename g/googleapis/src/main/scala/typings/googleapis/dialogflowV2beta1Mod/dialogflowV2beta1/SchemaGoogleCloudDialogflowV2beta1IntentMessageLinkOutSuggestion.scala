package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The suggestion chip message that allows the user to jump out to the app or
  * website associated with this agent.
  */
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion extends StObject {
  
  /**
    * Required. The name of the app or site this chip is linking to.
    */
  var destinationName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The URI of the app or site to open when the user taps the
    * suggestion chip.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
