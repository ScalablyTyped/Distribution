package typings.knuddelsUserappBackendApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/PaymentAccess.html
  * @since AppServer 108571, ChatServer 108571
  */
@JSGlobal("PaymentAccess")
@js.native
open class PaymentAccess () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/PaymentAccess.html#method_openKnuddelShop
    * @since AppServer 20210713-180000, ChatServer 20210713-180000
    */
  def openKnuddelShop(user: User): Unit = js.native
  def openKnuddelShop(user: User, transferReason: java.lang.String): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/PaymentAccess.html#method_requestKnuddelShops
    * @since AppServer 20210215-140000, ChatServer 20210215-140000
    */
  def requestKnuddelShops(
    user: User,
    callback: js.Function4[
      /* user */ User, 
      /* bonusEndTimestamp */ Double, 
      /* shops */ js.Array[KnuddelShop], 
      /* result */ java.lang.String, 
      Unit
    ]
  ): Unit = js.native
  
  def startKnuddelPurchase(user: User, productId: java.lang.String): Unit = js.native
  def startKnuddelPurchase(user: User, productId: java.lang.String, parameters: Any): Unit = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/PaymentAccess.html#method_startKnuddelPurchase
    * @since AppServer 20210315-162600, ChatServer 20210315-162600
    */
  def startKnuddelPurchase(user: User, productId: KnuddelAmount): Unit = js.native
  def startKnuddelPurchase(user: User, productId: KnuddelAmount, parameters: Any): Unit = js.native
}
