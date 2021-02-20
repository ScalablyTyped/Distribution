package typings.koaIgnore

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaIgnore.anon.If
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-ignore", JSImport.Namespace)
  @js.native
  def apply(middleware: (Middleware[DefaultState, DefaultContext])*): If = js.native
}
