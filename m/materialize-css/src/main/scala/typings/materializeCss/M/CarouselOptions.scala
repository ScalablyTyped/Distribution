package typings.materializeCss.M

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
  def onCycleTo(current: Element, dragged: Boolean): Unit
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
    onCycleTo: (Element, Boolean) => Unit,
    padding: Double,
    shift: Double
  ): CarouselOptions = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], indicators = indicators.asInstanceOf[js.Any], noWrap = noWrap.asInstanceOf[js.Any], numVisible = numVisible.asInstanceOf[js.Any], onCycleTo = js.Any.fromFunction2(onCycleTo), padding = padding.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselOptions]
  }
}

