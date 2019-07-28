package typings.materialDashUi.internalBeforeAfterWrapperMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeAfterWrapperProps extends Props[BeforeAfterWrapper] {
  var afterElementType: js.UndefOr[String] = js.undefined
  var afterStyle: js.UndefOr[CSSProperties] = js.undefined
  var beforeElementType: js.UndefOr[String] = js.undefined
  var beforeStyle: js.UndefOr[CSSProperties] = js.undefined
  var elementType: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object BeforeAfterWrapperProps {
  @scala.inline
  def apply(
    afterElementType: String = null,
    afterStyle: CSSProperties = null,
    beforeElementType: String = null,
    beforeStyle: CSSProperties = null,
    children: ReactNode = null,
    elementType: String = null,
    key: Key = null,
    ref: LegacyRef[BeforeAfterWrapper] = null,
    style: CSSProperties = null
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

