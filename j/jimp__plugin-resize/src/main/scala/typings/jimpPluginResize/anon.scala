package typings.jimpPluginResize

import typings.jimpPluginResize.jimpPluginResizeStrings.bezierInterpolation
import typings.jimpPluginResize.jimpPluginResizeStrings.bicubicInterpolation
import typings.jimpPluginResize.jimpPluginResizeStrings.bilinearInterpolation
import typings.jimpPluginResize.jimpPluginResizeStrings.hermiteInterpolation
import typings.jimpPluginResize.jimpPluginResizeStrings.nearestNeighbor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RESIZEBEZIER extends StObject {
    
    var RESIZE_BEZIER: bezierInterpolation
    
    var RESIZE_BICUBIC: bicubicInterpolation
    
    var RESIZE_BILINEAR: bilinearInterpolation
    
    var RESIZE_HERMITE: hermiteInterpolation
    
    // resize methods
    var RESIZE_NEAREST_NEIGHBOR: nearestNeighbor
  }
  object RESIZEBEZIER {
    
    @scala.inline
    def apply(): RESIZEBEZIER = {
      val __obj = js.Dynamic.literal(RESIZE_BEZIER = "bezierInterpolation", RESIZE_BICUBIC = "bicubicInterpolation", RESIZE_BILINEAR = "bilinearInterpolation", RESIZE_HERMITE = "hermiteInterpolation", RESIZE_NEAREST_NEIGHBOR = "nearestNeighbor")
      __obj.asInstanceOf[RESIZEBEZIER]
    }
    
    @scala.inline
    implicit class RESIZEBEZIERMutableBuilder[Self <: RESIZEBEZIER] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRESIZE_BEZIER(value: bezierInterpolation): Self = StObject.set(x, "RESIZE_BEZIER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESIZE_BICUBIC(value: bicubicInterpolation): Self = StObject.set(x, "RESIZE_BICUBIC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESIZE_BILINEAR(value: bilinearInterpolation): Self = StObject.set(x, "RESIZE_BILINEAR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESIZE_HERMITE(value: hermiteInterpolation): Self = StObject.set(x, "RESIZE_HERMITE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESIZE_NEAREST_NEIGHBOR(value: nearestNeighbor): Self = StObject.set(x, "RESIZE_NEAREST_NEIGHBOR", value.asInstanceOf[js.Any])
    }
  }
}
