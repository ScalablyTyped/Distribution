package typings.lost

import org.scalablytyped.runtime.Shortcut
import typings.lost.mod.LostLibResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lostColumnMod extends Shortcut {
  
  @JSImport("lost/lib/lost-column", JSImport.Namespace)
  @js.native
  val ^ : LostLibResult[Unit] = js.native
  
  type _To = LostLibResult[Unit]
  
  /* This means you don't have to write `^`, but can instead just say `lostColumnMod.foo` */
  override def _to: LostLibResult[Unit] = ^
}
