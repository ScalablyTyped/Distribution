package typings.loadableWebpackPlugin

import typings.loadableWebpackPlugin.anon.Filename
import typings.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("@loadable/webpack-plugin", JSImport.Default)
  @js.native
  open class default () extends StObject {
    def this(options: PluginOptions) = this()
  }
  
  type LoadablePlugin = Plugin
  
  trait PluginOptions extends StObject {
    
    /**
      * The stats filename.
      *
      * @default loadable-stats.json
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * @default true
      */
    var outputAsset: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Always write stats file to disk.
      *
      * @default false
      */
    var writeToDisk: js.UndefOr[Boolean | Filename] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setOutputAsset(value: Boolean): Self = StObject.set(x, "outputAsset", value.asInstanceOf[js.Any])
      
      inline def setOutputAssetUndefined: Self = StObject.set(x, "outputAsset", js.undefined)
      
      inline def setWriteToDisk(value: Boolean | Filename): Self = StObject.set(x, "writeToDisk", value.asInstanceOf[js.Any])
      
      inline def setWriteToDiskUndefined: Self = StObject.set(x, "writeToDisk", js.undefined)
    }
  }
}
