package typings.koaLog

import typings.koa.mod.BaseContext
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koa.mod.ParameterizedContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(`type`: String): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("koa-log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object morgan {
    
    @JSImport("koa-log", "morgan")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def cookie(ctx: BaseContext, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(ctx.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def date(ctx: BaseContext, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(ctx.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def format(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def length(ctx: BaseContext): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
    
    @scala.inline
    def method(ctx: BaseContext): String = ^.asInstanceOf[js.Dynamic].applyDynamic("method")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def referrer(ctx: BaseContext): String = ^.asInstanceOf[js.Dynamic].applyDynamic("referrer")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def status(ctx: BaseContext): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("status")(ctx.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def token(
      name: String,
      fn: js.Function1[/* ctx */ ParameterizedContext[DefaultState, DefaultContext], String]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("token")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def url(ctx: BaseContext): String = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
