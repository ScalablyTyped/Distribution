package typings.lqipModern

import typings.lqipModern.mod.OutputFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DataURIBase64 extends StObject {
    
    var dataURIBase64: String
    
    var height: Double
    
    var originalHeight: Double
    
    var originalWidth: Double
    
    var `type`: OutputFormat
    
    var width: Double
  }
  object DataURIBase64 {
    
    inline def apply(
      dataURIBase64: String,
      height: Double,
      originalHeight: Double,
      originalWidth: Double,
      width: Double
    ): DataURIBase64 = {
      val __obj = js.Dynamic.literal(dataURIBase64 = dataURIBase64.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataURIBase64]
    }
    
    extension [Self <: DataURIBase64](x: Self) {
      
      inline def setDataURIBase64(value: String): Self = StObject.set(x, "dataURIBase64", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOriginalHeight(value: Double): Self = StObject.set(x, "originalHeight", value.asInstanceOf[js.Any])
      
      inline def setOriginalWidth(value: Double): Self = StObject.set(x, "originalWidth", value.asInstanceOf[js.Any])
      
      inline def setType(value: OutputFormat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
