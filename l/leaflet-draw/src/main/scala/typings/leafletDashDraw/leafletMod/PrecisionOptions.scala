package typings.leafletDashDraw.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrecisionOptions extends js.Object {
  var ac: js.UndefOr[Double] = js.undefined
  var ft: js.UndefOr[Double] = js.undefined
  var ha: js.UndefOr[Double] = js.undefined
  var km: js.UndefOr[Double] = js.undefined
  var m: js.UndefOr[Double] = js.undefined
  var mi: js.UndefOr[Double] = js.undefined
  var nm: js.UndefOr[Double] = js.undefined
  var yd: js.UndefOr[Double] = js.undefined
}

object PrecisionOptions {
  @scala.inline
  def apply(
    ac: Int | Double = null,
    ft: Int | Double = null,
    ha: Int | Double = null,
    km: Int | Double = null,
    m: Int | Double = null,
    mi: Int | Double = null,
    nm: Int | Double = null,
    yd: Int | Double = null
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

