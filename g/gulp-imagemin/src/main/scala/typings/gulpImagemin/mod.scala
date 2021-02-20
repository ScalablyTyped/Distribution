package typings.gulpImagemin

import typings.imagemin.mod.Plugin
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-imagemin", JSImport.Namespace)
  @js.native
  def apply(): Transform = js.native
  @JSImport("gulp-imagemin", JSImport.Namespace)
  @js.native
  def apply(pluginsOrOptions: js.Array[Plugin]): Transform = js.native
  @JSImport("gulp-imagemin", JSImport.Namespace)
  @js.native
  def apply(pluginsOrOptions: Options): Transform = js.native
  @JSImport("gulp-imagemin", JSImport.Namespace)
  @js.native
  def apply(plugins: js.UndefOr[scala.Nothing], options: Options): Transform = js.native
  @JSImport("gulp-imagemin", JSImport.Namespace)
  @js.native
  def apply(plugins: js.Array[Plugin], options: Options): Transform = js.native
  
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
  
  @js.native
  trait Options extends StObject {
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type PluginFactory[T] = js.Function1[/* options */ js.UndefOr[T], Plugin]
}
