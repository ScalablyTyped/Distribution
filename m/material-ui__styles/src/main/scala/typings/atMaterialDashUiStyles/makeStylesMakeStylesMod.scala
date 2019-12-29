package typings.atMaterialDashUiStyles

import typings.atMaterialDashUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typings.atMaterialDashUiStyles.withStylesWithStylesMod.ClassNameMap
import typings.atMaterialDashUiStyles.withStylesWithStylesMod.PropsOfStyles
import typings.atMaterialDashUiStyles.withStylesWithStylesMod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/makeStyles/makeStyles", JSImport.Namespace)
@js.native
object makeStylesMakeStylesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atMaterialDashUiStyles.atMaterialDashUiStylesBooleans.`true`
    - typings.atMaterialDashUiStyles.atMaterialDashUiStylesBooleans.`false`
  */
  trait StylesRequireProps[S] extends js.Object
  
  def default[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): StylesHook[Styles[Theme, Props, ClassKey]] = js.native
  def default[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey], options: OmitWithStylesOptionsThemewithTheme[Theme]): StylesHook[Styles[Theme, Props, ClassKey]] = js.native
  type StylesHook[S /* <: Styles[_, _, String] */] = js.Function1[
    js.UndefOr[js.Any | (/* props */ PropsOfStyles[S])], 
    ClassNameMap[ClassKeyOfStyles[S]]
  ]
}

