package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeAfterWrapperProps extends js.Object {
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
    elementType: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null
  ): BeforeAfterWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (afterElementType != null) __obj.updateDynamic("afterElementType")(afterElementType)
    if (afterStyle != null) __obj.updateDynamic("afterStyle")(afterStyle)
    if (beforeElementType != null) __obj.updateDynamic("beforeElementType")(beforeElementType)
    if (beforeStyle != null) __obj.updateDynamic("beforeStyle")(beforeStyle)
    if (elementType != null) __obj.updateDynamic("elementType")(elementType)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BeforeAfterWrapperProps]
  }
}

