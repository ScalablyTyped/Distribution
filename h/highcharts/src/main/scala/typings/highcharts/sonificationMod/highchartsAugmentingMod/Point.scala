package typings.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point extends js.Object {
  /**
    * Cancel sonification of a point. Calls onEnd functions.
    *
    * @param fadeOut
    *        Whether or not to fade out as we stop. If false, the points
    *        are cancelled synchronously.
    */
  def cancelSonify(): Unit = js.native
  def cancelSonify(fadeOut: Boolean): Unit = js.native
  /**
    * Sonify a single point.
    *
    * @param options
    *        Options for the sonification of the point.
    */
  def sonify(options: PointSonifyOptionsObject): Unit = js.native
}

