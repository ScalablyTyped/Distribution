package typings.materialUiCore

import typings.materialUiStyles.withStylesWithStylesMod.StyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesCreateStylesMod {
  
  @JSImport("@material-ui/core/styles/createStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ClassKey /* <: String */, Props /* <: js.Object */](styles: StyleRules[Props, ClassKey]): StyleRules[Props, ClassKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any]).asInstanceOf[StyleRules[Props, ClassKey]]
}
