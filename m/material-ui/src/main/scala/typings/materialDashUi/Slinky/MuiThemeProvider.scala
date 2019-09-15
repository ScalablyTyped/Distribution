package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.stylesMuiThemeProviderMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.StylesNs.MuiTheme
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.StylesNs.MuiThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MuiThemeProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.stylesMuiThemeProviderMod.default].asInstanceOf[String | js.Object]
  def apply(muiTheme: MuiTheme = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (muiTheme != null) __obj.updateDynamic("muiTheme")(muiTheme)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MuiThemeProviderProps
}

