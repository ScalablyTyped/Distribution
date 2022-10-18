package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.WithResponse
import typings.mangopay2NodejsSdk.typingsModelsCardPreauthorizationMod.cardPreAuthorization.CardPreAuthorizationData
import typings.mangopay2NodejsSdk.typingsModelsCardPreauthorizationMod.cardPreAuthorization.CreateCardPreAuthorization
import typings.mangopay2NodejsSdk.typingsModelsCardPreauthorizationMod.cardPreAuthorization.UpdateCardPreAuthorization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsServicesCardPreauthorizationsMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/CardPreauthorizations", "CardPreAuthorizations")
  @js.native
  open class CardPreAuthorizations () extends StObject {
    
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
}
