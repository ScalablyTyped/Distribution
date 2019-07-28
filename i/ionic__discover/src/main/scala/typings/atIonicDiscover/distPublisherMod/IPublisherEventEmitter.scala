package typings.atIonicDiscover.distPublisherMod

import typings.atIonicDiscover.atIonicDiscoverStrings.error
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPublisherEventEmitter extends js.Object {
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type
}

object IPublisherEventEmitter {
  @scala.inline
  def apply(on_error: (error, js.Function1[/* err */ Error, Unit]) => IPublisherEventEmitter): IPublisherEventEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_error))
    __obj.asInstanceOf[IPublisherEventEmitter]
  }
}

