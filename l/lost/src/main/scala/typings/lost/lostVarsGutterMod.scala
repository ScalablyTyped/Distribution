package typings.lost

import org.scalablytyped.runtime.Shortcut
import typings.lost.mod.LostLib
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lostVarsGutterMod extends Shortcut {
  
  @JSImport("lost/lib/lost-vars-gutter", JSImport.Namespace)
  @js.native
  val ^ : LostLib[js.UndefOr[String]] = js.native
  
  type _To = LostLib[js.UndefOr[String]]
  
  /* This means you don't have to write `^`, but can instead just say `lostVarsGutterMod.foo` */
  override def _to: LostLib[js.UndefOr[String]] = ^
}
