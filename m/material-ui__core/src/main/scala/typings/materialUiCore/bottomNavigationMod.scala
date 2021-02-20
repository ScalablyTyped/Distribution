package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.bottomNavigationBottomNavigationMod.BottomNavigationProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationMod extends Shortcut {
  
  @JSImport("@material-ui/core/BottomNavigation", JSImport.Default)
  @js.native
  val default: ComponentType[BottomNavigationProps] = js.native
  
  type _To = ComponentType[BottomNavigationProps]
  
  /* This means you don't have to write `default`, but can instead just say `bottomNavigationMod.foo` */
  override def _to: ComponentType[BottomNavigationProps] = default
}
