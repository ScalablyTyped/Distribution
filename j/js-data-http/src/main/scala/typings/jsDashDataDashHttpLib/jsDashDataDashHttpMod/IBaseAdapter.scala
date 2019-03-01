package typings
package jsDashDataDashHttpLib.jsDashDataDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseAdapter extends IDict {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
}

object IBaseAdapter {
  @scala.inline
  def apply(debug: js.UndefOr[scala.Boolean] = js.undefined, raw: js.UndefOr[scala.Boolean] = js.undefined): IBaseAdapter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[IBaseAdapter]
  }
}

