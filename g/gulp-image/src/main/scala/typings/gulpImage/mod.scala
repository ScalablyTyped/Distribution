package typings.gulpImage

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply(options: Options): Transform = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("gulp-image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type OptimizerSetting = Boolean | js.Array[js.Any]
  
  trait Options extends StObject {
    
    var concurrent: js.UndefOr[Double] = js.undefined
    
    var gifsicle: js.UndefOr[OptimizerSetting] = js.undefined
    
    var guetzli: js.UndefOr[OptimizerSetting] = js.undefined
    
    var jpegRecompress: js.UndefOr[OptimizerSetting] = js.undefined
    
    var mozjpeg: js.UndefOr[OptimizerSetting] = js.undefined
    
    var optipng: js.UndefOr[OptimizerSetting] = js.undefined
    
    var pngquant: js.UndefOr[OptimizerSetting] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var svgo: js.UndefOr[OptimizerSetting] = js.undefined
    
    var zopflipng: js.UndefOr[OptimizerSetting] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConcurrent(value: Double): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
      
      inline def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
      
      inline def setGifsicle(value: OptimizerSetting): Self = StObject.set(x, "gifsicle", value.asInstanceOf[js.Any])
      
      inline def setGifsicleUndefined: Self = StObject.set(x, "gifsicle", js.undefined)
      
      inline def setGifsicleVarargs(value: js.Any*): Self = StObject.set(x, "gifsicle", js.Array(value :_*))
      
      inline def setGuetzli(value: OptimizerSetting): Self = StObject.set(x, "guetzli", value.asInstanceOf[js.Any])
      
      inline def setGuetzliUndefined: Self = StObject.set(x, "guetzli", js.undefined)
      
      inline def setGuetzliVarargs(value: js.Any*): Self = StObject.set(x, "guetzli", js.Array(value :_*))
      
      inline def setJpegRecompress(value: OptimizerSetting): Self = StObject.set(x, "jpegRecompress", value.asInstanceOf[js.Any])
      
      inline def setJpegRecompressUndefined: Self = StObject.set(x, "jpegRecompress", js.undefined)
      
      inline def setJpegRecompressVarargs(value: js.Any*): Self = StObject.set(x, "jpegRecompress", js.Array(value :_*))
      
      inline def setMozjpeg(value: OptimizerSetting): Self = StObject.set(x, "mozjpeg", value.asInstanceOf[js.Any])
      
      inline def setMozjpegUndefined: Self = StObject.set(x, "mozjpeg", js.undefined)
      
      inline def setMozjpegVarargs(value: js.Any*): Self = StObject.set(x, "mozjpeg", js.Array(value :_*))
      
      inline def setOptipng(value: OptimizerSetting): Self = StObject.set(x, "optipng", value.asInstanceOf[js.Any])
      
      inline def setOptipngUndefined: Self = StObject.set(x, "optipng", js.undefined)
      
      inline def setOptipngVarargs(value: js.Any*): Self = StObject.set(x, "optipng", js.Array(value :_*))
      
      inline def setPngquant(value: OptimizerSetting): Self = StObject.set(x, "pngquant", value.asInstanceOf[js.Any])
      
      inline def setPngquantUndefined: Self = StObject.set(x, "pngquant", js.undefined)
      
      inline def setPngquantVarargs(value: js.Any*): Self = StObject.set(x, "pngquant", js.Array(value :_*))
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setSvgo(value: OptimizerSetting): Self = StObject.set(x, "svgo", value.asInstanceOf[js.Any])
      
      inline def setSvgoUndefined: Self = StObject.set(x, "svgo", js.undefined)
      
      inline def setSvgoVarargs(value: js.Any*): Self = StObject.set(x, "svgo", js.Array(value :_*))
      
      inline def setZopflipng(value: OptimizerSetting): Self = StObject.set(x, "zopflipng", value.asInstanceOf[js.Any])
      
      inline def setZopflipngUndefined: Self = StObject.set(x, "zopflipng", js.undefined)
      
      inline def setZopflipngVarargs(value: js.Any*): Self = StObject.set(x, "zopflipng", js.Array(value :_*))
    }
  }
}
