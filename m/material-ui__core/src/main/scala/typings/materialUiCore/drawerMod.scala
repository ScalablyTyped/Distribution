package typings.materialUiCore

import typings.materialUiCore.drawerDrawerMod.DrawerProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerMod {
  
  @JSImport("@material-ui/core/Drawer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: DrawerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
