package typings.imageQ

import typings.imageQ.pointContainerMod.PointContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorHistogramMod {
  
  @JSImport("image-q/dist/palette/rgbquant/colorHistogram", "ColorHistogram")
  @js.native
  class ColorHistogram protected () extends StObject {
    def this(method: Double, colors: Double) = this()
    
    /* private */ def _colorStats1D(pointBuffer: js.Any): js.Any = js.native
    
    /* private */ def _colorStats2D(pointBuffer: js.Any): js.Any = js.native
    
    /* private */ var _histogram: js.Any = js.native
    
    /* private */ var _hueStats: js.Any = js.native
    
    /* private */ var _initColors: js.Any = js.native
    
    /* private */ def _iterateBox(bbox: js.Any, wid: js.Any, fn: js.Any): js.Any = js.native
    
    /**
      *    partitions a rectangle of width x height into
      *    array of boxes stepX x stepY (or less)
      */
    /* private */ def _makeBoxes(width: js.Any, height: js.Any, stepX: js.Any, stepY: js.Any): js.Any = js.native
    
    /* private */ var _method: js.Any = js.native
    
    /* private */ var _minHueCols: js.Any = js.native
    
    def getImportanceSortedColorsIDXI32(): js.Array[Double] = js.native
    
    def sample(pointBuffer: PointContainer): Unit = js.native
  }
  /* static members */
  object ColorHistogram {
    
    @JSImport("image-q/dist/palette/rgbquant/colorHistogram", "ColorHistogram")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("image-q/dist/palette/rgbquant/colorHistogram", "ColorHistogram._boxPixels")
    @js.native
    def _boxPixels: js.Any = js.native
    inline def _boxPixels_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_boxPixels")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q/dist/palette/rgbquant/colorHistogram", "ColorHistogram._boxSize")
    @js.native
    def _boxSize: js.Any = js.native
    inline def _boxSize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_boxSize")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q/dist/palette/rgbquant/colorHistogram", "ColorHistogram._hueGroups")
    @js.native
    def _hueGroups: js.Any = js.native
    inline def _hueGroups_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_hueGroups")(x.asInstanceOf[js.Any])
  }
}
