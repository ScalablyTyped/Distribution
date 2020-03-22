package typings.highcharts.dumbbellMod.highchartsAugmentingMod

import typings.highcharts.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Series extends js.Object {
  /**
    * Get non-presentational attributes for a point. Used internally for
    * both styled mode and classic. Set correct position in link with
    * connector line.
    *
    * @param this
    *        The series of points.
    *
    * @return A hash containing those attributes that are not settable from
    *         CSS.
    */
  def markerAttribs(): SVGAttributes
}

object Series {
  @scala.inline
  def apply(markerAttribs: () => SVGAttributes): Series = {
    val __obj = js.Dynamic.literal(markerAttribs = js.Any.fromFunction0(markerAttribs))
  
    __obj.asInstanceOf[Series]
  }
}

