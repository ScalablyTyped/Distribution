package typings.imagemagickNative

import typings.imagemagickNative.anon.Height
import typings.imagemagickNative.anon.Orientation
import typings.node.Buffer
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object streams {
    
    @JSImport("imagemagick-native", "streams.convert")
    @js.native
    def convert(options: IStreamConvertOptions): Transform = js.native
  }
  
  @js.native
  trait ICompositeOptions extends StObject {
    
    var compositeData: Buffer = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var gravity: js.UndefOr[String] = js.native
    
    var ignoreWarnings: js.UndefOr[Boolean] = js.native
    
    var srcData: Buffer = js.native
  }
  object ICompositeOptions {
    
    @scala.inline
    def apply(compositeData: Buffer, srcData: Buffer): ICompositeOptions = {
      val __obj = js.Dynamic.literal(compositeData = compositeData.asInstanceOf[js.Any], srcData = srcData.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICompositeOptions]
    }
    
    @scala.inline
    implicit class ICompositeOptionsMutableBuilder[Self <: ICompositeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompositeData(value: Buffer): Self = StObject.set(x, "compositeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setGravity(value: String): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      @scala.inline
      def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
      
      @scala.inline
      def setSrcData(value: Buffer): Self = StObject.set(x, "srcData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IConstPixelsItem extends StObject {
    
    var blue: Double = js.native
    
    var green: Double = js.native
    
    var opacity: Double = js.native
    
    var red: Double = js.native
  }
  object IConstPixelsItem {
    
    @scala.inline
    def apply(blue: Double, green: Double, opacity: Double, red: Double): IConstPixelsItem = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConstPixelsItem]
    }
    
    @scala.inline
    implicit class IConstPixelsItemMutableBuilder[Self <: IConstPixelsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IConstPixelsOptions extends StObject {
    
    var columns: Double = js.native
    
    var rows: Double = js.native
    
    var srcData: Buffer = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object IConstPixelsOptions {
    
    @scala.inline
    def apply(columns: Double, rows: Double, srcData: Buffer, x: Double, y: Double): IConstPixelsOptions = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], srcData = srcData.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConstPixelsOptions]
    }
    
    @scala.inline
    implicit class IConstPixelsOptionsMutableBuilder[Self <: IConstPixelsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcData(value: Buffer): Self = StObject.set(x, "srcData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IConvertOptions extends StObject {
    
    var blur: js.UndefOr[Double] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var density: js.UndefOr[Double] = js.native
    
    var filter: js.UndefOr[String] = js.native
    
    var flip: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var gravity: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var ignoreWarnings: js.UndefOr[Boolean] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var resizeStyle: js.UndefOr[String] = js.native
    
    var rotate: js.UndefOr[Double] = js.native
    
    var srcData: Buffer = js.native
    
    var srcFormat: js.UndefOr[String] = js.native
    
    var strip: js.UndefOr[Boolean] = js.native
    
    var trim: js.UndefOr[Boolean] = js.native
    
    var trimFuzz: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object IConvertOptions {
    
    @scala.inline
    def apply(srcData: Buffer): IConvertOptions = {
      val __obj = js.Dynamic.literal(srcData = srcData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConvertOptions]
    }
    
    @scala.inline
    implicit class IConvertOptionsMutableBuilder[Self <: IConvertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGravity(value: String): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setResizeStyle(value: String): Self = StObject.set(x, "resizeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeStyleUndefined: Self = StObject.set(x, "resizeStyle", js.undefined)
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setSrcData(value: Buffer): Self = StObject.set(x, "srcData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcFormat(value: String): Self = StObject.set(x, "srcFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcFormatUndefined: Self = StObject.set(x, "srcFormat", js.undefined)
      
      @scala.inline
      def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimFuzz(value: Double): Self = StObject.set(x, "trimFuzz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimFuzzUndefined: Self = StObject.set(x, "trimFuzz", js.undefined)
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IIdentifyOptions extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var ignoreWarnings: js.UndefOr[Boolean] = js.native
    
    var srcData: Buffer = js.native
  }
  object IIdentifyOptions {
    
    @scala.inline
    def apply(srcData: Buffer): IIdentifyOptions = {
      val __obj = js.Dynamic.literal(srcData = srcData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIdentifyOptions]
    }
    
    @scala.inline
    implicit class IIdentifyOptionsMutableBuilder[Self <: IIdentifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
      
      @scala.inline
      def setSrcData(value: Buffer): Self = StObject.set(x, "srcData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IIdentifyResult extends StObject {
    
    var density: Height = js.native
    
    var depth: Double = js.native
    
    var exif: Orientation = js.native
    
    var format: String = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object IIdentifyResult {
    
    @scala.inline
    def apply(density: Height, depth: Double, exif: Orientation, format: String, height: Double, width: Double): IIdentifyResult = {
      val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], exif = exif.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIdentifyResult]
    }
    
    @scala.inline
    implicit class IIdentifyResultMutableBuilder[Self <: IIdentifyResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDensity(value: Height): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExif(value: Orientation): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IQuantizeColorsItem extends StObject {
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var hex: String = js.native
    
    var r: Double = js.native
  }
  object IQuantizeColorsItem {
    
    @scala.inline
    def apply(b: Double, g: Double, hex: String, r: Double): IQuantizeColorsItem = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[IQuantizeColorsItem]
    }
    
    @scala.inline
    implicit class IQuantizeColorsItemMutableBuilder[Self <: IQuantizeColorsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IQuantizeColorsOptions extends StObject {
    
    var colors: Double = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var ignoreWarnings: js.UndefOr[Boolean] = js.native
    
    var srcData: Buffer = js.native
  }
  object IQuantizeColorsOptions {
    
    @scala.inline
    def apply(colors: Double, srcData: Buffer): IQuantizeColorsOptions = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], srcData = srcData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IQuantizeColorsOptions]
    }
    
    @scala.inline
    implicit class IQuantizeColorsOptionsMutableBuilder[Self <: IQuantizeColorsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: Double): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
      
      @scala.inline
      def setSrcData(value: Buffer): Self = StObject.set(x, "srcData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IStreamConvertOptions extends StObject {
    
    var blur: js.UndefOr[Double] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var density: js.UndefOr[Double] = js.native
    
    var filter: js.UndefOr[String] = js.native
    
    var flip: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var gravity: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var ignoreWarnings: js.UndefOr[Boolean] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var resizeStyle: js.UndefOr[String] = js.native
    
    var rotate: js.UndefOr[Double] = js.native
    
    var srcFormat: js.UndefOr[String] = js.native
    
    var strip: js.UndefOr[Boolean] = js.native
    
    var trim: js.UndefOr[Boolean] = js.native
    
    var trimFuzz: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object IStreamConvertOptions {
    
    @scala.inline
    def apply(): IStreamConvertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStreamConvertOptions]
    }
    
    @scala.inline
    implicit class IStreamConvertOptionsMutableBuilder[Self <: IStreamConvertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGravity(value: String): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setResizeStyle(value: String): Self = StObject.set(x, "resizeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeStyleUndefined: Self = StObject.set(x, "resizeStyle", js.undefined)
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setSrcFormat(value: String): Self = StObject.set(x, "srcFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcFormatUndefined: Self = StObject.set(x, "srcFormat", js.undefined)
      
      @scala.inline
      def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimFuzz(value: Double): Self = StObject.set(x, "trimFuzz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimFuzzUndefined: Self = StObject.set(x, "trimFuzz", js.undefined)
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
