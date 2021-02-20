package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.nativeSelectNativeSelectMod.NativeSelectProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeSelectMod extends Shortcut {
  
  @JSImport("@material-ui/core/NativeSelect", JSImport.Default)
  @js.native
  val default: ComponentType[NativeSelectProps] = js.native
  
  type _To = ComponentType[NativeSelectProps]
  
  /* This means you don't have to write `default`, but can instead just say `nativeSelectMod.foo` */
  override def _to: ComponentType[NativeSelectProps] = default
}
