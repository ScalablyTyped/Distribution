package typings.atHapiWreck.atHapiWreckMod

import typings.atHapiWreck.atHapiWreckStrings.request
import typings.atHapiWreck.atHapiWreckStrings.response
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WreckEventEmitter extends EventEmitter {
  @JSName("on")
  def on_request(event: request, listener: RequestCallback): this.type = js.native
  @JSName("on")
  def on_response(event: response, listener: ResponseCallback): this.type = js.native
}

