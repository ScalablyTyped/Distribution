package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.cssBaselineCssBaselineMod.CssBaselineProps
import typings.atMaterialDashUiCore.cssBaselineMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CssBaseline
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.cssBaselineMod.default].asInstanceOf[String | js.Object]
  def apply(): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CssBaselineProps
}

