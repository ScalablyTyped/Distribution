package typings.koaProxies

import org.scalablytyped.runtime.StringDictionary
import typings.httpProxy.mod.ServerOptions
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(context: String, options: Options): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("koa-proxies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with ServerOptions {
    
    var events: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]] = js.undefined
    
    var logs: js.UndefOr[Boolean] = js.undefined
    
    var rewrite: js.UndefOr[js.Function2[/* url */ String, /* ctx */ DefaultContext, String]] = js.undefined
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
      def setEvents(value: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setLogs(value: Boolean): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
      
      @scala.inline
      def setRewrite(value: (/* url */ String, /* ctx */ DefaultContext) => String): Self = StObject.set(x, "rewrite", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
    }
  }
}
