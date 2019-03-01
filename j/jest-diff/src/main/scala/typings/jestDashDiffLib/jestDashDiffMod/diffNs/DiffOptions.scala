package typings
package jestDashDiffLib.jestDashDiffMod.diffNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffOptions extends js.Object {
  var aAnnotation: js.UndefOr[java.lang.String] = js.undefined
  var bAnnotation: js.UndefOr[java.lang.String] = js.undefined
  var contextLines: js.UndefOr[scala.Double] = js.undefined
  var expand: js.UndefOr[scala.Boolean] = js.undefined
}

object DiffOptions {
  @scala.inline
  def apply(
    aAnnotation: java.lang.String = null,
    bAnnotation: java.lang.String = null,
    contextLines: scala.Int | scala.Double = null,
    expand: js.UndefOr[scala.Boolean] = js.undefined
  ): DiffOptions = {
    val __obj = js.Dynamic.literal()
    if (aAnnotation != null) __obj.updateDynamic("aAnnotation")(aAnnotation)
    if (bAnnotation != null) __obj.updateDynamic("bAnnotation")(bAnnotation)
    if (contextLines != null) __obj.updateDynamic("contextLines")(contextLines.asInstanceOf[js.Any])
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    __obj.asInstanceOf[DiffOptions]
  }
}

