package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.WithResponse
import typings.mangopay2NodejsSdk.typingsModelsCardRegistrationMod.cardRegistration.CardRegistrationData
import typings.mangopay2NodejsSdk.typingsModelsCardRegistrationMod.cardRegistration.CreateCardRegistration
import typings.mangopay2NodejsSdk.typingsModelsCardRegistrationMod.cardRegistration.UpdateCardRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsServicesCardRegistrationsMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/CardRegistrations", "CardRegistrations")
  @js.native
  open class CardRegistrations () extends StObject {
    
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
      * View a card registration
      * @param cardRegistrationId
      * @param options
      */
    def get(data: String): js.Promise[CardRegistrationData] = js.native
    /**
      * View a card registration
      * @param cardRegistrationId
      * @param options
      */
    def get(data: String, callback: js.Function1[/* data */ CardRegistrationData, Unit]): Unit = js.native
    /**
      * View a card registration
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
      * View a card registration
      * @param cardRegistrationId
      * @param options
      */
    def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[CardRegistrationData]] = js.native
    def get(data: String, options: MethodOptionWithoutResponse): js.Promise[CardRegistrationData] = js.native
    /**
      * View a card registration
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
}
