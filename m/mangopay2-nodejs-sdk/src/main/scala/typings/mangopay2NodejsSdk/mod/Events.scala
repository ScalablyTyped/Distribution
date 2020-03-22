package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.event.EventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "Events")
@js.native
class Events () extends js.Object {
  /**
    * Get events
    * @param options
    */
  @JSName("getAll")
  var getAll_Original: NoArgMethodOverload[js.Array[EventData]] = js.native
  /**
    * Get events
    * @param options
    */
  def getAll(): js.Promise[js.Array[EventData]] = js.native
  /**
    * Get events
    * @param options
    */
  def getAll(
    callback: js.Function1[
      (/* data */ js.Array[EventData]) | (/* data */ WithResponse[js.Array[EventData]]), 
      Unit
    ]
  ): Unit = js.native
  def getAll(
    callback: js.Function1[/* data */ WithResponse[js.Array[EventData]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getAll(callback: js.Function1[/* data */ js.Array[EventData], Unit], options: MethodOptionWithoutResponse): Unit = js.native
  /**
    * Get events
    * @param options
    */
  def getAll(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[EventData]]] = js.native
  def getAll(options: MethodOptionWithoutResponse): js.Promise[js.Array[EventData]] = js.native
}

