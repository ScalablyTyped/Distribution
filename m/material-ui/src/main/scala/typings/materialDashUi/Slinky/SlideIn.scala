package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.internalSlideInMod.SlideInProps
import typings.materialDashUi.internalSlideInMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.direction
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, style */
object SlideIn
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.internalSlideInMod.default].asInstanceOf[String | js.Object]
  def apply(childStyle: CSSProperties = null, direction: direction = null, enterDelay: Int | Double = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (childStyle != null) __obj.updateDynamic("childStyle")(childStyle)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SlideInProps
}

