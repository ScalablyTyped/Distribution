package typings.materialUi.beforeAfterWrapperMod

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
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
    ref: js.UndefOr[Null | LegacyRef[BeforeAfterWrapper]] = js.undefined,
    style: CSSProperties = null
  ): BeforeAfterWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (afterElementType != null) __obj.updateDynamic("afterElementType")(afterElementType.asInstanceOf[js.Any])
    if (afterStyle != null) __obj.updateDynamic("afterStyle")(afterStyle.asInstanceOf[js.Any])
    if (beforeElementType != null) __obj.updateDynamic("beforeElementType")(beforeElementType.asInstanceOf[js.Any])
    if (beforeStyle != null) __obj.updateDynamic("beforeStyle")(beforeStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeAfterWrapperProps]
  }
}

