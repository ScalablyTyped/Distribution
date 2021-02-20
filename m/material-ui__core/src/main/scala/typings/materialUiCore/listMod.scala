package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.listListMod.ListProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod extends Shortcut {
  
  @JSImport("@material-ui/core/List", JSImport.Default)
  @js.native
  val default: ComponentType[ListProps] = js.native
  
  type _To = ComponentType[ListProps]
  
  /* This means you don't have to write `default`, but can instead just say `listMod.foo` */
  override def _to: ComponentType[ListProps] = default
}
