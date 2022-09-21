package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2IntentMessage extends StObject {
  
  /**
    * The basic card response for Actions on Google.
    */
  var basicCard: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageBasicCard] = js.undefined
  
  /**
    * Browse carousel card for Actions on Google.
    */
  var browseCarouselCard: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCard] = js.undefined
  
  /**
    * The card response.
    */
  var card: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageCard] = js.undefined
  
  /**
    * The carousel card response for Actions on Google.
    */
  var carouselSelect: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect] = js.undefined
  
  /**
    * The image response.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageImage] = js.undefined
  
  /**
    * The link out suggestion chip for Actions on Google.
    */
  var linkOutSuggestion: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageLinkOutSuggestion] = js.undefined
  
  /**
    * The list card response for Actions on Google.
    */
  var listSelect: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageListSelect] = js.undefined
  
  /**
    * The media content card for Actions on Google.
    */
  var mediaContent: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageMediaContent] = js.undefined
  
  /**
    * A custom platform-specific response.
    */
  var payload: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Optional. The platform that this message is intended for.
    */
  var platform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The quick replies response.
    */
  var quickReplies: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies] = js.undefined
  
  /**
    * The voice and text-only responses for Actions on Google.
    */
  var simpleResponses: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses] = js.undefined
  
  /**
    * The suggestion chips for Actions on Google.
    */
  var suggestions: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageSuggestions] = js.undefined
  
  /**
    * Table card for Actions on Google.
    */
  var tableCard: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageTableCard] = js.undefined
  
  /**
    * The text response.
    */
  var text: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageText] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessage {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessage]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessage](x: Self) {
    
    inline def setBasicCard(value: SchemaGoogleCloudDialogflowV2IntentMessageBasicCard): Self = StObject.set(x, "basicCard", value.asInstanceOf[js.Any])
    
    inline def setBasicCardUndefined: Self = StObject.set(x, "basicCard", js.undefined)
    
    inline def setBrowseCarouselCard(value: SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCard): Self = StObject.set(x, "browseCarouselCard", value.asInstanceOf[js.Any])
    
    inline def setBrowseCarouselCardUndefined: Self = StObject.set(x, "browseCarouselCard", js.undefined)
    
    inline def setCard(value: SchemaGoogleCloudDialogflowV2IntentMessageCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setCarouselSelect(value: SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect): Self = StObject.set(x, "carouselSelect", value.asInstanceOf[js.Any])
    
    inline def setCarouselSelectUndefined: Self = StObject.set(x, "carouselSelect", js.undefined)
    
    inline def setImage(value: SchemaGoogleCloudDialogflowV2IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLinkOutSuggestion(value: SchemaGoogleCloudDialogflowV2IntentMessageLinkOutSuggestion): Self = StObject.set(x, "linkOutSuggestion", value.asInstanceOf[js.Any])
    
    inline def setLinkOutSuggestionUndefined: Self = StObject.set(x, "linkOutSuggestion", js.undefined)
    
    inline def setListSelect(value: SchemaGoogleCloudDialogflowV2IntentMessageListSelect): Self = StObject.set(x, "listSelect", value.asInstanceOf[js.Any])
    
    inline def setListSelectUndefined: Self = StObject.set(x, "listSelect", js.undefined)
    
    inline def setMediaContent(value: SchemaGoogleCloudDialogflowV2IntentMessageMediaContent): Self = StObject.set(x, "mediaContent", value.asInstanceOf[js.Any])
    
    inline def setMediaContentUndefined: Self = StObject.set(x, "mediaContent", js.undefined)
    
    inline def setPayload(value: StringDictionary[Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformNull: Self = StObject.set(x, "platform", null)
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setQuickReplies(value: SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
    
    inline def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
    
    inline def setSimpleResponses(value: SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    inline def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    inline def setSuggestions(value: SchemaGoogleCloudDialogflowV2IntentMessageSuggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    inline def setTableCard(value: SchemaGoogleCloudDialogflowV2IntentMessageTableCard): Self = StObject.set(x, "tableCard", value.asInstanceOf[js.Any])
    
    inline def setTableCardUndefined: Self = StObject.set(x, "tableCard", js.undefined)
    
    inline def setText(value: SchemaGoogleCloudDialogflowV2IntentMessageText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
