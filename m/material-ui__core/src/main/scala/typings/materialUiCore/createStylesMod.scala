package typings.materialUiCore

import typings.materialUiCore.withStylesMod.StyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createStylesMod {
  
  @JSImport("@material-ui/core/styles/createStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[C /* <: String */](styles: StyleRules[C]): StyleRules[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any]).asInstanceOf[StyleRules[C]]
}
