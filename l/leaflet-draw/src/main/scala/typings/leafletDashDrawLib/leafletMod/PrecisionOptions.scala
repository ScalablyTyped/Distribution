package typings
package leafletDashDrawLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrecisionOptions extends js.Object {
  var ac: js.UndefOr[scala.Double] = js.undefined
  var ft: js.UndefOr[scala.Double] = js.undefined
  var ha: js.UndefOr[scala.Double] = js.undefined
  var km: js.UndefOr[scala.Double] = js.undefined
  var m: js.UndefOr[scala.Double] = js.undefined
  var mi: js.UndefOr[scala.Double] = js.undefined
  var nm: js.UndefOr[scala.Double] = js.undefined
  var yd: js.UndefOr[scala.Double] = js.undefined
}

object PrecisionOptions {
  @scala.inline
  def apply(
    ac: scala.Int | scala.Double = null,
    ft: scala.Int | scala.Double = null,
    ha: scala.Int | scala.Double = null,
    km: scala.Int | scala.Double = null,
    m: scala.Int | scala.Double = null,
    mi: scala.Int | scala.Double = null,
    nm: scala.Int | scala.Double = null,
    yd: scala.Int | scala.Double = null
  ): PrecisionOptions = {
    val __obj = js.Dynamic.literal()
    if (ac != null) __obj.updateDynamic("ac")(ac.asInstanceOf[js.Any])
    if (ft != null) __obj.updateDynamic("ft")(ft.asInstanceOf[js.Any])
    if (ha != null) __obj.updateDynamic("ha")(ha.asInstanceOf[js.Any])
    if (km != null) __obj.updateDynamic("km")(km.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (mi != null) __obj.updateDynamic("mi")(mi.asInstanceOf[js.Any])
    if (nm != null) __obj.updateDynamic("nm")(nm.asInstanceOf[js.Any])
    if (yd != null) __obj.updateDynamic("yd")(yd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrecisionOptions]
  }
}

