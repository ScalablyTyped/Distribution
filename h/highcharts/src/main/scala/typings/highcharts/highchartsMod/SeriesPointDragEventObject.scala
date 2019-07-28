package typings.highcharts.highchartsMod

import typings.highcharts.highchartsStrings.drag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPointDragEventObject extends js.Object {
  /**
    * New points during drag.
    */
  var newPoints: Dictionary[SeriesPointDragPointObject]
  /**
    * Original data.
    */
  var origin: js.Object
  /**
    * Prevent default drag action.
    */
  var preventDefault: js.Function
  /**
    * Target point that caused the event.
    */
  var target: Point
  /**
    * Event type.
    */
  var `type`: drag
}

object SeriesPointDragEventObject {
  @scala.inline
  def apply(
    newPoints: Dictionary[SeriesPointDragPointObject],
    origin: js.Object,
    preventDefault: js.Function,
    target: Point,
    `type`: drag
  ): SeriesPointDragEventObject = {
    val __obj = js.Dynamic.literal(newPoints = newPoints, origin = origin, preventDefault = preventDefault, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SeriesPointDragEventObject]
  }
}

