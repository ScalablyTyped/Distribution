package typings
package atHapiWreckLib.atHapiWreckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WreckEventEmitter
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("on")
  def on_request(event: atHapiWreckLib.atHapiWreckLibStrings.request, listener: atHapiWreckLib.RequestCallback): this.type = js.native
  @JSName("on")
  def on_response(event: atHapiWreckLib.atHapiWreckLibStrings.response, listener: atHapiWreckLib.ResponseCallback): this.type = js.native
}

