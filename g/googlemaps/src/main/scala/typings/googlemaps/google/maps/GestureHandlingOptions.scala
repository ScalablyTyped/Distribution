package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googlemaps.googlemapsStrings.cooperative
  - typings.googlemaps.googlemapsStrings.greedy
  - typings.googlemaps.googlemapsStrings.none
  - typings.googlemaps.googlemapsStrings.auto
*/
trait GestureHandlingOptions extends js.Object

object GestureHandlingOptions {
  @scala.inline
  def auto: typings.googlemaps.googlemapsStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cooperative: typings.googlemaps.googlemapsStrings.cooperative = this.cast("cooperative")
  @scala.inline
  def greedy: typings.googlemaps.googlemapsStrings.greedy = this.cast("greedy")
  @scala.inline
  def none: typings.googlemaps.googlemapsStrings.none = this.cast("none")
}

