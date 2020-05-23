package typings.justifiedLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results from calculating the justified layout.
  */
trait JustifiedLayoutResult extends js.Object {
  /**
    * Computed positional and sizing properties of a box in the justified layout.
    */
  var boxes: js.Array[LayoutBox]
  /**
    * Height of the container containing the justified layout.
    */
  var containerHeight: Double
  /**
    * Number of items that are in rows that aren't fully-packed.
    */
  var widowCount: Double
}

object JustifiedLayoutResult {
  @scala.inline
  def apply(boxes: js.Array[LayoutBox], containerHeight: Double, widowCount: Double): JustifiedLayoutResult = {
    val __obj = js.Dynamic.literal(boxes = boxes.asInstanceOf[js.Any], containerHeight = containerHeight.asInstanceOf[js.Any], widowCount = widowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustifiedLayoutResult]
  }
}

