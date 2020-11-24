package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.card.CardData
import typings.mangopay2NodejsSdk.mod.card.UpdateCard
import typings.mangopay2NodejsSdk.mod.cardPreAuthorization.CardPreAuthorizationData
import typings.mangopay2NodejsSdk.mod.transaction.TransactionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "Cards")
@js.native
class Cards () extends js.Object {
  
  /**
    * Get card
    * @param cardId
    * @param ptions
    */
  def get(data: String): js.Promise[CardData] = js.native
  /**
    * Get card
    * @param cardId
    * @param ptions
    */
  def get(data: String, callback: js.Function1[/* data */ CardData, Unit]): Unit = js.native
  /**
    * Get card
    * @param cardId
    * @param ptions
    */
  def get(
    data: String,
    callback: js.Function1[/* data */ WithResponse[CardData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def get(
    data: String,
    callback: js.Function1[/* data */ CardData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get card
    * @param cardId
    * @param ptions
    */
  def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[CardData]] = js.native
  def get(data: String, options: MethodOptionWithoutResponse): js.Promise[CardData] = js.native
  
  /**
    * Gets a list of cards having the same fingerprint.
    * The fingerprint is a hash uniquely generated per 16-digit card number.
    *
    * @param fingerprint The fingerprint hash
    */
  def getByFingerprint(data: String): js.Promise[js.Array[CardData]] = js.native
  /**
    * Gets a list of cards having the same fingerprint.
    * The fingerprint is a hash uniquely generated per 16-digit card number.
    *
    * @param fingerprint The fingerprint hash
    */
  def getByFingerprint(data: String, callback: js.Function1[/* data */ js.Array[CardData], Unit]): Unit = js.native
  /**
    * Gets a list of cards having the same fingerprint.
    * The fingerprint is a hash uniquely generated per 16-digit card number.
    *
    * @param fingerprint The fingerprint hash
    */
  def getByFingerprint(
    data: String,
    callback: js.Function1[/* data */ WithResponse[js.Array[CardData]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getByFingerprint(
    data: String,
    callback: js.Function1[/* data */ js.Array[CardData], Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Gets a list of cards having the same fingerprint.
    * The fingerprint is a hash uniquely generated per 16-digit card number.
    *
    * @param fingerprint The fingerprint hash
    */
  def getByFingerprint(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[CardData]]] = js.native
  def getByFingerprint(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[CardData]] = js.native
  /**
    * Gets a list of cards having the same fingerprint.
    * The fingerprint is a hash uniquely generated per 16-digit card number.
    *
    * @param fingerprint The fingerprint hash
    */
  @JSName("getByFingerprint")
  var getByFingerprint_Original: MethodOverload[String, js.Array[CardData]] = js.native
  
  /**
    * Gets list of PreAuthorizations of a Card.
    * @param cardId
    * @param options
    */
  def getPreAuthorizations(data: String): js.Promise[js.Array[CardPreAuthorizationData]] = js.native
  /**
    * Gets list of PreAuthorizations of a Card.
    * @param cardId
    * @param options
    */
  def getPreAuthorizations(data: String, callback: js.Function1[/* data */ js.Array[CardPreAuthorizationData], Unit]): Unit = js.native
  /**
    * Gets list of PreAuthorizations of a Card.
    * @param cardId
    * @param options
    */
  def getPreAuthorizations(
    data: String,
    callback: js.Function1[/* data */ WithResponse[js.Array[CardPreAuthorizationData]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getPreAuthorizations(
    data: String,
    callback: js.Function1[/* data */ js.Array[CardPreAuthorizationData], Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Gets list of PreAuthorizations of a Card.
    * @param cardId
    * @param options
    */
  def getPreAuthorizations(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[CardPreAuthorizationData]]] = js.native
  def getPreAuthorizations(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[CardPreAuthorizationData]] = js.native
  /**
    * Gets list of PreAuthorizations of a Card.
    * @param cardId
    * @param options
    */
  @JSName("getPreAuthorizations")
  var getPreAuthorizations_Original: MethodOverload[String, js.Array[CardPreAuthorizationData]] = js.native
  
  /**
    * Get list of Transactions of a Card
    * @param cardId
    * @param options
    */
  def getTransactions(data: String): js.Promise[js.Array[TransactionData]] = js.native
  /**
    * Get list of Transactions of a Card
    * @param cardId
    * @param options
    */
  def getTransactions(data: String, callback: js.Function1[/* data */ js.Array[TransactionData], Unit]): Unit = js.native
  /**
    * Get list of Transactions of a Card
    * @param cardId
    * @param options
    */
  def getTransactions(
    data: String,
    callback: js.Function1[/* data */ WithResponse[js.Array[TransactionData]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getTransactions(
    data: String,
    callback: js.Function1[/* data */ js.Array[TransactionData], Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get list of Transactions of a Card
    * @param cardId
    * @param options
    */
  def getTransactions(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[TransactionData]]] = js.native
  def getTransactions(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[TransactionData]] = js.native
  /**
    * Get list of Transactions of a Card
    * @param cardId
    * @param options
    */
  @JSName("getTransactions")
  var getTransactions_Original: MethodOverload[String, js.Array[TransactionData]] = js.native
  
  /**
    * Get card
    * @param cardId
    * @param ptions
    */
  @JSName("get")
  var get_Original: MethodOverload[String, CardData] = js.native
  
  /**
    * Update card (currently only supports deactivation)
    * @param card
    * @param options
    */
  def update(data: UpdateCard): js.Promise[CardData] = js.native
  /**
    * Update card (currently only supports deactivation)
    * @param card
    * @param options
    */
  def update(data: UpdateCard, callback: js.Function1[/* data */ CardData, Unit]): Unit = js.native
  /**
    * Update card (currently only supports deactivation)
    * @param card
    * @param options
    */
  def update(
    data: UpdateCard,
    callback: js.Function1[/* data */ WithResponse[CardData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def update(
    data: UpdateCard,
    callback: js.Function1[/* data */ CardData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Update card (currently only supports deactivation)
    * @param card
    * @param options
    */
  def update(data: UpdateCard, options: MethodOptionWithResponse): js.Promise[WithResponse[CardData]] = js.native
  def update(data: UpdateCard, options: MethodOptionWithoutResponse): js.Promise[CardData] = js.native
  /**
    * Update card (currently only supports deactivation)
    * @param card
    * @param options
    */
  @JSName("update")
  var update_Original: MethodOverload[UpdateCard, CardData] = js.native
}
