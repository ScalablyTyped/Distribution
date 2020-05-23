package typings.highcharts.mod

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
    * range of `rotation.from` and `rotation.to`. Must be a number larger than
    * 0.
    */
  var orientations: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The largest degree of rotation for a word.
    */
  var to: js.UndefOr[Double] = js.undefined
}

object PlotWordcloudRotationOptions {
  @scala.inline
  def apply(
    from: js.UndefOr[Double] = js.undefined,
    orientations: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined
  ): PlotWordcloudRotationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(orientations)) __obj.updateDynamic("orientations")(orientations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotWordcloudRotationOptions]
  }
}

