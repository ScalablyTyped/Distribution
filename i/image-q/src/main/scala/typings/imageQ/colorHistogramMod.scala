package typings.imageQ

import typings.imageQ.pointContainerMod.PointContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q/dist/palette/rgbquant/colorHistogram", JSImport.Namespace)
@js.native
object colorHistogramMod extends js.Object {
  @js.native
  class ColorHistogram protected () extends js.Object {
    def this(method: Double, colors: Double) = this()
    var _histogram: js.Any = js.native
    var _hueStats: js.Any = js.native
    var _initColors: js.Any = js.native
    var _method: js.Any = js.native
    var _minHueCols: js.Any = js.native
    /* private */ def _colorStats1D(pointBuffer: js.Any): js.Any = js.native
    /* private */ def _colorStats2D(pointBuffer: js.Any): js.Any = js.native
    /* private */ def _iterateBox(bbox: js.Any, wid: js.Any, fn: js.Any): js.Any = js.native
    /**
      *    partitions a rectangle of width x height into
      *    array of boxes stepX x stepY (or less)
      */
    /* private */ def _makeBoxes(width: js.Any, height: js.Any, stepX: js.Any, stepY: js.Any): js.Any = js.native
    def getImportanceSortedColorsIDXI32(): js.Array[Double] = js.native
    def sample(pointBuffer: PointContainer): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ColorHistogram extends js.Object {
    var _boxPixels: js.Any = js.native
    var _boxSize: js.Any = js.native
    var _hueGroups: js.Any = js.native
  }
  
}

