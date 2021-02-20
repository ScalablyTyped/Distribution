package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.CustomMessage
import typings.knuddelsUserappsApi.anon.NewKnuddelPayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/PaymentAccess.html
	 * @since AppServer 108571, ChatServer 108571
	 */
@JSGlobal("PaymentAccess")
@js.native
class PaymentAccess () extends StObject {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/PaymentAccess.html#method_requestKnuddelBuyBonusInfos
  		 * @since AppServer 20200403-191108, ChatServer 20200403-191108
  		 */
  def requestKnuddelBuyBonusInfos(
    user: User,
    callback: js.Function4[
      /* user */ User, 
      /* bonusEndTimestamp */ Double, 
      /* bonuses */ js.Array[NewKnuddelPayout], 
      /* result */ java.lang.String, 
      Unit
    ]
  ): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/PaymentAccess.html#method_startKnuddelPurchase
  		 * @since AppServer 108571, ChatServer 108571
  		 */
  def startKnuddelPurchase(user: User, amount: KnuddelAmount): Unit = js.native
  def startKnuddelPurchase(user: User, amount: KnuddelAmount, parameters: CustomMessage): Unit = js.native
}
