package typings.jsonic.mod

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
    depth: js.UndefOr[Double] = js.undefined,
    exclude: js.Array[String] = null,
    maxchars: js.UndefOr[Double] = js.undefined,
    maxitems: js.UndefOr[Double] = js.undefined,
    omit: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(maxchars)) __obj.updateDynamic("maxchars")(maxchars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxitems)) __obj.updateDynamic("maxitems")(maxitems.get.asInstanceOf[js.Any])
    if (omit != null) __obj.updateDynamic("omit")(omit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

