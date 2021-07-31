package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.cardPreAuthorization.CardPreAuthorizationData
import typings.mangopay2NodejsSdk.mod.cardPreAuthorization.CreateCardPreAuthorization
import typings.mangopay2NodejsSdk.mod.cardPreAuthorization.UpdateCardPreAuthorization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The PreAuthorization Object ensures the solvency of a registered card for 7 days. The overall process is as follows:
  *
  * 1. Register a card (CardRegistration)
  * 2. Create a PreAuthorization with the CardId. This allows you to charge an amount on a card
  * 3. Charge the card through the PreAuthorized PayIn object (Payins/preauthorized/direct)
  *
  * How does PreAuthorization work?
  * - Once the PreAuthorization object is created the Status is "CREATED" until 3D secure validation.
  * - If the authorization is successful the status is "SUCCEEDED" if it failed the status is "FAILED".
  * - Once Status = "SUCCEEDED" and PaymentStatus = "WAITING" you can charge the card.
  * - The Pay-In amount has to be less than or equal to the amount authorized.
  */
@JSImport("mangopay2-nodejs-sdk", "CardPreAuthorizations")
@js.native
class CardPreAuthorizations () extends StObject {
  
  /**
    * Create new pre-authorization
    * @param cardPreAuthorization
    * @param options
    */
  def create(data: CreateCardPreAuthorization): js.Promise[CardPreAuthorizationData] = js.native
  /**
    * Create new pre-authorization
    * @param cardPreAuthorization
    * @param options
    */
  def create(
    data: CreateCardPreAuthorization,
    callback: js.Function1[/* data */ CardPreAuthorizationData, Unit]
  ): Unit = js.native
  /**
    * Create new pre-authorization
    * @param cardPreAuthorization
    * @param options
    */
  def create(
    data: CreateCardPreAuthorization,
    callback: js.Function1[/* data */ WithResponse[CardPreAuthorizationData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def create(
    data: CreateCardPreAuthorization,
    callback: js.Function1[/* data */ CardPreAuthorizationData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create new pre-authorization
    * @param cardPreAuthorization
    * @param options
    */
  def create(data: CreateCardPreAuthorization, options: MethodOptionWithResponse): js.Promise[WithResponse[CardPreAuthorizationData]] = js.native
  def create(data: CreateCardPreAuthorization, options: MethodOptionWithoutResponse): js.Promise[CardPreAuthorizationData] = js.native
  /**
    * Create new pre-authorization
    * @param cardPreAuthorization
    * @param options
    */
  @JSName("create")
  var create_Original: MethodOverload[CreateCardPreAuthorization, CardPreAuthorizationData] = js.native
  
  /**
    * Get data for Card pre-authorization
    * @param cardPreAuthorizationId
    * @param options
    */
  def get(data: String): js.Promise[CardPreAuthorizationData] = js.native
  /**
    * Get data for Card pre-authorization
    * @param cardPreAuthorizationId
    * @param options
    */
  def get(data: String, callback: js.Function1[/* data */ CardPreAuthorizationData, Unit]): Unit = js.native
  /**
    * Get data for Card pre-authorization
    * @param cardPreAuthorizationId
    * @param options
    */
  def get(
    data: String,
    callback: js.Function1[/* data */ WithResponse[CardPreAuthorizationData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def get(
    data: String,
    callback: js.Function1[/* data */ CardPreAuthorizationData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get data for Card pre-authorization
    * @param cardPreAuthorizationId
    * @param options
    */
  def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[CardPreAuthorizationData]] = js.native
  def get(data: String, options: MethodOptionWithoutResponse): js.Promise[CardPreAuthorizationData] = js.native
  /**
    * Get data for Card pre-authorization
    * @param cardPreAuthorizationId
    * @param options
    */
  @JSName("get")
  var get_Original: MethodOverload[String, CardPreAuthorizationData] = js.native
  
  /**
    * Update pre-authorization object (currently only supports cancellation)
    * @param  cardPreAuthorization
    */
  def update(data: UpdateCardPreAuthorization): js.Promise[CardPreAuthorizationData] = js.native
  /**
    * Update pre-authorization object (currently only supports cancellation)
    * @param  cardPreAuthorization
    */
  def update(
    data: UpdateCardPreAuthorization,
    callback: js.Function1[/* data */ CardPreAuthorizationData, Unit]
  ): Unit = js.native
  /**
    * Update pre-authorization object (currently only supports cancellation)
    * @param  cardPreAuthorization
    */
  def update(
    data: UpdateCardPreAuthorization,
    callback: js.Function1[/* data */ WithResponse[CardPreAuthorizationData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def update(
    data: UpdateCardPreAuthorization,
    callback: js.Function1[/* data */ CardPreAuthorizationData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Update pre-authorization object (currently only supports cancellation)
    * @param  cardPreAuthorization
    */
  def update(data: UpdateCardPreAuthorization, options: MethodOptionWithResponse): js.Promise[WithResponse[CardPreAuthorizationData]] = js.native
  def update(data: UpdateCardPreAuthorization, options: MethodOptionWithoutResponse): js.Promise[CardPreAuthorizationData] = js.native
  /**
    * Update pre-authorization object (currently only supports cancellation)
    * @param  cardPreAuthorization
    */
  @JSName("update")
  var update_Original: MethodOverload[UpdateCardPreAuthorization, CardPreAuthorizationData] = js.native
}
