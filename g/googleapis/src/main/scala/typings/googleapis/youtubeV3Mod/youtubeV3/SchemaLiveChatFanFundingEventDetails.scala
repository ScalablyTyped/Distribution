package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatFanFundingEventDetails extends StObject {
  
  /**
    * A rendered string that displays the fund amount and currency to the user.
    */
  var amountDisplayString: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The amount of the fund.
    */
  var amountMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The currency in which the fund was made.
    */
  var currency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The comment added by the user to this fan funding event.
    */
  var userComment: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiveChatFanFundingEventDetails {
  
  inline def apply(): SchemaLiveChatFanFundingEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatFanFundingEventDetails]
  }
  
  extension [Self <: SchemaLiveChatFanFundingEventDetails](x: Self) {
    
    inline def setAmountDisplayString(value: String): Self = StObject.set(x, "amountDisplayString", value.asInstanceOf[js.Any])
    
    inline def setAmountDisplayStringNull: Self = StObject.set(x, "amountDisplayString", null)
    
    inline def setAmountDisplayStringUndefined: Self = StObject.set(x, "amountDisplayString", js.undefined)
    
    inline def setAmountMicros(value: String): Self = StObject.set(x, "amountMicros", value.asInstanceOf[js.Any])
    
    inline def setAmountMicrosNull: Self = StObject.set(x, "amountMicros", null)
    
    inline def setAmountMicrosUndefined: Self = StObject.set(x, "amountMicros", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setUserComment(value: String): Self = StObject.set(x, "userComment", value.asInstanceOf[js.Any])
    
    inline def setUserCommentNull: Self = StObject.set(x, "userComment", null)
    
    inline def setUserCommentUndefined: Self = StObject.set(x, "userComment", js.undefined)
  }
}
