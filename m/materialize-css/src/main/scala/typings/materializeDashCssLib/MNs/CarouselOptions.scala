package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselOptions extends js.Object {
  /**
    * Perspective zoom. If 0, all items are the same size
    * @default -100
    */
  var dist: scala.Double
  /**
    * Transition duration in milliseconds
    * @default 200
    */
  var duration: scala.Double
  /**
    * Make the carousel a full width slider like the second example
    * @default false
    */
  var fullWidth: scala.Boolean
  /**
    * Set to true to show indicators
    * @default false
    */
  var indicators: scala.Boolean
  /**
    * Don't wrap around and cycle through items
    * @default false
    */
  var noWrap: scala.Boolean
  /**
    * Set the number of visible items
    * @default 5
    */
  var numVisible: scala.Double
  /**
    * Set the padding between non center items
    * @default 0
    */
  var padding: scala.Double
  /**
    * Set the spacing of the center item
    * @default 0
    */
  var shift: scala.Double
  /**
    * Callback for when a new slide is cycled to
    * @default null
    */
  def onCycleTo(`this`: Carousel, current: stdLib.Element, dragged: scala.Boolean): scala.Unit
}

object CarouselOptions {
  @scala.inline
  def apply(
    dist: scala.Double,
    duration: scala.Double,
    fullWidth: scala.Boolean,
    indicators: scala.Boolean,
    noWrap: scala.Boolean,
    numVisible: scala.Double,
    onCycleTo: js.Function3[Carousel, stdLib.Element, scala.Boolean, scala.Unit],
    padding: scala.Double,
    shift: scala.Double
  ): CarouselOptions = {
    val __obj = js.Dynamic.literal(dist = dist, duration = duration, fullWidth = fullWidth, indicators = indicators, noWrap = noWrap, numVisible = numVisible, onCycleTo = onCycleTo, padding = padding, shift = shift)
  
    __obj.asInstanceOf[CarouselOptions]
  }
}

