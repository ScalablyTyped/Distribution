package typings.looksSame

import typings.looksSame.anon.AntialiasingTolerance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("looks-same/build/src/lib/antialiasing-comparator", JSImport.Namespace)
@js.native
object antialiasingComparatorMod extends js.Object {
  @js.native
  trait AntialiasingComparator extends js.Object {
    var _baseComparator: js.Any = js.native
    var _brightnessTolerance: js.Any = js.native
    var _img1: js.Any = js.native
    var _img2: js.Any = js.native
    def _brightnessDelta(color1: js.Any, color2: js.Any): Double = js.native
    def _checkIsAntialiased(data: js.Any): js.Any = js.native
    def _isAntialiased(img1: js.Any, x1: js.Any, y1: js.Any, data: js.Any): js.Any = js.native
    def _isAntialiased(img1: js.Any, x1: js.Any, y1: js.Any, data: js.Any, img2: js.Any): js.Any = js.native
    def compare(data: js.Any): js.Any = js.native
  }
  
  @js.native
  class default protected () extends AntialiasingComparator {
    def this(
      baseComparator: js.Any,
      png1: js.Any,
      png2: js.Any,
      hasAntialiasingTolerance: AntialiasingTolerance
    ) = this()
  }
  
}

