package typings.jsonic.jsonicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var depth: js.UndefOr[Double] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var maxchars: js.UndefOr[Double] = js.undefined
  var maxitems: js.UndefOr[Double] = js.undefined
  var omit: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    depth: Int | Double = null,
    exclude: js.Array[String] = null,
    maxchars: Int | Double = null,
    maxitems: Int | Double = null,
    omit: js.Array[String] = null
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

