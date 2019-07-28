package typings.gsap.gsapNs

import typings.gsap.gsapStrings.both
import typings.gsap.gsapStrings.in
import typings.gsap.gsapStrings.none
import typings.gsap.gsapStrings.out
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoughEaseConfig extends js.Object {
  var clamp: js.UndefOr[Boolean] = js.undefined
  var points: js.UndefOr[Double] = js.undefined
  var randomize: js.UndefOr[Boolean] = js.undefined
  var strength: js.UndefOr[Double] = js.undefined
  var taper: js.UndefOr[in | out | both | none] = js.undefined
  var template: js.UndefOr[Ease] = js.undefined
}

object RoughEaseConfig {
  @scala.inline
  def apply(
    clamp: js.UndefOr[Boolean] = js.undefined,
    points: Int | Double = null,
    randomize: js.UndefOr[Boolean] = js.undefined,
    strength: Int | Double = null,
    taper: in | out | both | none = null,
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

