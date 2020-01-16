package typings.atHapiWreck.atHapiWreckMod.Client

import typings.atHapiBoom.atHapiBoomMod.Boom
import typings.atHapiWreck.Anon_ReqRes
import typings.atHapiWreck.atHapiWreckStrings.preRequest
import typings.atHapiWreck.atHapiWreckStrings.response
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends EventEmitter {
  @JSName("addListener")
  def addListener_preRequest(event: preRequest, litener: typings.atHapiWreck.atHapiWreckMod.Client.Events.preRequest): this.type = js.native
  @JSName("addListener")
  def addListener_request(
    event: typings.atHapiWreck.atHapiWreckStrings.request,
    listener: typings.atHapiWreck.atHapiWreckMod.Client.Events.request
  ): this.type = js.native
  @JSName("addListener")
  def addListener_response(event: response, listener: typings.atHapiWreck.atHapiWreckMod.Client.Events.response): this.type = js.native
  @JSName("on")
  def on_preRequest(event: preRequest, litener: typings.atHapiWreck.atHapiWreckMod.Client.Events.preRequest): this.type = js.native
  @JSName("on")
  def on_request(
    event: typings.atHapiWreck.atHapiWreckStrings.request,
    listener: typings.atHapiWreck.atHapiWreckMod.Client.Events.request
  ): this.type = js.native
  @JSName("on")
  def on_response(event: response, listener: typings.atHapiWreck.atHapiWreckMod.Client.Events.response): this.type = js.native
  @JSName("once")
  def once_preRequest(event: preRequest, litener: typings.atHapiWreck.atHapiWreckMod.Client.Events.preRequest): this.type = js.native
  @JSName("once")
  def once_request(
    event: typings.atHapiWreck.atHapiWreckStrings.request,
    listener: typings.atHapiWreck.atHapiWreckMod.Client.Events.request
  ): this.type = js.native
  @JSName("once")
  def once_response(event: response, listener: typings.atHapiWreck.atHapiWreckMod.Client.Events.response): this.type = js.native
}

@JSImport("@hapi/wreck", "Client.Events")
@js.native
object Events extends js.Object {
  type preRequest = js.Function2[/* uri */ String, /* options */ Options, Unit]
  type request = js.Function1[/* req */ ClientRequest, Unit]
  type response = js.Function2[/* err */ js.UndefOr[Boom[js.Any]], /* details */ Anon_ReqRes, Unit]
}

