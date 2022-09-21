package typings.lost

import org.scalablytyped.runtime.Shortcut
import typings.lost.mod.LostLib
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lostVarsMod extends Shortcut {
  
  @JSImport("lost/lib/lost-vars", JSImport.Namespace)
  @js.native
  val ^ : LostLib[Unit] = js.native
  
  type _To = LostLib[Unit]
  
  /* This means you don't have to write `^`, but can instead just say `lostVarsMod.foo` */
  override def _to: LostLib[Unit] = ^
}
