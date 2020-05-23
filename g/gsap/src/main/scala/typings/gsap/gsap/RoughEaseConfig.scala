package typings.gsap.gsap

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
    points: js.UndefOr[Double] = js.undefined,
    randomize: js.UndefOr[Boolean] = js.undefined,
    strength: js.UndefOr[Double] = js.undefined,
    taper: in | out | both | none = null,
    template: Ease = null
  ): RoughEaseConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clamp)) __obj.updateDynamic("clamp")(clamp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(points)) __obj.updateDynamic("points")(points.get.asInstanceOf[js.Any])
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strength)) __obj.updateDynamic("strength")(strength.get.asInstanceOf[js.Any])
    if (taper != null) __obj.updateDynamic("taper")(taper.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoughEaseConfig]
  }
}

