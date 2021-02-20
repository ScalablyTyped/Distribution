package typings.gulpImage

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-image", JSImport.Namespace)
  @js.native
  def apply(): Transform = js.native
  @JSImport("gulp-image", JSImport.Namespace)
  @js.native
  def apply(options: Options): Transform = js.native
  
  type OptimizerSetting = Boolean | js.Array[js.Any]
  
  @js.native
  trait Options extends StObject {
    
    var concurrent: js.UndefOr[Double] = js.native
    
    var gifsicle: js.UndefOr[OptimizerSetting] = js.native
    
    var guetzli: js.UndefOr[OptimizerSetting] = js.native
    
    var jpegRecompress: js.UndefOr[OptimizerSetting] = js.native
    
    var mozjpeg: js.UndefOr[OptimizerSetting] = js.native
    
    var optipng: js.UndefOr[OptimizerSetting] = js.native
    
    var pngquant: js.UndefOr[OptimizerSetting] = js.native
    
    var quiet: js.UndefOr[Boolean] = js.native
    
    var svgo: js.UndefOr[OptimizerSetting] = js.native
    
    var zopflipng: js.UndefOr[OptimizerSetting] = js.native
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
      def setConcurrent(value: Double): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
      
      @scala.inline
      def setGifsicle(value: OptimizerSetting): Self = StObject.set(x, "gifsicle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGifsicleUndefined: Self = StObject.set(x, "gifsicle", js.undefined)
      
      @scala.inline
      def setGifsicleVarargs(value: js.Any*): Self = StObject.set(x, "gifsicle", js.Array(value :_*))
      
      @scala.inline
      def setGuetzli(value: OptimizerSetting): Self = StObject.set(x, "guetzli", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuetzliUndefined: Self = StObject.set(x, "guetzli", js.undefined)
      
      @scala.inline
      def setGuetzliVarargs(value: js.Any*): Self = StObject.set(x, "guetzli", js.Array(value :_*))
      
      @scala.inline
      def setJpegRecompress(value: OptimizerSetting): Self = StObject.set(x, "jpegRecompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJpegRecompressUndefined: Self = StObject.set(x, "jpegRecompress", js.undefined)
      
      @scala.inline
      def setJpegRecompressVarargs(value: js.Any*): Self = StObject.set(x, "jpegRecompress", js.Array(value :_*))
      
      @scala.inline
      def setMozjpeg(value: OptimizerSetting): Self = StObject.set(x, "mozjpeg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozjpegUndefined: Self = StObject.set(x, "mozjpeg", js.undefined)
      
      @scala.inline
      def setMozjpegVarargs(value: js.Any*): Self = StObject.set(x, "mozjpeg", js.Array(value :_*))
      
      @scala.inline
      def setOptipng(value: OptimizerSetting): Self = StObject.set(x, "optipng", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptipngUndefined: Self = StObject.set(x, "optipng", js.undefined)
      
      @scala.inline
      def setOptipngVarargs(value: js.Any*): Self = StObject.set(x, "optipng", js.Array(value :_*))
      
      @scala.inline
      def setPngquant(value: OptimizerSetting): Self = StObject.set(x, "pngquant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPngquantUndefined: Self = StObject.set(x, "pngquant", js.undefined)
      
      @scala.inline
      def setPngquantVarargs(value: js.Any*): Self = StObject.set(x, "pngquant", js.Array(value :_*))
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setSvgo(value: OptimizerSetting): Self = StObject.set(x, "svgo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgoUndefined: Self = StObject.set(x, "svgo", js.undefined)
      
      @scala.inline
      def setSvgoVarargs(value: js.Any*): Self = StObject.set(x, "svgo", js.Array(value :_*))
      
      @scala.inline
      def setZopflipng(value: OptimizerSetting): Self = StObject.set(x, "zopflipng", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZopflipngUndefined: Self = StObject.set(x, "zopflipng", js.undefined)
      
      @scala.inline
      def setZopflipngVarargs(value: js.Any*): Self = StObject.set(x, "zopflipng", js.Array(value :_*))
    }
  }
}
