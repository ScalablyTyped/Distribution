package typings.koa2Ratelimit

import org.scalablytyped.runtime.TopLevel
import typings.koa.mod.Context
import typings.koa.mod.Next
import typings.koa2Ratelimit.anon.PartialRateLimitOptions
import typings.koa2Ratelimit.anon.TypeofRateLimit
import typings.koa2Ratelimit.mod.RateLimitOptions
import typings.koa2Ratelimit.storeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa2-ratelimit/src/RateLimit", JSImport.Namespace)
@js.native
object rateLimitMod extends js.Object {
  
  def defaultOptions(): Unit = js.native
  def defaultOptions(options: PartialRateLimitOptions): Unit = js.native
  
  def middleware(): js.Function2[/* ctx */ Context, /* next */ Next, js.Promise[_]] = js.native
  def middleware(options: PartialRateLimitOptions): js.Function2[/* ctx */ Context, /* next */ Next, js.Promise[_]] = js.native
  
  @js.native
  trait RateLimit extends js.Object {
    
    /* protected */ def _isWhitelisted(key: String): Boolean = js.native
    
    /* protected */ def _rateLimit(ctx: Context, next: Next): js.Promise[_] = js.native
    
    def getUserId(ctx: Context): js.Promise[_] = js.native
    
    def handler(ctx: Context): js.Promise[Unit] = js.native
    
    def keyGenerator(ctx: Context): js.Promise[String] = js.native
    
    def middleware: js.Function2[/* ctx */ Context, /* next */ Next, js.Promise[_]] = js.native
    
    def onLimitReached(ctx: Context): js.Promise[Unit] = js.native
    
    var options: RateLimitOptions = js.native
    
    def skip(ctx: Context): js.Promise[Boolean] = js.native
    
    var store: ^ = js.native
    
    def weight(ctx: Context): js.Promise[Double] = js.native
  }
  @js.native
  object RateLimit extends TopLevel[TypeofRateLimit]
}
