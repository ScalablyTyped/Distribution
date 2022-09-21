package typings.history

import org.scalablytyped.runtime.Shortcut
import typings.history.mod.HashHistory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashMod extends Shortcut {
  
  @JSImport("history/hash", JSImport.Default)
  @js.native
  val default: HashHistory = js.native
  
  type _To = HashHistory
  
  /* This means you don't have to write `default`, but can instead just say `hashMod.foo` */
  override def _to: HashHistory = default
}
