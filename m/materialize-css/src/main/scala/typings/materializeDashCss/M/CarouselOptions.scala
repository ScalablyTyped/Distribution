package typings.materializeDashCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselOptions extends js.Object {
  /**
    * Perspective zoom. If 0, all items are the same size
    * @default -100
    */
  var dist: Double
  /**
    * Transition duration in milliseconds
    * @default 200
    */
  var duration: Double
  /**
    * Make the carousel a full width slider like the second example
    * @default false
    */
  var fullWidth: Boolean
  /**
    * Set to true to show indicators
    * @default false
    */
  var indicators: Boolean
  /**
    * Don't wrap around and cycle through items
    * @default false
    */
  var noWrap: Boolean
  /**
    * Set the number of visible items
    * @default 5
    */
  var numVisible: Double
  /**
    * Set the padding between non center items
    * @default 0
    */
  var padding: Double
  /**
    * Set the spacing of the center item
    * @default 0
    */
  var shift: Double
  /**
    * Callback for when a new slide is cycled to
    * @default null
    */
  def onCycleTo(`this`: Carousel, current: Element, dragged: Boolean): Unit
}

object CarouselOptions {
  @scala.inline
  def apply(
    dist: Double,
    duration: Double,
    fullWidth: Boolean,
    indicators: Boolean,
    noWrap: Boolean,
    numVisible: Double,
    onCycleTo: (Carousel, Element, Boolean) => Unit,
    padding: Double,
    shift: Double
  ): CarouselOptions = {
    val __obj = js.Dynamic.literal(dist = dist, duration = duration, fullWidth = fullWidth, indicators = indicators, noWrap = noWrap, numVisible = numVisible, onCycleTo = js.Any.fromFunction3(onCycleTo), padding = padding, shift = shift)
  
    __obj.asInstanceOf[CarouselOptions]
  }
}

