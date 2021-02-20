package typings.koaLog

import typings.koa.mod.BaseContext
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koa.mod.ParameterizedContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-log", JSImport.Namespace)
  @js.native
  def apply(`type`: String): Middleware[DefaultState, DefaultContext] = js.native
  
  object morgan {
    
    @JSImport("koa-log", "morgan.cookie")
    @js.native
    def cookie(ctx: BaseContext, key: String): String = js.native
    
    @JSImport("koa-log", "morgan.date")
    @js.native
    def date(ctx: BaseContext, format: String): String = js.native
    
    @JSImport("koa-log", "morgan.format")
    @js.native
    def format(name: String): String = js.native
    
    @JSImport("koa-log", "morgan.length")
    @js.native
    def length(ctx: BaseContext): js.UndefOr[Double] = js.native
    
    @JSImport("koa-log", "morgan.method")
    @js.native
    def method(ctx: BaseContext): String = js.native
    
    @JSImport("koa-log", "morgan.referrer")
    @js.native
    def referrer(ctx: BaseContext): String = js.native
    
    @JSImport("koa-log", "morgan.status")
    @js.native
    def status(ctx: BaseContext): Double = js.native
    
    @JSImport("koa-log", "morgan.token")
    @js.native
    def token(
      name: String,
      fn: js.Function1[/* ctx */ ParameterizedContext[DefaultState, DefaultContext], String]
    ): Unit = js.native
    
    @JSImport("koa-log", "morgan.url")
    @js.native
    def url(ctx: BaseContext): String = js.native
  }
}
