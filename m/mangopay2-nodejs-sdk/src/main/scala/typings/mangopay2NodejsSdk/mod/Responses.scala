package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "Responses")
@js.native
class Responses () extends js.Object {
  
  /**
    * Get response from previous call
    * @param options
    */
  def get(): js.Promise[js.Array[_]] = js.native
  /**
    * Get response from previous call
    * @param options
    */
  def get(callback: js.Function1[(/* data */ js.Array[_]) | (/* data */ WithResponse[js.Array[_]]), Unit]): Unit = js.native
  def get(
    callback: js.Function1[/* data */ WithResponse[js.Array[_]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def get(callback: js.Function1[/* data */ js.Array[_], Unit], options: MethodOptionWithoutResponse): Unit = js.native
  /**
    * Get response from previous call
    * @param options
    */
  def get(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[_]]] = js.native
  def get(options: MethodOptionWithoutResponse): js.Promise[js.Array[_]] = js.native
  /**
    * Get response from previous call
    * @param options
    */
  @JSName("get")
  var get_Original: NoArgMethodOverload[js.Array[_]] = js.native
}
