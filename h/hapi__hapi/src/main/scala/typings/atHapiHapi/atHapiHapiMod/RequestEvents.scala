package typings.atHapiHapi.atHapiHapiMod

import typings.atHapiHapi.atHapiHapiStrings.disconnect
import typings.atHapiHapi.atHapiHapiStrings.finish
import typings.atHapiHapi.atHapiHapiStrings.peek
import typings.atHapiPodium.atHapiPodiumMod.Podium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestEvents extends Podium {
  @JSName("on")
  def on_disconnect(criteria: disconnect, listener: js.Function1[/* data */ js.UndefOr[scala.Nothing], Unit]): Unit = js.native
  @JSName("on")
  def on_finish(criteria: finish, listener: js.Function1[/* data */ js.UndefOr[scala.Nothing], Unit]): Unit = js.native
  /**
    * Access: read only and the public podium interface.
    * The request.events supports the following events:
    * * 'peek' - emitted for each chunk of payload data read from the client connection. The event method signature is function(chunk, encoding).
    * * 'finish' - emitted when the request payload finished reading. The event method signature is function ().
    * * 'disconnect' - emitted when a request errors or aborts unexpectedly.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestevents)
    */
  @JSName("on")
  def on_peek(criteria: peek, listener: PeekListener): Unit = js.native
  @JSName("once")
  def once_disconnect(criteria: disconnect, listener: js.Function1[/* data */ js.UndefOr[scala.Nothing], Unit]): Unit = js.native
  @JSName("once")
  def once_finish(criteria: finish, listener: js.Function1[/* data */ js.UndefOr[scala.Nothing], Unit]): Unit = js.native
  /**
    * Access: read only and the public podium interface.
    * The request.events supports the following events:
    * * 'peek' - emitted for each chunk of payload data read from the client connection. The event method signature is function(chunk, encoding).
    * * 'finish' - emitted when the request payload finished reading. The event method signature is function ().
    * * 'disconnect' - emitted when a request errors or aborts unexpectedly.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestevents)
    */
  @JSName("once")
  def once_peek(criteria: peek, listener: PeekListener): Unit = js.native
}

