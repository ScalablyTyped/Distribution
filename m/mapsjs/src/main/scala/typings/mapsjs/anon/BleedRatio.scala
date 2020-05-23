package typings.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BleedRatio extends js.Object {
  var bleedRatio: js.UndefOr[Double] = js.undefined
  var clipToRenderBounds: js.UndefOr[Boolean] = js.undefined
  var fieldNames: js.UndefOr[js.Array[String]] = js.undefined
  var simplifyEnabled: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object BleedRatio {
  @scala.inline
  def apply(
    bleedRatio: js.UndefOr[Double] = js.undefined,
    clipToRenderBounds: js.UndefOr[Boolean] = js.undefined,
    fieldNames: js.Array[String] = null,
    simplifyEnabled: js.UndefOr[Boolean] = js.undefined,
    version: String = null
  ): BleedRatio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bleedRatio)) __obj.updateDynamic("bleedRatio")(bleedRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clipToRenderBounds)) __obj.updateDynamic("clipToRenderBounds")(clipToRenderBounds.get.asInstanceOf[js.Any])
    if (fieldNames != null) __obj.updateDynamic("fieldNames")(fieldNames.asInstanceOf[js.Any])
    if (!js.isUndefined(simplifyEnabled)) __obj.updateDynamic("simplifyEnabled")(simplifyEnabled.get.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BleedRatio]
  }
}

