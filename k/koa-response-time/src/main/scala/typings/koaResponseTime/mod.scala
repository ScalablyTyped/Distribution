package typings.koaResponseTime

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Add X-Response-Time header field.
    * @param options options dictionary. { hrtime }
    *
    *        hrtime: boolean.
    *          `true` to use time in nanoseconds.
    *          `false` to use time in milliseconds.
    *          Default is `false` to keep back compatible.
    * @api public
    */
  inline def apply(): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(options: KoaResponseTimeOptions): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-response-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait KoaResponseTimeOptions extends StObject {
    
    var hrtime: js.UndefOr[Boolean] = js.undefined
  }
  object KoaResponseTimeOptions {
    
    inline def apply(): KoaResponseTimeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KoaResponseTimeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KoaResponseTimeOptions] (val x: Self) extends AnyVal {
      
      inline def setHrtime(value: Boolean): Self = StObject.set(x, "hrtime", value.asInstanceOf[js.Any])
      
      inline def setHrtimeUndefined: Self = StObject.set(x, "hrtime", js.undefined)
    }
  }
}
