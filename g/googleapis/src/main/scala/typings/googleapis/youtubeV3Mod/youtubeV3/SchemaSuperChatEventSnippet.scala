package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSuperChatEventSnippet extends js.Object {
  
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
  implicit class SchemaSuperChatEventSnippetOps[Self <: SchemaSuperChatEventSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmountMicros(value: String): Self = this.set("amountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmountMicros: Self = this.set("amountMicros", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    
    @scala.inline
    def setCommentText(value: String): Self = this.set("commentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentText: Self = this.set("commentText", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setDisplayString(value: String): Self = this.set("displayString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayString: Self = this.set("displayString", js.undefined)
    
    @scala.inline
    def setIsSuperChatForGood(value: Boolean): Self = this.set("isSuperChatForGood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSuperChatForGood: Self = this.set("isSuperChatForGood", js.undefined)
    
    @scala.inline
    def setIsSuperStickerEvent(value: Boolean): Self = this.set("isSuperStickerEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSuperStickerEvent: Self = this.set("isSuperStickerEvent", js.undefined)
    
    @scala.inline
    def setMessageType(value: Double): Self = this.set("messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageType: Self = this.set("messageType", js.undefined)
    
    @scala.inline
    def setNonprofit(value: SchemaNonprofit): Self = this.set("nonprofit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonprofit: Self = this.set("nonprofit", js.undefined)
    
    @scala.inline
    def setSuperStickerMetadata(value: SchemaSuperStickerMetadata): Self = this.set("superStickerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuperStickerMetadata: Self = this.set("superStickerMetadata", js.undefined)
    
    @scala.inline
    def setSupporterDetails(value: SchemaChannelProfileDetails): Self = this.set("supporterDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupporterDetails: Self = this.set("supporterDetails", js.undefined)
  }
}
