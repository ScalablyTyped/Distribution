package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.internalBeforeAfterWrapperMod.BeforeAfterWrapperProps
import typings.materialDashUi.internalBeforeAfterWrapperMod.default
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, style */
object BeforeAfterWrapper
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.internalBeforeAfterWrapperMod.default].asInstanceOf[String | js.Object]
  def apply(
    afterElementType: String = null,
    afterStyle: CSSProperties = null,
    beforeElementType: String = null,
    beforeStyle: CSSProperties = null,
    elementType: String = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (afterElementType != null) __obj.updateDynamic("afterElementType")(afterElementType)
    if (afterStyle != null) __obj.updateDynamic("afterStyle")(afterStyle)
    if (beforeElementType != null) __obj.updateDynamic("beforeElementType")(beforeElementType)
    if (beforeStyle != null) __obj.updateDynamic("beforeStyle")(beforeStyle)
    if (elementType != null) __obj.updateDynamic("elementType")(elementType)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BeforeAfterWrapperProps
}

