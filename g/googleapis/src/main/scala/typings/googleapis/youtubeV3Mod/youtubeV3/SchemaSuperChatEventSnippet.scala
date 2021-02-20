package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSuperChatEventSnippet extends StObject {
  
  /**
    * The purchase amount, in micros of the purchase currency. e.g., 1 is
    * represented as 1000000.
    */
  var amountMicros: js.UndefOr[String] = js.native
  
  /**
    * Channel id where the event occurred.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * The text contents of the comment left by the user.
    */
  var commentText: js.UndefOr[String] = js.native
  
  /**
    * The date and time when the event occurred. The value is specified in ISO
    * 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var createdAt: js.UndefOr[String] = js.native
  
  /**
    * The currency in which the purchase was made. ISO 4217.
    */
  var currency: js.UndefOr[String] = js.native
  
  /**
    * A rendered string that displays the purchase amount and currency (e.g.,
    * &quot;$1.00&quot;). The string is rendered for the given language.
    */
  var displayString: js.UndefOr[String] = js.native
  
  /**
    * True if this event is a Super Chat for Good purchase.
    */
  var isSuperChatForGood: js.UndefOr[Boolean] = js.native
  
  /**
    * True if this event is a Super Sticker event.
    */
  var isSuperStickerEvent: js.UndefOr[Boolean] = js.native
  
  /**
    * The tier for the paid message, which is based on the amount of money
    * spent to purchase the message.
    */
  var messageType: js.UndefOr[Double] = js.native
  
  /**
    * If this event is a Super Chat for Good purchase, this field will contain
    * information about the charity the purchase is donated to.
    */
  var nonprofit: js.UndefOr[SchemaNonprofit] = js.native
  
  /**
    * If this event is a Super Sticker event, this field will contain metadata
    * about the Super Sticker.
    */
  var superStickerMetadata: js.UndefOr[SchemaSuperStickerMetadata] = js.native
  
  /**
    * Details about the supporter.
    */
  var supporterDetails: js.UndefOr[SchemaChannelProfileDetails] = js.native
}
object SchemaSuperChatEventSnippet {
  
  @scala.inline
  def apply(): SchemaSuperChatEventSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuperChatEventSnippet]
  }
  
  @scala.inline
  implicit class SchemaSuperChatEventSnippetMutableBuilder[Self <: SchemaSuperChatEventSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmountMicros(value: String): Self = StObject.set(x, "amountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountMicrosUndefined: Self = StObject.set(x, "amountMicros", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setCommentText(value: String): Self = StObject.set(x, "commentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentTextUndefined: Self = StObject.set(x, "commentText", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setDisplayString(value: String): Self = StObject.set(x, "displayString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayStringUndefined: Self = StObject.set(x, "displayString", js.undefined)
    
    @scala.inline
    def setIsSuperChatForGood(value: Boolean): Self = StObject.set(x, "isSuperChatForGood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuperChatForGoodUndefined: Self = StObject.set(x, "isSuperChatForGood", js.undefined)
    
    @scala.inline
    def setIsSuperStickerEvent(value: Boolean): Self = StObject.set(x, "isSuperStickerEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuperStickerEventUndefined: Self = StObject.set(x, "isSuperStickerEvent", js.undefined)
    
    @scala.inline
    def setMessageType(value: Double): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    @scala.inline
    def setNonprofit(value: SchemaNonprofit): Self = StObject.set(x, "nonprofit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonprofitUndefined: Self = StObject.set(x, "nonprofit", js.undefined)
    
    @scala.inline
    def setSuperStickerMetadata(value: SchemaSuperStickerMetadata): Self = StObject.set(x, "superStickerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperStickerMetadataUndefined: Self = StObject.set(x, "superStickerMetadata", js.undefined)
    
    @scala.inline
    def setSupporterDetails(value: SchemaChannelProfileDetails): Self = StObject.set(x, "supporterDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupporterDetailsUndefined: Self = StObject.set(x, "supporterDetails", js.undefined)
  }
}
