package typings.imagemagickNative

import typings.imagemagickNative.anon.Height
import typings.imagemagickNative.anon.Orientation
import typings.node.Buffer
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object streams {
    
    @JSImport("imagemagick-native", "streams")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convert(options: IStreamConvertOptions): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
  }
  
  trait ICompositeOptions extends StObject {
    
    var compositeData: Buffer
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var gravity: js.UndefOr[String] = js.undefined
    
    var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
    
    var srcData: Buffer
  }
  object ICompositeOptions {
    
    inline def apply(compositeData: Buffer, srcData: Buffer): ICompositeOptions = {
      val __obj = js.Dynamic.literal(compositeData = compositeData.asInstanceOf[js.Any], srcData = srcData.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICompositeOptions]
    }
    
    extension [Self <: ICompositeOptions](x: Self) {
      
      inline def setCompositeData(value: Buffer): Self = StObject.set(x, "compositeData", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setGravity(value: String): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
      
      inline def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
      
      inline def setSrcData(value: Buffer): Self = StObject.set(x, "srcData", value.asInstanceOf[js.Any])
    }
  }
  
  trait IConstPixelsItem extends StObject {
    
    var blue: Double
    
    var green: Double
    
    var opacity: Double
    
    var red: Double
  }
  object IConstPixelsItem {
    
    inline def apply(blue: Double, green: Double, opacity: Double, red: Double): IConstPixelsItem = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConstPixelsItem]
    }
    
    extension [Self <: IConstPixelsItem](x: Self) {
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  trait IConstPixelsOptions extends StObject {
    
    var columns: Double
    
    var rows: Double
    
    var srcData: Buffer
    
    var x: Double
    
    var y: Double
  }
  object IConstPixelsOptions {
    
    inline def apply(columns: Double, rows: Double, srcData: Buffer, x: Double, y: Double): IConstPixelsOptions = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], srcData = srcData.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConstPixelsOptions]
    }
    
    extension [Self <: IConstPixelsOptions](x: Self) {
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setSrcData(value: Buffer): Self = StObject.set(x, "srcData", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait IConvertOptions extends StObject {
    
    var blur: js.UndefOr[Double] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var density: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var gravity: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var resizeStyle: js.UndefOr[String] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    var srcData: Buffer
    
    var srcFormat: js.UndefOr[String] = js.undefined
    
    var strip: js.UndefOr[Boolean] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
    
    var trimFuzz: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object IConvertOptions {
    
    inline def apply(srcData: Buffer): IConvertOptions = {
      val __obj = js.Dynamic.literal(srcData = srcData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConvertOptions]
    }
    
    extension [Self <: IConvertOptions](x: Self) {
      
      inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGravity(value: String): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
      
      inline def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setResizeStyle(value: String): Self = StObject.set(x, "resizeStyle", value.asInstanceOf[js.Any])
      
      inline def setResizeStyleUndefined: Self = StObject.set(x, "resizeStyle", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setSrcData(value: Buffer): Self = StObject.set(x, "srcData", value.asInstanceOf[js.Any])
      
      inline def setSrcFormat(value: String): Self = StObject.set(x, "srcFormat", value.asInstanceOf[js.Any])
      
      inline def setSrcFormatUndefined: Self = StObject.set(x, "srcFormat", js.undefined)
      
      inline def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      inline def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimFuzz(value: Double): Self = StObject.set(x, "trimFuzz", value.asInstanceOf[js.Any])
      
      inline def setTrimFuzzUndefined: Self = StObject.set(x, "trimFuzz", js.undefined)
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IIdentifyOptions extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
    
    var srcData: Buffer
  }
  object IIdentifyOptions {
    
    inline def apply(srcData: Buffer): IIdentifyOptions = {
      val __obj = js.Dynamic.literal(srcData = srcData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIdentifyOptions]
    }
    
    extension [Self <: IIdentifyOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
      
      inline def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
      
      inline def setSrcData(value: Buffer): Self = StObject.set(x, "srcData", value.asInstanceOf[js.Any])
    }
  }
  
  trait IIdentifyResult extends StObject {
    
    var density: Height
    
    var depth: Double
    
    var exif: Orientation
    
    var format: String
    
    var height: Double
    
    var width: Double
  }
  object IIdentifyResult {
    
    inline def apply(density: Height, depth: Double, exif: Orientation, format: String, height: Double, width: Double): IIdentifyResult = {
      val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], exif = exif.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIdentifyResult]
    }
    
    extension [Self <: IIdentifyResult](x: Self) {
      
      inline def setDensity(value: Height): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setExif(value: Orientation): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait IQuantizeColorsItem extends StObject {
    
    var b: Double
    
    var g: Double
    
    var hex: String
    
    var r: Double
  }
  object IQuantizeColorsItem {
    
    inline def apply(b: Double, g: Double, hex: String, r: Double): IQuantizeColorsItem = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[IQuantizeColorsItem]
    }
    
    extension [Self <: IQuantizeColorsItem](x: Self) {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait IQuantizeColorsOptions extends StObject {
    
    var colors: Double
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
    
    var srcData: Buffer
  }
  object IQuantizeColorsOptions {
    
    inline def apply(colors: Double, srcData: Buffer): IQuantizeColorsOptions = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], srcData = srcData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IQuantizeColorsOptions]
    }
    
    extension [Self <: IQuantizeColorsOptions](x: Self) {
      
      inline def setColors(value: Double): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
      
      inline def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
      
      inline def setSrcData(value: Buffer): Self = StObject.set(x, "srcData", value.asInstanceOf[js.Any])
    }
  }
  
  trait IStreamConvertOptions extends StObject {
    
    var blur: js.UndefOr[Double] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var density: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var gravity: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var resizeStyle: js.UndefOr[String] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    var srcFormat: js.UndefOr[String] = js.undefined
    
    var strip: js.UndefOr[Boolean] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
    
    var trimFuzz: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object IStreamConvertOptions {
    
    inline def apply(): IStreamConvertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStreamConvertOptions]
    }
    
    extension [Self <: IStreamConvertOptions](x: Self) {
      
      inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGravity(value: String): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
      
      inline def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setResizeStyle(value: String): Self = StObject.set(x, "resizeStyle", value.asInstanceOf[js.Any])
      
      inline def setResizeStyleUndefined: Self = StObject.set(x, "resizeStyle", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setSrcFormat(value: String): Self = StObject.set(x, "srcFormat", value.asInstanceOf[js.Any])
      
      inline def setSrcFormatUndefined: Self = StObject.set(x, "srcFormat", js.undefined)
      
      inline def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      inline def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimFuzz(value: Double): Self = StObject.set(x, "trimFuzz", value.asInstanceOf[js.Any])
      
      inline def setTrimFuzzUndefined: Self = StObject.set(x, "trimFuzz", js.undefined)
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
