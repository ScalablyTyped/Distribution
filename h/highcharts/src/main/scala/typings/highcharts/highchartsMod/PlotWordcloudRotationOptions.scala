package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWordcloudRotationOptions extends js.Object {
  /**
    * (Highcharts) The smallest degree of rotation for a word.
    */
  var from: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The number of possible orientations for a word, within the
    * range of `rotation.from` and `rotation.to`.
    */
  var orientations: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The largest degree of rotation for a word.
    */
  var to: js.UndefOr[Double] = js.undefined
}

object PlotWordcloudRotationOptions {
  @scala.inline
  def apply(from: Int | Double = null, orientations: Int | Double = null, to: Int | Double = null): PlotWordcloudRotationOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (orientations != null) __obj.updateDynamic("orientations")(orientations.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotWordcloudRotationOptions]
  }
}

