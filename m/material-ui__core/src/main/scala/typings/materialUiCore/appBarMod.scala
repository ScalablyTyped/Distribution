package typings.materialUiCore

import typings.materialUiCore.appBarAppBarMod.AppBarProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appBarMod {
  
  @JSImport("@material-ui/core/AppBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: AppBarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
