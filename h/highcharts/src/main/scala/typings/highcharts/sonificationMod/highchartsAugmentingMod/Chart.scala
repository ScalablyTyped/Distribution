package typings.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart extends js.Object {
  /**
    * Cancel current sonification and reset cursor.
    *
    * @param fadeOut
    *        Fade out as we pause to avoid clicks.
    */
  def cancelSonify(): Unit = js.native
  def cancelSonify(fadeOut: Boolean): Unit = js.native
  /**
    * Get a list of the points currently under cursor.
    *
    * @return The points currently under the cursor.
    */
  def getCurrentSonifyPoints(): js.Array[Point] = js.native
  /**
    * Pause the running sonification.
    *
    * @param fadeOut
    *        Fade out as we pause to avoid clicks.
    */
  def pauseSonify(): Unit = js.native
  def pauseSonify(fadeOut: Boolean): Unit = js.native
  /**
    * Reset cursor to start. Requires series.sonify or chart.sonify to have
    * been played at some point earlier.
    */
  def resetSonifyCursor(): Unit = js.native
  /**
    * Reset cursor to end. Requires series.sonify or chart.sonify to have
    * been played at some point earlier.
    */
  def resetSonifyCursorEnd(): Unit = js.native
  /**
    * Resume the currently running sonification. Requires series.sonify or
    * chart.sonify to have been played at some point earlier.
    *
    * @param onEnd
    *        Callback to call when play finished.
    */
  def resumeSonify(onEnd: js.Function): Unit = js.native
  /**
    * Play backwards from cursor. Requires series.sonify or chart.sonify to
    * have been played at some point earlier.
    *
    * @param onEnd
    *        Callback to call when play finished.
    */
  def rewindSonify(onEnd: js.Function): Unit = js.native
  def setSonifyCursor(points: js.Array[Point]): Unit = js.native
  /**
    * Set the cursor to a point or set of points in different series.
    *
    * @param points
    *        The point or points to set the cursor to. If setting multiple
    *        points under the cursor, the points have to be in different
    *        series that are being played simultaneously.
    */
  def setSonifyCursor(points: Point): Unit = js.native
  /**
    * Sonify a chart.
    *
    * @param options
    *        The options for sonifying this chart.
    */
  def sonify(options: SonifyChartOptionsObject): Unit = js.native
}

