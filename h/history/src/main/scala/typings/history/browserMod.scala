package typings.history

import org.scalablytyped.runtime.Shortcut
import typings.history.mod.BrowserHistory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod extends Shortcut {
  
  @JSImport("history/browser", JSImport.Default)
  @js.native
  val default: BrowserHistory = js.native
  
  type _To = BrowserHistory
  
  /* This means you don't have to write `default`, but can instead just say `browserMod.foo` */
  override def _to: BrowserHistory = default
}
