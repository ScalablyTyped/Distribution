package typings.imageQ

import typings.imageQ.distTypesSrcUtilsPointContainerMod.PointContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcPaletteRgbquantColorHistogramMod {
  
  @JSImport("image-q/dist/types/src/palette/rgbquant/colorHistogram", "ColorHistogram")
  @js.native
  open class ColorHistogram protected () extends StObject {
    def this(method: Double, colors: Double) = this()
    
    /* private */ var _colorStats1D: Any = js.native
    
    /* private */ var _colorStats2D: Any = js.native
    
    /* private */ var _histogram: Any = js.native
    
    /* private */ var _hueStats: Any = js.native
    
    /* private */ var _initColors: Any = js.native
    
    /* private */ var _iterateBox: Any = js.native
    
    /**
      *    partitions a rectangle of width x height into
      *    array of boxes stepX x stepY (or less)
      */
    /* private */ var _makeBoxes: Any = js.native
    
    /* private */ var _method: Any = js.native
    
    /* private */ var _minHueCols: Any = js.native
    
    def getImportanceSortedColorsIDXI32(): js.Array[Double] = js.native
    
    def sample(pointContainer: PointContainer): Unit = js.native
  }
  /* static members */
  object ColorHistogram {
    
    @JSImport("image-q/dist/types/src/palette/rgbquant/colorHistogram", "ColorHistogram")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/rgbquant/colorHistogram", "ColorHistogram._boxPixels")
    @js.native
    def _boxPixels: Any = js.native
    inline def _boxPixels_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_boxPixels")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q/dist/types/src/palette/rgbquant/colorHistogram", "ColorHistogram._boxSize")
    @js.native
    def _boxSize: Any = js.native
    inline def _boxSize_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_boxSize")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q/dist/types/src/palette/rgbquant/colorHistogram", "ColorHistogram._hueGroups")
    @js.native
    def _hueGroups: Any = js.native
    inline def _hueGroups_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_hueGroups")(x.asInstanceOf[js.Any])
  }
}
