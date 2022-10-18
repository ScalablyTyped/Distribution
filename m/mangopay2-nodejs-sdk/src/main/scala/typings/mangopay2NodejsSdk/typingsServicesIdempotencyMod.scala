package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.WithResponse
import typings.mangopay2NodejsSdk.typingsModelsIdempotencyMod.idempotency.IdempotencyData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsServicesIdempotencyMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/Idempotency", "Idempotency")
  @js.native
  open class Idempotency () extends StObject {
    
    def get(data: String): js.Promise[IdempotencyData] = js.native
    def get(data: String, callback: js.Function1[/* data */ IdempotencyData, Unit]): Unit = js.native
    def get(
      data: String,
      callback: js.Function1[/* data */ WithResponse[IdempotencyData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def get(
      data: String,
      callback: js.Function1[/* data */ IdempotencyData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[IdempotencyData]] = js.native
    def get(data: String, options: MethodOptionWithoutResponse): js.Promise[IdempotencyData] = js.native
    @JSName("get")
    var get_Original: MethodOverload[String, IdempotencyData] = js.native
  }
}
