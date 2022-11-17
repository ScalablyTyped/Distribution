package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.bottomNavigationBottomNavigationMod.BottomNavigationTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Bottom Navigation](https://mui.com/components/bottom-navigation/)
    *
    * API:
    *
    * - [BottomNavigation API](https://mui.com/api/bottom-navigation/)
    */
  @JSImport("@material-ui/core/BottomNavigation", JSImport.Default)
  @js.native
  val default: OverridableComponent[BottomNavigationTypeMap[js.Object, "div"]] = js.native
  
  type _To = OverridableComponent[BottomNavigationTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `bottomNavigationMod.foo` */
  override def _to: OverridableComponent[BottomNavigationTypeMap[js.Object, "div"]] = default
}
