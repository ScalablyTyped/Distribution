package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.ReactNs.Props because var conflicts: children. Inlined key, ref */ trait PaperProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[js.Object] {
  var circle: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var key: js.UndefOr[reactLib.reactMod.ReactNs.Key] = js.undefined
  var ref: js.UndefOr[reactLib.reactMod.ReactNs.LegacyRef[Paper]] = js.undefined
  var rounded: js.UndefOr[scala.Boolean] = js.undefined
  var transitionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var zDepth: js.UndefOr[scala.Double] = js.undefined
}

object PaperProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[js.Object] = null,
    Props: reactLib.reactMod.ReactNs.Props[Paper] = null,
    circle: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Double | java.lang.String = null,
    rounded: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    transitionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Double | java.lang.String = null,
    zDepth: scala.Int | scala.Double = null
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

