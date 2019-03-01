package typings
package jqueryDotColorboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorboxResizeSettings extends js.Object {
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var innerHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var innerWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object ColorboxResizeSettings {
  @scala.inline
  def apply(
    height: scala.Double | java.lang.String = null,
    innerHeight: scala.Double | java.lang.String = null,
    innerWidth: scala.Double | java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): ColorboxResizeSettings = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (innerHeight != null) __obj.updateDynamic("innerHeight")(innerHeight.asInstanceOf[js.Any])
    if (innerWidth != null) __obj.updateDynamic("innerWidth")(innerWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorboxResizeSettings]
  }
}

