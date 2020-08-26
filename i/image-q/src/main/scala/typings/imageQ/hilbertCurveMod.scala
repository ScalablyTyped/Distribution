package typings.imageQ

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q/dist/image/spaceFillingCurves/hilbertCurve", JSImport.Namespace)
@js.native
object hilbertCurveMod extends js.Object {
  @js.native
  class HilbertCurveBase () extends js.Object {
    var _callback: js.Any = js.native
    var _d: js.Any = js.native
    var _height: js.Any = js.native
    var _level: js.Any = js.native
    var _width: js.Any = js.native
    var _x: js.Any = js.native
    var _y: js.Any = js.native
    /* private */ def _visit(direction: js.Any): js.Any = js.native
    /* private */ def _walkHilbert(direction: js.Any): js.Any = js.native
    def walk(
      width: Double,
      height: Double,
      visitorCallback: js.Function3[/* x */ Double, /* y */ Double, /* d */ Double, Unit]
    ): Unit = js.native
  }
  
}

