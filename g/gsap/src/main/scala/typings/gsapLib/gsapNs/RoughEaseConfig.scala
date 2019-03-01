package typings
package gsapLib.gsapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoughEaseConfig extends js.Object {
  var clamp: js.UndefOr[scala.Boolean] = js.undefined
  var points: js.UndefOr[scala.Double] = js.undefined
  var randomize: js.UndefOr[scala.Boolean] = js.undefined
  var strength: js.UndefOr[scala.Double] = js.undefined
  var taper: js.UndefOr[
    gsapLib.gsapLibStrings.in | gsapLib.gsapLibStrings.out | gsapLib.gsapLibStrings.both | gsapLib.gsapLibStrings.none
  ] = js.undefined
  var template: js.UndefOr[Ease] = js.undefined
}

object RoughEaseConfig {
  @scala.inline
  def apply(
    clamp: js.UndefOr[scala.Boolean] = js.undefined,
    points: scala.Int | scala.Double = null,
    randomize: js.UndefOr[scala.Boolean] = js.undefined,
    strength: scala.Int | scala.Double = null,
    taper: gsapLib.gsapLibStrings.in | gsapLib.gsapLibStrings.out | gsapLib.gsapLibStrings.both | gsapLib.gsapLibStrings.none = null,
    template: Ease = null
  ): RoughEaseConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clamp)) __obj.updateDynamic("clamp")(clamp)
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize)
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    if (taper != null) __obj.updateDynamic("taper")(taper.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[RoughEaseConfig]
  }
}

