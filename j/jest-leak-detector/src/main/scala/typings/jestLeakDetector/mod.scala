package typings.jestLeakDetector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-leak-detector", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with LeakDetector {
    def this(value: Any) = this()
    
    /* private */ /* CompleteClass */
    override val _finalizationRegistry: Any = js.native
    
    /* private */ /* CompleteClass */
    var _isReferenceBeingHeld: Any = js.native
    
    /* private */ /* CompleteClass */
    var _runGarbageCollector: Any = js.native
    
    /* CompleteClass */
    override def isLeaking(): js.Promise[Boolean] = js.native
  }
  
  trait LeakDetector extends StObject {
    
    /* private */ val _finalizationRegistry: Any
    
    /* private */ var _isReferenceBeingHeld: Any
    
    /* private */ var _runGarbageCollector: Any
    
    def isLeaking(): js.Promise[Boolean]
  }
  object LeakDetector {
    
    inline def apply(
      _finalizationRegistry: Any,
      _isReferenceBeingHeld: Any,
      _runGarbageCollector: Any,
      isLeaking: () => js.Promise[Boolean]
    ): LeakDetector = {
      val __obj = js.Dynamic.literal(_finalizationRegistry = _finalizationRegistry.asInstanceOf[js.Any], _isReferenceBeingHeld = _isReferenceBeingHeld.asInstanceOf[js.Any], _runGarbageCollector = _runGarbageCollector.asInstanceOf[js.Any], isLeaking = js.Any.fromFunction0(isLeaking))
      __obj.asInstanceOf[LeakDetector]
    }
    
    extension [Self <: LeakDetector](x: Self) {
      
      inline def setIsLeaking(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLeaking", js.Any.fromFunction0(value))
      
      inline def set_finalizationRegistry(value: Any): Self = StObject.set(x, "_finalizationRegistry", value.asInstanceOf[js.Any])
      
      inline def set_isReferenceBeingHeld(value: Any): Self = StObject.set(x, "_isReferenceBeingHeld", value.asInstanceOf[js.Any])
      
      inline def set_runGarbageCollector(value: Any): Self = StObject.set(x, "_runGarbageCollector", value.asInstanceOf[js.Any])
    }
  }
}
