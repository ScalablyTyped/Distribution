package typings.imageminPngquant

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("imagemin-pngquant", JSImport.Default)
  @js.native
  def default(): Plugin = js.native
  @JSImport("imagemin-pngquant", JSImport.Default)
  @js.native
  def default(options: Options): Plugin = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    	Set the dithering level using a fractional number between 0 (none) and 1 (full).
    	Pass in `false` to disable dithering.
    	Values: 0...1
    	@default 1
    	*/
    var dithering: js.UndefOr[Double | Boolean] = js.native
    
    /**
    	Truncate number of least significant bits of color (per channel).
    	Use this when image will be output on low-depth displays (e.g. 16-bit RGB). pngquant will make almost-opaque pixels fully opaque and will reduce amount of semi-transparent colors.
    	*/
    var posterize: js.UndefOr[Double] = js.native
    
    /**
    	Instructs pngquant to use the least amount of colors required to meet or exceed the max quality. If conversion results in quality below the min quality the image won't be saved.
    	Min and max are numbers in range 0 (worst) to 1 (perfect), similar to JPEG.
    	Values: `[0...1, 0...1]`
    	@example [0.3, 0.5]
    	*/
    var quality: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    /**
    	Speed `10` has 5% lower quality, but is about 8 times faster than the default. Speed `11` disables dithering and lowers compression level.
    	Values: `1` (brute-force) to `11` (fastest)
    	@default 3
    	*/
    var speed: js.UndefOr[Double] = js.native
    
    /**
    	Remove optional metadata.
    	@default false
    	*/
    var strip: js.UndefOr[Boolean] = js.native
    
    /**
    	Print verbose status messages.
    	@default false
    	*/
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
      def setDithering(value: Double | Boolean): Self = StObject.set(x, "dithering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDitheringUndefined: Self = StObject.set(x, "dithering", js.undefined)
      
      @scala.inline
      def setPosterize(value: Double): Self = StObject.set(x, "posterize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosterizeUndefined: Self = StObject.set(x, "posterize", js.undefined)
      
      @scala.inline
      def setQuality(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type Plugin = js.Function1[/* input */ Buffer | ReadableStream, js.Promise[Buffer]]
}
