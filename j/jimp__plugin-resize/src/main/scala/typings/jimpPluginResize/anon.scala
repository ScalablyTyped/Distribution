package typings.jimpPluginResize

import typings.jimpPluginResize.jimpPluginResizeStrings.bezierInterpolation
import typings.jimpPluginResize.jimpPluginResizeStrings.bicubicInterpolation
import typings.jimpPluginResize.jimpPluginResizeStrings.bilinearInterpolation
import typings.jimpPluginResize.jimpPluginResizeStrings.hermiteInterpolation
import typings.jimpPluginResize.jimpPluginResizeStrings.nearestNeighbor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait RESIZEBEZIER extends StObject {
    
    var RESIZE_BEZIER: bezierInterpolation = js.native
    
    var RESIZE_BICUBIC: bicubicInterpolation = js.native
    
    var RESIZE_BILINEAR: bilinearInterpolation = js.native
    
    var RESIZE_HERMITE: hermiteInterpolation = js.native
    
    // resize methods
    var RESIZE_NEAREST_NEIGHBOR: nearestNeighbor = js.native
  }
  object RESIZEBEZIER {
    
    @scala.inline
    def apply(
      RESIZE_BEZIER: bezierInterpolation,
      RESIZE_BICUBIC: bicubicInterpolation,
      RESIZE_BILINEAR: bilinearInterpolation,
      RESIZE_HERMITE: hermiteInterpolation,
      RESIZE_NEAREST_NEIGHBOR: nearestNeighbor
    ): RESIZEBEZIER = {
      val __obj = js.Dynamic.literal(RESIZE_BEZIER = RESIZE_BEZIER.asInstanceOf[js.Any], RESIZE_BICUBIC = RESIZE_BICUBIC.asInstanceOf[js.Any], RESIZE_BILINEAR = RESIZE_BILINEAR.asInstanceOf[js.Any], RESIZE_HERMITE = RESIZE_HERMITE.asInstanceOf[js.Any], RESIZE_NEAREST_NEIGHBOR = RESIZE_NEAREST_NEIGHBOR.asInstanceOf[js.Any])
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
