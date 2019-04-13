package typings
package jsonicLib.jsonicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var depth: js.UndefOr[scala.Double] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var maxchars: js.UndefOr[scala.Double] = js.undefined
  var maxitems: js.UndefOr[scala.Double] = js.undefined
  var omit: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    depth: scala.Int | scala.Double = null,
    exclude: js.Array[java.lang.String] = null,
    maxchars: scala.Int | scala.Double = null,
    maxitems: scala.Int | scala.Double = null,
    omit: js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (maxchars != null) __obj.updateDynamic("maxchars")(maxchars.asInstanceOf[js.Any])
    if (maxitems != null) __obj.updateDynamic("maxitems")(maxitems.asInstanceOf[js.Any])
    if (omit != null) __obj.updateDynamic("omit")(omit)
    __obj.asInstanceOf[Options]
  }
}

