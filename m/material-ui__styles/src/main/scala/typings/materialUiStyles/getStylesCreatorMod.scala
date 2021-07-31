package typings.materialUiStyles

import typings.materialUiStyles.getStylesCreatorGetStylesCreatorMod.StylesCreator
import typings.materialUiStyles.withStylesWithStylesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getStylesCreatorMod {
  
  @JSImport("@material-ui/styles/getStylesCreator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[S /* <: Styles[js.Any, js.Any, String] */](style: S): StylesCreator[js.Any, js.Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any]).asInstanceOf[StylesCreator[js.Any, js.Any, String]]
}
