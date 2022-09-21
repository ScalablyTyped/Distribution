package typings.koaStatic

import typings.koa.mod.DefaultContext
import typings.koa.mod.Middleware
import typings.koaSend.mod.SendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(root: String): Middleware[js.Object, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Object, DefaultContext, Any]]
  inline def apply(root: String, opts: Options): Middleware[js.Object, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, DefaultContext, Any]]
  
  @JSImport("koa-static", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with SendOptions {
    
    /** If true, serves after return next(), allowing any downstream middleware to respond first. */
    var defer: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    }
  }
}
