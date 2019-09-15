package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.internalClearFixMod.ClearFixProps
import typings.materialDashUi.internalClearFixMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, style */
object ClearFix
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.internalClearFixMod.default].asInstanceOf[String | js.Object]
  def apply(): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ClearFixProps
}

