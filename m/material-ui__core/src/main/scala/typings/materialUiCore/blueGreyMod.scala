package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blueGreyMod extends Shortcut {
  
  @JSImport("@material-ui/core/colors/blueGrey", JSImport.Default)
  @js.native
  val default: Color = js.native
  
  type _To = Color
  
  /* This means you don't have to write `default`, but can instead just say `blueGreyMod.foo` */
  override def _to: Color = default
}
