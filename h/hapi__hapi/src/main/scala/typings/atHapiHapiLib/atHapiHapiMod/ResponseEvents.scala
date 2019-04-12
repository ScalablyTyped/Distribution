package typings
package atHapiHapiLib.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseEvents
  extends atHapiPodiumLib.atHapiPodiumMod.Podium {
  @JSName("on")
  def on_finish(
    criteria: atHapiHapiLib.atHapiHapiLibStrings.finish,
    listener: js.Function1[/* data */ js.UndefOr[scala.Nothing], scala.Unit]
  ): scala.Unit = js.native
  /**
    * 'peek' - emitted for each chunk of data written back to the client connection. The event method signature is function(chunk, encoding).
    * 'finish' - emitted when the response finished writing but before the client response connection is ended. The event method signature is function ().
    */
  @JSName("on")
  def on_peek(criteria: atHapiHapiLib.atHapiHapiLibStrings.peek, listener: PeekListener): scala.Unit = js.native
  @JSName("once")
  def once_finish(
    criteria: atHapiHapiLib.atHapiHapiLibStrings.finish,
    listener: js.Function1[/* data */ js.UndefOr[scala.Nothing], scala.Unit]
  ): scala.Unit = js.native
  /**
    * 'peek' - emitted for each chunk of data written back to the client connection. The event method signature is function(chunk, encoding).
    * 'finish' - emitted when the response finished writing but before the client response connection is ended. The event method signature is function ().
    */
  @JSName("once")
  def once_peek(criteria: atHapiHapiLib.atHapiHapiLibStrings.peek, listener: PeekListener): scala.Unit = js.native
}

