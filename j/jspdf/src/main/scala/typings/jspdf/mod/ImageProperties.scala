package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageProperties extends StObject {
  
  var alias: Double
  
  var bitsPerComponent: Double
  
  var colorSpace: ColorSpace
  
  var data: String
  
  var decodeParameters: js.UndefOr[String] = js.undefined
  
  var fileType: ImageFormat
  
  var filter: String
  
  var height: Double
  
  var index: Double
  
  var palette: js.UndefOr[Any] = js.undefined
  
  var predictor: js.UndefOr[Double] = js.undefined
  
  var sMask: js.UndefOr[Any] = js.undefined
  
  var transparency: js.UndefOr[Any] = js.undefined
  
  var width: Double
}
object ImageProperties {
  
  inline def apply(
    alias: Double,
    bitsPerComponent: Double,
    colorSpace: ColorSpace,
    data: String,
    fileType: ImageFormat,
    filter: String,
    height: Double,
    index: Double,
    width: Double
  ): ImageProperties = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], bitsPerComponent = bitsPerComponent.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageProperties] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: Double): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setBitsPerComponent(value: Double): Self = StObject.set(x, "bitsPerComponent", value.asInstanceOf[js.Any])
    
    inline def setColorSpace(value: ColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDecodeParameters(value: String): Self = StObject.set(x, "decodeParameters", value.asInstanceOf[js.Any])
    
    inline def setDecodeParametersUndefined: Self = StObject.set(x, "decodeParameters", js.undefined)
    
    inline def setFileType(value: ImageFormat): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setPalette(value: Any): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPredictor(value: Double): Self = StObject.set(x, "predictor", value.asInstanceOf[js.Any])
    
    inline def setPredictorUndefined: Self = StObject.set(x, "predictor", js.undefined)
    
    inline def setSMask(value: Any): Self = StObject.set(x, "sMask", value.asInstanceOf[js.Any])
    
    inline def setSMaskUndefined: Self = StObject.set(x, "sMask", js.undefined)
    
    inline def setTransparency(value: Any): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    
    inline def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
