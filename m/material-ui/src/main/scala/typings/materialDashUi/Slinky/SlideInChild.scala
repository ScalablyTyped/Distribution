package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.internalSlideInChildMod.SlideInChildProps
import typings.materialDashUi.internalSlideInChildMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, style */
object SlideInChild
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.internalSlideInChildMod.default].asInstanceOf[String | js.Object]
  def apply(getLeaveDirection: js.Function, direction: String = null, enterDelay: Int | Double = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(getLeaveDirection = getLeaveDirection)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SlideInChildProps
}

