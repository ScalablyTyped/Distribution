package typings.kompression

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.kompression.mod.Kompression.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext]]
  inline def apply(options: Options): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("kompression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Kompression {
    
    trait Options extends StObject {
      
      var filter: js.UndefOr[js.Function1[/* contentType */ String, Boolean]] = js.undefined
      
      var threshold: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setFilter(value: /* contentType */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
        
        inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      }
    }
  }
}
