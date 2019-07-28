package typings.mapsjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BleedRatio extends js.Object {
  var bleedRatio: js.UndefOr[Double] = js.undefined
  var clipToRenderBounds: js.UndefOr[Boolean] = js.undefined
  var fieldNames: js.UndefOr[js.Array[String]] = js.undefined
  var simplifyEnabled: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Anon_BleedRatio {
  @scala.inline
  def apply(
    bleedRatio: Int | Double = null,
    clipToRenderBounds: js.UndefOr[Boolean] = js.undefined,
    fieldNames: js.Array[String] = null,
    simplifyEnabled: js.UndefOr[Boolean] = js.undefined,
    version: String = null
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

