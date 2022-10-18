package typings.lobibox

import org.scalablytyped.runtime.Shortcut
import typings.lobibox.LobiboxModule.LobiboxStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lobiboxMod extends Shortcut {
  
  @JSImport("Lobibox", JSImport.Namespace)
  @js.native
  val ^ : LobiboxStatic = js.native
  
  type _To = LobiboxStatic
  
  /* This means you don't have to write `^`, but can instead just say `lobiboxMod.foo` */
  override def _to: LobiboxStatic = ^
}
