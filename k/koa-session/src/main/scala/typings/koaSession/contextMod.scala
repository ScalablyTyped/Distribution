package typings.koaSession

import org.scalablytyped.runtime.Shortcut
import typings.koaSession.mod.ContextSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod extends Shortcut {
  
  @JSImport("koa-session/lib/context", JSImport.Namespace)
  @js.native
  val ^ : ContextSession = js.native
  
  type _To = ContextSession
  
  /* This means you don't have to write `^`, but can instead just say `contextMod.foo` */
  override def _to: ContextSession = ^
}
