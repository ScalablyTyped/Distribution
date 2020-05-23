package typings.leafletDraw.mod

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
    ac: js.UndefOr[Double] = js.undefined,
    ft: js.UndefOr[Double] = js.undefined,
    ha: js.UndefOr[Double] = js.undefined,
    km: js.UndefOr[Double] = js.undefined,
    m: js.UndefOr[Double] = js.undefined,
    mi: js.UndefOr[Double] = js.undefined,
    nm: js.UndefOr[Double] = js.undefined,
    yd: js.UndefOr[Double] = js.undefined
  ): PrecisionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ac)) __obj.updateDynamic("ac")(ac.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ft)) __obj.updateDynamic("ft")(ft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ha)) __obj.updateDynamic("ha")(ha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(km)) __obj.updateDynamic("km")(km.get.asInstanceOf[js.Any])
    if (!js.isUndefined(m)) __obj.updateDynamic("m")(m.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mi)) __obj.updateDynamic("mi")(mi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nm)) __obj.updateDynamic("nm")(nm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yd)) __obj.updateDynamic("yd")(yd.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrecisionOptions]
  }
}

