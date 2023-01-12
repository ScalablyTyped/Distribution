package typings.koaProxies

import org.scalablytyped.runtime.StringDictionary
import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaProxies.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String, options: IKoaProxiesOptions): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(path: js.Array[String | js.RegExp], options: IKoaProxiesOptions): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(path: js.RegExp, options: IKoaProxiesOptions): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-proxies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IBaseKoaProxiesOptions extends StObject {
    
    var agent: js.UndefOr[Any] = js.undefined
    
    var changeOrigin: js.UndefOr[Boolean] = js.undefined
    
    var events: js.UndefOr[Error] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var logs: js.UndefOr[Boolean | (js.Function2[/* ctx */ Context, /* target */ String, Unit])] = js.undefined
    
    var rewrite: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
    
    var target: String
  }
  object IBaseKoaProxiesOptions {
    
    inline def apply(target: String): IBaseKoaProxiesOptions = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBaseKoaProxiesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBaseKoaProxiesOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setChangeOrigin(value: Boolean): Self = StObject.set(x, "changeOrigin", value.asInstanceOf[js.Any])
      
      inline def setChangeOriginUndefined: Self = StObject.set(x, "changeOrigin", js.undefined)
      
      inline def setEvents(value: Error): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setLogs(value: Boolean | (js.Function2[/* ctx */ Context, /* target */ String, Unit])): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      inline def setLogsFunction2(value: (/* ctx */ Context, /* target */ String) => Unit): Self = StObject.set(x, "logs", js.Any.fromFunction2(value))
      
      inline def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
      
      inline def setRewrite(value: /* path */ String => String): Self = StObject.set(x, "rewrite", js.Any.fromFunction1(value))
      
      inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type IKoaProxiesOptions = String | IBaseKoaProxiesOptions | IKoaProxiesOptionsFunc
  
  type IKoaProxiesOptionsFunc = js.Function2[/* params */ StringDictionary[String], /* ctx */ Context, IBaseKoaProxiesOptions]
}
