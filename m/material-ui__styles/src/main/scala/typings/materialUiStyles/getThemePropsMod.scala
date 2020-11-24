package typings.materialUiStyles

import typings.materialUiStyles.anon.NameProps
import typings.materialUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import typings.materialUiStyles.getThemePropsGetThemePropsMod.ThemedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material-ui/styles/getThemeProps", JSImport.Namespace)
@js.native
object getThemePropsMod extends js.Object {
  
  def default[Theme /* <: ThemeWithProps[_] */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name, Theme]): Props with (ThemedProps[Theme, Name]) = js.native
}
