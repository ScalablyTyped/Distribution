package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.StylesNs.MuiTheme
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.ThemeWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeWrapper
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.materialDashUi.underscoreUnderscoreMaterialUINs.ThemeWrapper] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.underscoreUnderscoreMaterialUINs.ThemeWrapper].asInstanceOf[String | js.Object]
  def apply(theme: MuiTheme): BuildingComponent[tag.type, typings.materialDashUi.underscoreUnderscoreMaterialUINs.ThemeWrapper] = {
    val __obj = js.Dynamic.literal(theme = theme)
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ThemeWrapperProps
}

