package typings.gulpImageResize

import typings.gm.mod.FilterType
import typings.gm.mod.GravityDirection
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  @scala.inline
  def apply(options: Options): Transform = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("gulp-image-resize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var cover: js.UndefOr[Boolean] = js.undefined
    
    var crop: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[FilterType] = js.undefined
    
    var flatten: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var gravity: js.UndefOr[GravityDirection] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var imageMagick: js.UndefOr[Boolean] = js.undefined
    
    var interlace: js.UndefOr[Boolean] = js.undefined
    
    var noProfile: js.UndefOr[Boolean] = js.undefined
    
    var percentage: js.UndefOr[Double] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var samplingFactor: js.UndefOr[SamplingFactor] = js.undefined
    
    var sharpen: js.UndefOr[Boolean | String] = js.undefined
    
    var upscale: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
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
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setCover(value: Boolean): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
      
      @scala.inline
      def setCrop(value: Boolean): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      @scala.inline
      def setFilter(value: FilterType): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGravity(value: GravityDirection): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setImageMagick(value: Boolean): Self = StObject.set(x, "imageMagick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageMagickUndefined: Self = StObject.set(x, "imageMagick", js.undefined)
      
      @scala.inline
      def setInterlace(value: Boolean): Self = StObject.set(x, "interlace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterlaceUndefined: Self = StObject.set(x, "interlace", js.undefined)
      
      @scala.inline
      def setNoProfile(value: Boolean): Self = StObject.set(x, "noProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoProfileUndefined: Self = StObject.set(x, "noProfile", js.undefined)
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setSamplingFactor(value: SamplingFactor): Self = StObject.set(x, "samplingFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplingFactorUndefined: Self = StObject.set(x, "samplingFactor", js.undefined)
      
      @scala.inline
      def setSharpen(value: Boolean | String): Self = StObject.set(x, "sharpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharpenUndefined: Self = StObject.set(x, "sharpen", js.undefined)
      
      @scala.inline
      def setUpscale(value: Boolean): Self = StObject.set(x, "upscale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpscaleUndefined: Self = StObject.set(x, "upscale", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type SamplingFactor = js.Tuple2[Double, Double]
}
