package typings.jestLeakDetector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-leak-detector", JSImport.Default)
  @js.native
  class default protected () extends StObject {
    def this(value: js.Any) = this()
    
    var _isReferenceBeingHeld: js.Any = js.native
    
    var _runGarbageCollector: js.Any = js.native
    
    def isLeaking(): js.Promise[Boolean] = js.native
  }
}
