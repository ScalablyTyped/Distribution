package typings.jestDashLeakDashDetector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-leak-detector", JSImport.Namespace)
@js.native
object jestDashLeakDashDetectorMod extends js.Object {
  @js.native
  class default protected () extends js.Object {
    def this(value: js.Any) = this()
    var _isReferenceBeingHeld: js.Any = js.native
    var _runGarbageCollector: js.Any = js.native
    def isLeaking(): Boolean = js.native
  }
  
}

