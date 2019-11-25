package typings.highcharts.highchartsMod

import typings.highcharts.highchartsStrings.afterAnimate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesAfterAnimateEventObject extends js.Object {
  /**
    * Animated series.
    */
  var target: Series
  /**
    * Event type.
    */
  var `type`: afterAnimate
}

object SeriesAfterAnimateEventObject {
  @scala.inline
  def apply(target: Series, `type`: afterAnimate): SeriesAfterAnimateEventObject = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesAfterAnimateEventObject]
  }
}

