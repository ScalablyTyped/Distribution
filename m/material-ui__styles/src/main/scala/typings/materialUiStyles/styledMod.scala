package typings.materialUiStyles

import typings.materialUiStyles.styledStyledMod.ComponentCreator
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledMod {
  
  @JSImport("@material-ui/styles/styled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Component /* <: ElementType[js.Any] */](Component: Component): ComponentCreator[Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentCreator[Component]]
}
