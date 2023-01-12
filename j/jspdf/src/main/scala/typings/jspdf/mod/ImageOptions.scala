package typings.jspdf.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageOptions extends StObject {
  
  var alias: js.UndefOr[String] = js.undefined
  
  var compression: js.UndefOr[ImageCompression] = js.undefined
  
  var format: js.UndefOr[ImageFormat] = js.undefined
  
  var height: Double
  
  var imageData: String | HTMLImageElement | HTMLCanvasElement | js.typedarray.Uint8Array | RGBAData
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object ImageOptions {
  
  inline def apply(
    height: Double,
    imageData: String | HTMLImageElement | HTMLCanvasElement | js.typedarray.Uint8Array | RGBAData,
    width: Double,
    x: Double,
    y: Double
  ): ImageOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], imageData = imageData.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageOptions] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setCompression(value: ImageCompression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setFormat(value: ImageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImageData(value: String | HTMLImageElement | HTMLCanvasElement | js.typedarray.Uint8Array | RGBAData): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
