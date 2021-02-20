package typings.imageminWebp

import typings.imagemin.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * WebP imagemin plugin
    */
  @JSImport("imagemin-webp", JSImport.Namespace)
  @js.native
  def apply(): Plugin = js.native
  @JSImport("imagemin-webp", JSImport.Namespace)
  @js.native
  def apply(options: Options): Plugin = js.native
  
  @js.native
  trait Crop extends Resize {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Crop {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): Crop = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Crop]
    }
    
    @scala.inline
    implicit class CropMutableBuilder[Self <: Crop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.imageminWebp.imageminWebpStrings.all
    - typings.imageminWebp.imageminWebpStrings.none
    - typings.imageminWebp.imageminWebpStrings.exif
    - typings.imageminWebp.imageminWebpStrings.icc
    - typings.imageminWebp.imageminWebpStrings.xmp
  */
  trait Metadata extends StObject
  object Metadata {
    
    @scala.inline
    def all: typings.imageminWebp.imageminWebpStrings.all = "all".asInstanceOf[typings.imageminWebp.imageminWebpStrings.all]
    
    @scala.inline
    def exif: typings.imageminWebp.imageminWebpStrings.exif = "exif".asInstanceOf[typings.imageminWebp.imageminWebpStrings.exif]
    
    @scala.inline
    def icc: typings.imageminWebp.imageminWebpStrings.icc = "icc".asInstanceOf[typings.imageminWebp.imageminWebpStrings.icc]
    
    @scala.inline
    def none: typings.imageminWebp.imageminWebpStrings.none = "none".asInstanceOf[typings.imageminWebp.imageminWebpStrings.none]
    
    @scala.inline
    def xmp: typings.imageminWebp.imageminWebpStrings.xmp = "xmp".asInstanceOf[typings.imageminWebp.imageminWebpStrings.xmp]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Set transparency-compression quality between 0 and 100.
      * @default 100
      */
    var alphaQuality: js.UndefOr[Double] = js.native
    
    /**
      * Adjust filter strength automatically.
      * @default false
      */
    var autoFilter: js.UndefOr[Boolean] = js.native
    
    /**
      * Crop the image.
      */
    var crop: js.UndefOr[Crop] = js.native
    
    /**
      * Set deblocking filter strength between 0 (off) and 100.
      */
    var filter: js.UndefOr[Double] = js.native
    
    /**
      * Encode images losslessly.
      * @default false
      */
    var lossless: js.UndefOr[Boolean] = js.native
    
    /**
      * A list of metadata to copy from the input to the output if present.
      */
    var metadata: js.UndefOr[Metadata | js.Array[Metadata]] = js.native
    
    /**
      * Specify the compression method to use,
      * between 0 (fastest) and 6 (slowest).
      * This parameter controls the trade off between encoding speed
      * and the compressed file size and quality.
      * @default 4
      */
    var method: js.UndefOr[Double] = js.native
    
    /**
      * Encode losslessly with an additional lossy pre-processing step,
      * with a quality factor between
      * 0 (maximum pre-processing) and 100 (same as lossless).
      * @default 100
      */
    var nearLossless: js.UndefOr[Double] = js.native
    
    /**
      * Preset setting.
      * @default default
      */
    var preset: js.UndefOr[Preset] = js.native
    
    /**
      * Set quality factor between 0 and 100.
      * @default 75
      */
    var quality: js.UndefOr[Double] = js.native
    
    /**
      * Resize the image. Happens after crop.
      */
    var resize: js.UndefOr[Resize] = js.native
    
    /**
      * Set filter sharpness between 0 (sharpest) and 7 (least sharp).
      * @default 0
      */
    var sharpness: js.UndefOr[Double] = js.native
    
    /**
      * Set target size in bytes.
      */
    var size: js.UndefOr[Double] = js.native
    
    /**
      * Set the amplitude of spatial noise shaping between 0 and 100.
      * @default 80
      */
    var sns: js.UndefOr[Double] = js.native
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
      def setAlphaQuality(value: Double): Self = StObject.set(x, "alphaQuality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaQualityUndefined: Self = StObject.set(x, "alphaQuality", js.undefined)
      
      @scala.inline
      def setAutoFilter(value: Boolean): Self = StObject.set(x, "autoFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFilterUndefined: Self = StObject.set(x, "autoFilter", js.undefined)
      
      @scala.inline
      def setCrop(value: Crop): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      @scala.inline
      def setFilter(value: Double): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setLossless(value: Boolean): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLosslessUndefined: Self = StObject.set(x, "lossless", js.undefined)
      
      @scala.inline
      def setMetadata(value: Metadata | js.Array[Metadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setMetadataVarargs(value: Metadata*): Self = StObject.set(x, "metadata", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: Double): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setNearLossless(value: Double): Self = StObject.set(x, "nearLossless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearLosslessUndefined: Self = StObject.set(x, "nearLossless", js.undefined)
      
      @scala.inline
      def setPreset(value: Preset): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setResize(value: Resize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setSharpness(value: Double): Self = StObject.set(x, "sharpness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharpnessUndefined: Self = StObject.set(x, "sharpness", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSns(value: Double): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.imageminWebp.imageminWebpStrings.default
    - typings.imageminWebp.imageminWebpStrings.photo
    - typings.imageminWebp.imageminWebpStrings.picture
    - typings.imageminWebp.imageminWebpStrings.drawing
    - typings.imageminWebp.imageminWebpStrings.icon
    - typings.imageminWebp.imageminWebpStrings.text
  */
  trait Preset extends StObject
  object Preset {
    
    @scala.inline
    def default: typings.imageminWebp.imageminWebpStrings.default = "default".asInstanceOf[typings.imageminWebp.imageminWebpStrings.default]
    
    @scala.inline
    def drawing: typings.imageminWebp.imageminWebpStrings.drawing = "drawing".asInstanceOf[typings.imageminWebp.imageminWebpStrings.drawing]
    
    @scala.inline
    def icon: typings.imageminWebp.imageminWebpStrings.icon = "icon".asInstanceOf[typings.imageminWebp.imageminWebpStrings.icon]
    
    @scala.inline
    def photo: typings.imageminWebp.imageminWebpStrings.photo = "photo".asInstanceOf[typings.imageminWebp.imageminWebpStrings.photo]
    
    @scala.inline
    def picture: typings.imageminWebp.imageminWebpStrings.picture = "picture".asInstanceOf[typings.imageminWebp.imageminWebpStrings.picture]
    
    @scala.inline
    def text: typings.imageminWebp.imageminWebpStrings.text = "text".asInstanceOf[typings.imageminWebp.imageminWebpStrings.text]
  }
  
  @js.native
  trait Resize extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Resize {
    
    @scala.inline
    def apply(height: Double, width: Double): Resize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resize]
    }
    
    @scala.inline
    implicit class ResizeMutableBuilder[Self <: Resize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
