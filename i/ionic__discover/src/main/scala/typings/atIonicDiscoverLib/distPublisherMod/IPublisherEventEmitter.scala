package typings
package atIonicDiscoverLib.distPublisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPublisherEventEmitter extends js.Object {
  @JSName("on")
  def on_error(
    event: atIonicDiscoverLib.atIonicDiscoverLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type
}

