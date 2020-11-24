package typings.imageminPngquant.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDithering(value: Double | Boolean): Self = this.set("dithering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDithering: Self = this.set("dithering", js.undefined)
    
    @scala.inline
    def setPosterize(value: Double): Self = this.set("posterize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosterize: Self = this.set("posterize", js.undefined)
    
    @scala.inline
    def setQuality(value: js.Tuple2[Double, Double]): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setStrip(value: Boolean): Self = this.set("strip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrip: Self = this.set("strip", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
