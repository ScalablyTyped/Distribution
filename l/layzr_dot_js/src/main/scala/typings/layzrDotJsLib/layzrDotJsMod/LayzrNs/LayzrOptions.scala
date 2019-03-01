package typings
package layzrDotJsLib.layzrDotJsMod.LayzrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayzrOptions extends js.Object {
  /**
    * Customize the attribute the normal resolution source is taken from.
    */
  var normal: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Customize the attribute the retina/high resolution source is taken from.
    */
  var retina: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Customize the attribute the source set is taken from.
    */
  var srcset: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Adjust when images load, relative to the viewport. Positive values make images load sooner, negative values make images load later.
    *
    * Threshold is a percentage of the viewport height, identical to the CSS vh unit.
    */
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object LayzrOptions {
  @scala.inline
  def apply(
    normal: java.lang.String = null,
    retina: java.lang.String = null,
    srcset: java.lang.String = null,
    threshold: scala.Int | scala.Double = null
  ): LayzrOptions = {
    val __obj = js.Dynamic.literal()
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (retina != null) __obj.updateDynamic("retina")(retina)
    if (srcset != null) __obj.updateDynamic("srcset")(srcset)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayzrOptions]
  }
}

