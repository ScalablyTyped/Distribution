package typings.happypack

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("happypack", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Plugin {
    def this(options: PluginOptions) = this()
  }
  
  trait PluginOptions extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var loaders: js.Any
    
    var threads: js.UndefOr[Double] = js.undefined
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
