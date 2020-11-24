package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.cardRegistration.CardRegistrationData
import typings.mangopay2NodejsSdk.mod.cardRegistration.CreateCardRegistration
import typings.mangopay2NodejsSdk.mod.cardRegistration.UpdateCardRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * You need to register a card in order to process a Direct PayIn. Card registration enables you to tokenize a Card. These are the steps to follow:
  *
  * 1. Create a CardRegistration Object
  * 2. Get a PreRegistrationData
  * 3. The user posts PreRegistrationData, AccessKey and card details through a form (PHP & JS samples) to the CardRegistrationURL (5. in the diagram)
  * 4. Get a RegistrationData back
  * 5. Edit the CardRegistration Object (POST method) with the RegistrationData just received
  * 6. Get the CardId ready to use into the Direct PayIn Object
  *
  * - If you don’t want to save the card you must change the field ACTIVE in the card object to false
  */
@JSImport("mangopay2-nodejs-sdk", "CardRegistrations")
@js.native
class CardRegistrations () extends js.Object {
  
  /**
    * Create new card registration
    * @param cardRegistration
    * @param options
    */
  def create(data: CreateCardRegistration): js.Promise[CardRegistrationData] = js.native
  /**
    * Create new card registration
    * @param cardRegistration
    * @param options
    */
  def create(data: CreateCardRegistration, callback: js.Function1[/* data */ CardRegistrationData, Unit]): Unit = js.native
  /**
    * Create new card registration
    * @param cardRegistration
    * @param options
    */
  def create(
    data: CreateCardRegistration,
    callback: js.Function1[/* data */ WithResponse[CardRegistrationData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def create(
    data: CreateCardRegistration,
    callback: js.Function1[/* data */ CardRegistrationData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create new card registration
    * @param cardRegistration
    * @param options
    */
  def create(data: CreateCardRegistration, options: MethodOptionWithResponse): js.Promise[WithResponse[CardRegistrationData]] = js.native
  def create(data: CreateCardRegistration, options: MethodOptionWithoutResponse): js.Promise[CardRegistrationData] = js.native
  /**
    * Create new card registration
    * @param cardRegistration
    * @param options
    */
  @JSName("create")
  var create_Original: MethodOverload[CreateCardRegistration, CardRegistrationData] = js.native
  
  /**
    * Create new card registration
    * @param cardRegistrationId
    * @param options
    */
  def get(data: String): js.Promise[CardRegistrationData] = js.native
  /**
    * Create new card registration
    * @param cardRegistrationId
    * @param options
    */
  def get(data: String, callback: js.Function1[/* data */ CardRegistrationData, Unit]): Unit = js.native
  /**
    * Create new card registration
    * @param cardRegistrationId
    * @param options
    */
  def get(
    data: String,
    callback: js.Function1[/* data */ WithResponse[CardRegistrationData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def get(
    data: String,
    callback: js.Function1[/* data */ CardRegistrationData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create new card registration
    * @param cardRegistrationId
    * @param options
    */
  def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[CardRegistrationData]] = js.native
  def get(data: String, options: MethodOptionWithoutResponse): js.Promise[CardRegistrationData] = js.native
  /**
    * Create new card registration
    * @param cardRegistrationId
    * @param options
    */
  @JSName("get")
  var get_Original: MethodOverload[String, CardRegistrationData] = js.native
  
  /**
    * Update card registration
    * @param  cardRegistration
    */
  def update(data: UpdateCardRegistration): js.Promise[CardRegistrationData] = js.native
  /**
    * Update card registration
    * @param  cardRegistration
    */
  def update(data: UpdateCardRegistration, callback: js.Function1[/* data */ CardRegistrationData, Unit]): Unit = js.native
  /**
    * Update card registration
    * @param  cardRegistration
    */
  def update(
    data: UpdateCardRegistration,
    callback: js.Function1[/* data */ WithResponse[CardRegistrationData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def update(
    data: UpdateCardRegistration,
    callback: js.Function1[/* data */ CardRegistrationData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Update card registration
    * @param  cardRegistration
    */
  def update(data: UpdateCardRegistration, options: MethodOptionWithResponse): js.Promise[WithResponse[CardRegistrationData]] = js.native
  def update(data: UpdateCardRegistration, options: MethodOptionWithoutResponse): js.Promise[CardRegistrationData] = js.native
  /**
    * Update card registration
    * @param  cardRegistration
    */
  @JSName("update")
  var update_Original: MethodOverload[UpdateCardRegistration, CardRegistrationData] = js.native
}
