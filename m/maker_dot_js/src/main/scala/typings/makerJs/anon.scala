package typings.makerJs

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPath
import typings.makerJs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Offset extends StObject {
    
    var offset: IPoint
    
    var path: IPath | IModel
  }
  object Offset {
    
    inline def apply(offset: IPoint, path: IPath | IModel): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setOffset(value: IPoint): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPath(value: IPath | IModel): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScaleConversion extends StObject {
    
    var scaleConversion: Double
    
    var svgUnitType: String
  }
  object ScaleConversion {
    
    inline def apply(scaleConversion: Double, svgUnitType: String): ScaleConversion = {
      val __obj = js.Dynamic.literal(scaleConversion = scaleConversion.asInstanceOf[js.Any], svgUnitType = svgUnitType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleConversion]
    }
    
    extension [Self <: ScaleConversion](x: Self) {
      
      inline def setScaleConversion(value: Double): Self = StObject.set(x, "scaleConversion", value.asInstanceOf[js.Any])
      
      inline def setSvgUnitType(value: String): Self = StObject.set(x, "svgUnitType", value.asInstanceOf[js.Any])
    }
  }
}
