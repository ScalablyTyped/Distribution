package typings.imageQ

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcUtilsProgressTrackerMod {
  
  @JSImport("image-q/dist/types/src/utils/progressTracker", "ProgressTracker")
  @js.native
  open class ProgressTracker protected () extends StObject {
    def this(valueRange: Double, progressRange: Double) = this()
    
    /* private */ var _last: Any = js.native
    
    /* private */ var _progressRange: Any = js.native
    
    /* private */ var _range: Any = js.native
    
    /* private */ var _step: Any = js.native
    
    var progress: Double = js.native
    
    def shouldNotify(current: Double): Boolean = js.native
  }
  /* static members */
  object ProgressTracker {
    
    @JSImport("image-q/dist/types/src/utils/progressTracker", "ProgressTracker.steps")
    @js.native
    val steps: /* 100 */ Double = js.native
  }
}
