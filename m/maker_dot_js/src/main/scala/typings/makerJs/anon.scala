package typings.makerJs

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPath
import typings.makerJs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Offset extends StObject {
    
    var offset: IPoint = js.native
    
    var path: IPath | IModel = js.native
  }
  object Offset {
    
    @scala.inline
    def apply(offset: IPoint, path: IPath | IModel): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: IPoint): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: IPath | IModel): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScaleConversion extends StObject {
    
    var scaleConversion: Double = js.native
    
    var svgUnitType: String = js.native
  }
  object ScaleConversion {
    
    @scala.inline
    def apply(scaleConversion: Double, svgUnitType: String): ScaleConversion = {
      val __obj = js.Dynamic.literal(scaleConversion = scaleConversion.asInstanceOf[js.Any], svgUnitType = svgUnitType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleConversion]
    }
    
    @scala.inline
    implicit class ScaleConversionMutableBuilder[Self <: ScaleConversion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScaleConversion(value: Double): Self = StObject.set(x, "scaleConversion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgUnitType(value: String): Self = StObject.set(x, "svgUnitType", value.asInstanceOf[js.Any])
    }
  }
}
