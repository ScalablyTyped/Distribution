package typings.loadPlugin

import typings.loadPlugin.loadPluginBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("load-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadPlugin(name: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def loadPlugin(name: String, options: LoadOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def resolvePlugin(name: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePlugin")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def resolvePlugin(name: String, options: ResolveOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePlugin")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait LoadOptions
    extends StObject
       with ResolveOptions {
    
    var key: js.UndefOr[String | `false`] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    extension [Self <: LoadOptions](x: Self) {
      
      inline def setKey(value: String | `false`): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait ResolveOptions extends StObject {
    
    var cwd: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object ResolveOptions {
    
    inline def apply(): ResolveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveOptions]
    }
    
    extension [Self <: ResolveOptions](x: Self) {
      
      inline def setCwd(value: String | js.Array[String]): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setCwdVarargs(value: String*): Self = StObject.set(x, "cwd", js.Array(value*))
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
