package typings
package atIonicDiscoverLib.distCommMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommServerEventEmitter extends js.Object {
  @JSName("on")
  def on_connect(
    event: atIonicDiscoverLib.atIonicDiscoverLibStrings.connect,
    listener: js.Function1[/* data */ CommServerConnectionPayload, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: atIonicDiscoverLib.atIonicDiscoverLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
}

