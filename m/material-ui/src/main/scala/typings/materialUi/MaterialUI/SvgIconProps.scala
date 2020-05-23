package typings.materialUi.MaterialUI

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.Props because var conflicts: children. Inlined key, ref */ trait SvgIconProps
  extends SVGAttributes[js.Object] {
  var hoverColor: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var ref: js.UndefOr[LegacyRef[SvgIcon]] = js.undefined
}

object SvgIconProps {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes[js.Object] = null,
    hoverColor: String = null,
    key: Key = null,
    ref: js.UndefOr[Null | LegacyRef[SvgIcon]] = js.undefined
  ): SvgIconProps = {
    val __obj = js.Dynamic.literal()
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgIconProps]
  }
}

