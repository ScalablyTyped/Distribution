package typings.materialDashUi.underscoreUnderscoreMaterialUINs

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.Props because var conflicts: children. Inlined key, ref */ trait PaperProps
  extends HTMLAttributes[js.Object] {
  var circle: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var ref: js.UndefOr[LegacyRef[Paper]] = js.undefined
  var rounded: js.UndefOr[Boolean] = js.undefined
  var transitionEnabled: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var zDepth: js.UndefOr[Double] = js.undefined
}

object PaperProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[js.Object] = null,
    Props: Props[Paper] = null,
    circle: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    rounded: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    transitionEnabled: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    zDepth: Int | Double = null
  ): PaperProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, Props)
    if (!js.isUndefined(circle)) __obj.updateDynamic("circle")(circle)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(transitionEnabled)) __obj.updateDynamic("transitionEnabled")(transitionEnabled)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaperProps]
  }
}

