package typings.lost

import org.scalablytyped.runtime.Shortcut
import typings.lost.mod.LostLibResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLostCenterMod extends Shortcut {
  
  @JSImport("lost/lib/lost-center", JSImport.Namespace)
  @js.native
  val ^ : LostLibResult[Boolean] = js.native
  
  type _To = LostLibResult[Boolean]
  
  /* This means you don't have to write `^`, but can instead just say `libLostCenterMod.foo` */
  override def _to: LostLibResult[Boolean] = ^
}
