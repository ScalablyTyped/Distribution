package typings
package atIonicDiscoverLib.distPublisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPublisherEventEmitter extends js.Object {
  @JSName("on")
  def on_error(
    event: atIonicDiscoverLib.atIonicDiscoverLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type
}

object IPublisherEventEmitter {
  @scala.inline
  def apply(
    on_error: (atIonicDiscoverLib.atIonicDiscoverLibStrings.error, js.Function1[/* err */ stdLib.Error, scala.Unit]) => IPublisherEventEmitter
  ): IPublisherEventEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_error))
    __obj.asInstanceOf[IPublisherEventEmitter]
  }
}

