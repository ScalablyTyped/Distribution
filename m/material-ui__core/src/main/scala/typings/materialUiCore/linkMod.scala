package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.linkLinkMod.LinkProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod extends Shortcut {
  
  @JSImport("@material-ui/core/Link", JSImport.Default)
  @js.native
  val default: ComponentType[LinkProps] = js.native
  
  type _To = ComponentType[LinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `linkMod.foo` */
  override def _to: ComponentType[LinkProps] = default
}
