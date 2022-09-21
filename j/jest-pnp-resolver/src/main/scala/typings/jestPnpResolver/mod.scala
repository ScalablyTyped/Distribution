package typings.jestPnpResolver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-pnp-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(request: String, options: JestResolverOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait JestResolverOptions extends StObject {
    
    var basedir: String
    
    def defaultResolver(request: String, opts: Any): String
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object JestResolverOptions {
    
    inline def apply(basedir: String, defaultResolver: (String, Any) => String): JestResolverOptions = {
      val __obj = js.Dynamic.literal(basedir = basedir.asInstanceOf[js.Any], defaultResolver = js.Any.fromFunction2(defaultResolver))
      __obj.asInstanceOf[JestResolverOptions]
    }
    
    extension [Self <: JestResolverOptions](x: Self) {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setDefaultResolver(value: (String, Any) => String): Self = StObject.set(x, "defaultResolver", js.Any.fromFunction2(value))
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    }
  }
}
