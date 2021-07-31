package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatSuperChatDetails extends StObject {
  
  /**
    * A rendered string that displays the fund amount and currency to the user.
    */
  var amountDisplayString: js.UndefOr[String] = js.undefined
  
  /**
    * The amount purchased by the user, in micros (1,750,000 micros = 1.75).
    */
  var amountMicros: js.UndefOr[String] = js.undefined
  
  /**
    * The currency in which the purchase was made.
    */
  var currency: js.UndefOr[String] = js.undefined
  
  /**
    * The tier in which the amount belongs. Lower amounts belong to lower
    * tiers. The lowest tier is 1.
    */
  var tier: js.UndefOr[Double] = js.undefined
  
  /**
    * The comment added by the user to this Super Chat event.
    */
  var userComment: js.UndefOr[String] = js.undefined
}
object SchemaLiveChatSuperChatDetails {
  
  @scala.inline
  def apply(): SchemaLiveChatSuperChatDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatSuperChatDetails]
  }
  
  @scala.inline
  implicit class SchemaLiveChatSuperChatDetailsMutableBuilder[Self <: SchemaLiveChatSuperChatDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmountDisplayString(value: String): Self = StObject.set(x, "amountDisplayString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountDisplayStringUndefined: Self = StObject.set(x, "amountDisplayString", js.undefined)
    
    @scala.inline
    def setAmountMicros(value: String): Self = StObject.set(x, "amountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountMicrosUndefined: Self = StObject.set(x, "amountMicros", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setTier(value: Double): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    @scala.inline
    def setUserComment(value: String): Self = StObject.set(x, "userComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCommentUndefined: Self = StObject.set(x, "userComment", js.undefined)
  }
}
