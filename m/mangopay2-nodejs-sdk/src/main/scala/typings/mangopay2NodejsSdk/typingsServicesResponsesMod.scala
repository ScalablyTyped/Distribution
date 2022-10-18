package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.NoArgMethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.WithResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsServicesResponsesMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/Responses", "Responses")
  @js.native
  open class Responses () extends StObject {
    
    /**
      * Get response from previous call
      * @param options
      */
    def get(): js.Promise[js.Array[Any]] = js.native
    /**
      * Get response from previous call
      * @param options
      */
    def get(
      callback: js.Function1[(/* data */ js.Array[Any]) | (/* data */ WithResponse[js.Array[Any]]), Unit]
    ): Unit = js.native
    def get(
      callback: js.Function1[/* data */ WithResponse[js.Array[Any]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def get(callback: js.Function1[/* data */ js.Array[Any], Unit], options: MethodOptionWithoutResponse): Unit = js.native
    /**
      * Get response from previous call
      * @param options
      */
    def get(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[Any]]] = js.native
    def get(options: MethodOptionWithoutResponse): js.Promise[js.Array[Any]] = js.native
    /**
      * Get response from previous call
      * @param options
      */
    @JSName("get")
    var get_Original: NoArgMethodOverload[js.Array[Any]] = js.native
  }
}
