package typings.jestPnpResolver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-pnp-resolver", JSImport.Default)
  @js.native
  def default(request: String, options: JestResolverOptions): String = js.native
  
  @js.native
  trait JestResolverOptions extends StObject {
    
    var basedir: String = js.native
    
    def defaultResolver(request: String, opts: js.Any): String = js.native
    
    var extensions: js.UndefOr[js.Array[String]] = js.native
  }
  object JestResolverOptions {
    
    @scala.inline
    def apply(basedir: String, defaultResolver: (String, js.Any) => String): JestResolverOptions = {
      val __obj = js.Dynamic.literal(basedir = basedir.asInstanceOf[js.Any], defaultResolver = js.Any.fromFunction2(defaultResolver))
      __obj.asInstanceOf[JestResolverOptions]
    }
    
    @scala.inline
    implicit class JestResolverOptionsMutableBuilder[Self <: JestResolverOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultResolver(value: (String, js.Any) => String): Self = StObject.set(x, "defaultResolver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    }
  }
}
