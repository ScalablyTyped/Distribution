package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlgroupOptions extends js.Object {
  var corners: js.UndefOr[scala.Boolean] = js.undefined
  var excludeInvisible: js.UndefOr[scala.Boolean] = js.undefined
  var mini: js.UndefOr[scala.Boolean] = js.undefined
  var shadow: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ControlgroupOptions {
  @scala.inline
  def apply(
    corners: js.UndefOr[scala.Boolean] = js.undefined,
    excludeInvisible: js.UndefOr[scala.Boolean] = js.undefined,
    mini: js.UndefOr[scala.Boolean] = js.undefined,
    shadow: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): ControlgroupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(corners)) __obj.updateDynamic("corners")(corners)
    if (!js.isUndefined(excludeInvisible)) __obj.updateDynamic("excludeInvisible")(excludeInvisible)
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ControlgroupOptions]
  }
}

