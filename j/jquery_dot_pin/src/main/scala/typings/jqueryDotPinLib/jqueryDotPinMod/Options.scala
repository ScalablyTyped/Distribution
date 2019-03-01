package typings
package jqueryDotPinLib.jqueryDotPinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var activeClass: js.UndefOr[java.lang.String] = js.undefined
  var containerSelector: js.UndefOr[java.lang.String] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[jqueryDotPinLib.Anon_Bottom] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    activeClass: java.lang.String = null,
    containerSelector: java.lang.String = null,
    minWidth: scala.Int | scala.Double = null,
    padding: jqueryDotPinLib.Anon_Bottom = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (containerSelector != null) __obj.updateDynamic("containerSelector")(containerSelector)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[Options]
  }
}

