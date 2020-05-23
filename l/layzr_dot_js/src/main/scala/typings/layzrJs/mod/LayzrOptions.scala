package typings.layzrJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayzrOptions extends js.Object {
  /**
    * Customize the attribute the normal resolution source is taken from.
    */
  var normal: js.UndefOr[String] = js.undefined
  /**
    * Customize the attribute the retina/high resolution source is taken from.
    */
  var retina: js.UndefOr[String] = js.undefined
  /**
    * Customize the attribute the source set is taken from.
    */
  var srcset: js.UndefOr[String] = js.undefined
  /**
    * Adjust when images load, relative to the viewport. Positive values make images load sooner, negative values make images load later.
    *
    * Threshold is a percentage of the viewport height, identical to the CSS vh unit.
    */
  var threshold: js.UndefOr[Double] = js.undefined
}

object LayzrOptions {
  @scala.inline
  def apply(
    normal: String = null,
    retina: String = null,
    srcset: String = null,
    threshold: js.UndefOr[Double] = js.undefined
  ): LayzrOptions = {
    val __obj = js.Dynamic.literal()
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (retina != null) __obj.updateDynamic("retina")(retina.asInstanceOf[js.Any])
    if (srcset != null) __obj.updateDynamic("srcset")(srcset.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayzrOptions]
  }
}

