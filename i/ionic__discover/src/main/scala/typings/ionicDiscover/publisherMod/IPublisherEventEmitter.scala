package typings.ionicDiscover.publisherMod

import typings.ionicDiscover.ionicDiscoverStrings.error
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
  def apply(on: (error, js.Function1[/* err */ Error, Unit]) => IPublisherEventEmitter): IPublisherEventEmitter = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[IPublisherEventEmitter]
  }
}

