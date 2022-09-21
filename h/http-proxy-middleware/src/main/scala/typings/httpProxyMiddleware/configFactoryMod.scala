package typings.httpProxyMiddleware

import typings.httpProxyMiddleware.typesMod.Filter
import typings.httpProxyMiddleware.typesMod.Options
import typings.httpProxyMiddleware.typesMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configFactoryMod {
  
  @JSImport("http-proxy-middleware/dist/config-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConfig(context: Any): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(context.asInstanceOf[js.Any]).asInstanceOf[Config]
  inline def createConfig(context: Any, opts: Options): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(context.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Config]
  
  trait Config extends StObject {
    
    var context: Filter
    
    var options: Options
  }
  object Config {
    
    inline def apply(context: Filter, options: Options): Config = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setContext(value: Filter): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextFunction2(value: (/* pathname */ String, /* req */ Request) => Boolean): Self = StObject.set(x, "context", js.Any.fromFunction2(value))
      
      inline def setContextVarargs(value: String*): Self = StObject.set(x, "context", js.Array(value*))
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
