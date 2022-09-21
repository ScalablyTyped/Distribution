package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSuperChatEventSnippet extends StObject {
  
  /**
    * The purchase amount, in micros of the purchase currency. e.g., 1 is represented as 1000000.
    */
  var amountMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Channel id where the event occurred.
    */
  var channelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The text contents of the comment left by the user.
    */
  var commentText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date and time when the event occurred.
    */
  var createdAt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The currency in which the purchase was made. ISO 4217.
    */
  var currency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A rendered string that displays the purchase amount and currency (e.g., "$1.00"). The string is rendered for the given language.
    */
  var displayString: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if this event is a Super Sticker event.
    */
  var isSuperStickerEvent: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The tier for the paid message, which is based on the amount of money spent to purchase the message.
    */
  var messageType: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If this event is a Super Sticker event, this field will contain metadata about the Super Sticker.
    */
  var superStickerMetadata: js.UndefOr[SchemaSuperStickerMetadata] = js.undefined
  
  /**
    * Details about the supporter.
    */
  var supporterDetails: js.UndefOr[SchemaChannelProfileDetails] = js.undefined
}
object SchemaSuperChatEventSnippet {
  
  inline def apply(): SchemaSuperChatEventSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuperChatEventSnippet]
  }
  
  extension [Self <: SchemaSuperChatEventSnippet](x: Self) {
    
    inline def setAmountMicros(value: String): Self = StObject.set(x, "amountMicros", value.asInstanceOf[js.Any])
    
    inline def setAmountMicrosNull: Self = StObject.set(x, "amountMicros", null)
    
    inline def setAmountMicrosUndefined: Self = StObject.set(x, "amountMicros", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setCommentText(value: String): Self = StObject.set(x, "commentText", value.asInstanceOf[js.Any])
    
    inline def setCommentTextNull: Self = StObject.set(x, "commentText", null)
    
    inline def setCommentTextUndefined: Self = StObject.set(x, "commentText", js.undefined)
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtNull: Self = StObject.set(x, "createdAt", null)
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDisplayString(value: String): Self = StObject.set(x, "displayString", value.asInstanceOf[js.Any])
    
    inline def setDisplayStringNull: Self = StObject.set(x, "displayString", null)
    
    inline def setDisplayStringUndefined: Self = StObject.set(x, "displayString", js.undefined)
    
    inline def setIsSuperStickerEvent(value: Boolean): Self = StObject.set(x, "isSuperStickerEvent", value.asInstanceOf[js.Any])
    
    inline def setIsSuperStickerEventNull: Self = StObject.set(x, "isSuperStickerEvent", null)
    
    inline def setIsSuperStickerEventUndefined: Self = StObject.set(x, "isSuperStickerEvent", js.undefined)
    
    inline def setMessageType(value: Double): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeNull: Self = StObject.set(x, "messageType", null)
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    inline def setSuperStickerMetadata(value: SchemaSuperStickerMetadata): Self = StObject.set(x, "superStickerMetadata", value.asInstanceOf[js.Any])
    
    inline def setSuperStickerMetadataUndefined: Self = StObject.set(x, "superStickerMetadata", js.undefined)
    
    inline def setSupporterDetails(value: SchemaChannelProfileDetails): Self = StObject.set(x, "supporterDetails", value.asInstanceOf[js.Any])
    
    inline def setSupporterDetailsUndefined: Self = StObject.set(x, "supporterDetails", js.undefined)
  }
}
