package typings.koaSubdomain

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaRouter.mod.IMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-subdomain", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Subdomain {
    
    /* CompleteClass */
    override def `match`(subdomains: js.Array[String]): MatchResult | Null = js.native
    
    /* CompleteClass */
    override def routes(): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    /* CompleteClass */
    override def use(domain: String, router: IMiddleware[Any, js.Object]): Subdomain = js.native
  }
  
  trait MatchResult extends StObject {
    
    var middleware: IMiddleware[Any, js.Object]
    
    var wildcardSubdomains: js.Array[String]
  }
  object MatchResult {
    
    inline def apply(middleware: IMiddleware[Any, js.Object], wildcardSubdomains: js.Array[String]): MatchResult = {
      val __obj = js.Dynamic.literal(middleware = middleware.asInstanceOf[js.Any], wildcardSubdomains = wildcardSubdomains.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchResult]
    }
    
    extension [Self <: MatchResult](x: Self) {
      
      inline def setMiddleware(value: IMiddleware[Any, js.Object]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      inline def setWildcardSubdomains(value: js.Array[String]): Self = StObject.set(x, "wildcardSubdomains", value.asInstanceOf[js.Any])
      
      inline def setWildcardSubdomainsVarargs(value: String*): Self = StObject.set(x, "wildcardSubdomains", js.Array(value*))
    }
  }
  
  trait Subdomain extends StObject {
    
    def `match`(subdomains: js.Array[String]): MatchResult | Null
    
    def routes(): Middleware[DefaultState, DefaultContext, Any]
    
    def use(domain: String, router: IMiddleware[Any, js.Object]): Subdomain
  }
  object Subdomain {
    
    inline def apply(
      `match`: js.Array[String] => MatchResult | Null,
      routes: () => Middleware[DefaultState, DefaultContext, Any],
      use: (String, IMiddleware[Any, js.Object]) => Subdomain
    ): Subdomain = {
      val __obj = js.Dynamic.literal(routes = js.Any.fromFunction0(routes), use = js.Any.fromFunction2(use))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[Subdomain]
    }
    
    extension [Self <: Subdomain](x: Self) {
      
      inline def setMatch(value: js.Array[String] => MatchResult | Null): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setRoutes(value: () => Middleware[DefaultState, DefaultContext, Any]): Self = StObject.set(x, "routes", js.Any.fromFunction0(value))
      
      inline def setUse(value: (String, IMiddleware[Any, js.Object]) => Subdomain): Self = StObject.set(x, "use", js.Any.fromFunction2(value))
    }
  }
}
