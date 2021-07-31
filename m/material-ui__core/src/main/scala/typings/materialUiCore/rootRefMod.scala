package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.rootRefRootRefMod.RootRefProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootRefMod extends Shortcut {
  
  @JSImport("@material-ui/core/RootRef", JSImport.Default)
  @js.native
  val default: ComponentType[RootRefProps[js.Any]] = js.native
  
  type _To = ComponentType[RootRefProps[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `rootRefMod.foo` */
  override def _to: ComponentType[RootRefProps[js.Any]] = default
}
