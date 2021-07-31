package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.selectSelectMod.SelectProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod extends Shortcut {
  
  @JSImport("@material-ui/core/Select", JSImport.Default)
  @js.native
  val default: ComponentType[SelectProps] = js.native
  
  type _To = ComponentType[SelectProps]
  
  /* This means you don't have to write `default`, but can instead just say `selectMod.foo` */
  override def _to: ComponentType[SelectProps] = default
}
