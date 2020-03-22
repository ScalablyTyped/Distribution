package typings.materialUiStyles

import typings.materialUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import typings.materialUiStyles.getThemePropsGetThemePropsMod.ThemedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/getThemeProps", JSImport.Namespace)
@js.native
object getThemePropsMod extends js.Object {
  def default[Theme /* <: ThemeWithProps[_] */, Props, Name /* <: String */](params: AnonName[Props, Name, Theme]): Props with (ThemedProps[Theme, Name]) = js.native
}

