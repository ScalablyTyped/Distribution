package typings.googlemaps.google.maps.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
trait MouseEvent extends js.Object {
  def stop(): Unit
}

object MouseEvent {
  @scala.inline
  def apply(stop: () => Unit): MouseEvent = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[MouseEvent]
  }
}

