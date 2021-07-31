package typings.mangopay2NodejsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "Responses")
@js.native
class Responses () extends StObject {
  
  /**
    * Get response from previous call
    * @param options
    */
  def get(): js.Promise[js.Array[js.Any]] = js.native
  /**
    * Get response from previous call
    * @param options
    */
  def get(
    callback: js.Function1[(/* data */ js.Array[js.Any]) | (/* data */ WithResponse[js.Array[js.Any]]), Unit]
  ): Unit = js.native
  def get(
    callback: js.Function1[/* data */ WithResponse[js.Array[js.Any]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def get(callback: js.Function1[/* data */ js.Array[js.Any], Unit], options: MethodOptionWithoutResponse): Unit = js.native
  /**
    * Get response from previous call
    * @param options
    */
  def get(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[js.Any]]] = js.native
  def get(options: MethodOptionWithoutResponse): js.Promise[js.Array[js.Any]] = js.native
  /**
    * Get response from previous call
    * @param options
    */
  @JSName("get")
  var get_Original: NoArgMethodOverload[js.Array[js.Any]] = js.native
}
