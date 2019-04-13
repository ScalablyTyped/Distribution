package typings
package materialDashUiLib.internalBeforeAfterWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeAfterWrapperProps
  extends reactLib.reactMod.Props[BeforeAfterWrapper] {
  var afterElementType: js.UndefOr[java.lang.String] = js.undefined
  var afterStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var beforeElementType: js.UndefOr[java.lang.String] = js.undefined
  var beforeStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var elementType: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object BeforeAfterWrapperProps {
  @scala.inline
  def apply(
    afterElementType: java.lang.String = null,
    afterStyle: reactLib.reactMod.CSSProperties = null,
    beforeElementType: java.lang.String = null,
    beforeStyle: reactLib.reactMod.CSSProperties = null,
    children: reactLib.reactMod.ReactNode = null,
    elementType: java.lang.String = null,
    key: reactLib.reactMod.Key = null,
    ref: reactLib.reactMod.LegacyRef[BeforeAfterWrapper] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): BeforeAfterWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (afterElementType != null) __obj.updateDynamic("afterElementType")(afterElementType)
    if (afterStyle != null) __obj.updateDynamic("afterStyle")(afterStyle)
    if (beforeElementType != null) __obj.updateDynamic("beforeElementType")(beforeElementType)
    if (beforeStyle != null) __obj.updateDynamic("beforeStyle")(beforeStyle)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BeforeAfterWrapperProps]
  }
}

