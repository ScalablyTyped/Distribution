package typings.gulpImagemin

import typings.imagemin.mod.Plugin
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply(pluginsOrOptions: js.Array[Plugin]): Transform = ^.asInstanceOf[js.Dynamic].apply(pluginsOrOptions.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(pluginsOrOptions: Options): Transform = ^.asInstanceOf[js.Dynamic].apply(pluginsOrOptions.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(plugins: js.Array[Plugin], options: Options): Transform = (^.asInstanceOf[js.Dynamic].apply(plugins.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(plugins: Unit, options: Options): Transform = (^.asInstanceOf[js.Dynamic].apply(plugins.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  @JSImport("gulp-imagemin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gulp-imagemin", "gifsicle")
  @js.native
  val gifsicle: PluginFactory[typings.imageminGifsicle.mod.Options] = js.native
  
  @JSImport("gulp-imagemin", "mozjpeg")
  @js.native
  val mozjpeg: PluginFactory[typings.imageminMozjpeg.mod.Options] = js.native
  
  @JSImport("gulp-imagemin", "optipng")
  @js.native
  val optipng: PluginFactory[typings.imageminOptipng.mod.Options] = js.native
  
  @JSImport("gulp-imagemin", "svgo")
  @js.native
  val svgo: PluginFactory[typings.imageminSvgo.mod.Options] = js.native
  
  trait Options extends StObject {
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type PluginFactory[T] = js.Function1[/* options */ js.UndefOr[T], Plugin]
}
