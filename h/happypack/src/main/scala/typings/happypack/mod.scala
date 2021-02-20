package typings.happypack

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("happypack", JSImport.Namespace)
  @js.native
  class ^ protected () extends Plugin {
    def this(options: PluginOptions) = this()
  }
  
  @js.native
  trait PluginOptions extends StObject {
    
    var id: js.UndefOr[String] = js.native
    
    var loaders: js.Any = js.native
    
    var threads: js.UndefOr[Double] = js.native
  }
  object PluginOptions {
    
    @scala.inline
    def apply(loaders: js.Any): PluginOptions = {
      val __obj = js.Dynamic.literal(loaders = loaders.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit class PluginOptionsMutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLoaders(value: js.Any): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    }
  }
  
  type happypack = Plugin
}
