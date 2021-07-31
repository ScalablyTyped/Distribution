package typings.kompression

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.kompression.mod.Kompression.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("kompression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Kompression {
    
    trait Options extends StObject {
      
      var filter: js.UndefOr[js.Function1[/* contentType */ String, Boolean]] = js.undefined
      
      var threshold: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilter(value: /* contentType */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        @scala.inline
        def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      }
    }
  }
}
