package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.paperPaperMod.PaperProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paperMod extends Shortcut {
  
  @JSImport("@material-ui/core/Paper", JSImport.Default)
  @js.native
  val default: ComponentType[PaperProps] = js.native
  
  type _To = ComponentType[PaperProps]
  
  /* This means you don't have to write `default`, but can instead just say `paperMod.foo` */
  override def _to: ComponentType[PaperProps] = default
}
