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

object IPublisherEventEmitter {
  @scala.inline
  def apply(
    on_error: js.Function2[
      atIonicDiscoverLib.atIonicDiscoverLibStrings.error, 
      js.Function1[/* err */ nodeLib.Error, scala.Unit], 
      IPublisherEventEmitter
    ]
  ): IPublisherEventEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(on_error)
    __obj.asInstanceOf[IPublisherEventEmitter]
  }
}

