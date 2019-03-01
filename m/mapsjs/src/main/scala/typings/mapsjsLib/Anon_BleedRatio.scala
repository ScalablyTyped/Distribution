package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BleedRatio extends js.Object {
  var bleedRatio: js.UndefOr[scala.Double] = js.undefined
  var clipToRenderBounds: js.UndefOr[scala.Boolean] = js.undefined
  var fieldNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var simplifyEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BleedRatio {
  @scala.inline
  def apply(
    bleedRatio: scala.Int | scala.Double = null,
    clipToRenderBounds: js.UndefOr[scala.Boolean] = js.undefined,
    fieldNames: js.Array[java.lang.String] = null,
    simplifyEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null
  ): Anon_BleedRatio = {
    val __obj = js.Dynamic.literal()
    if (bleedRatio != null) __obj.updateDynamic("bleedRatio")(bleedRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(clipToRenderBounds)) __obj.updateDynamic("clipToRenderBounds")(clipToRenderBounds)
    if (fieldNames != null) __obj.updateDynamic("fieldNames")(fieldNames)
    if (!js.isUndefined(simplifyEnabled)) __obj.updateDynamic("simplifyEnabled")(simplifyEnabled)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_BleedRatio]
  }
}

