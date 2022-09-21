package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowsMod extends Shortcut {
  
  @JSImport("@material-ui/core/styles/shadows", JSImport.Default)
  @js.native
  val default: Shadows = js.native
  
  type Shadows = js.Array[Any]
  
  type _To = Shadows
  
  /* This means you don't have to write `default`, but can instead just say `shadowsMod.foo` */
  override def _to: Shadows = default
}
