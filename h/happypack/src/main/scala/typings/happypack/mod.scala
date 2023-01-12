package typings.happypack

import typings.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("happypack", JSImport.Namespace)
  @js.native
  open class ^ protected () extends StObject {
    def this(options: PluginOptions) = this()
  }
  
  trait PluginOptions extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var loaders: Any
    
    var threads: js.UndefOr[Double] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(loaders: Any): PluginOptions = {
      val __obj = js.Dynamic.literal(loaders = loaders.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLoaders(value: Any): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    }
  }
  
  type happypack = Plugin
}
