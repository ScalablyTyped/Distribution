package typings.lazyVal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lazy-val", "Lazy")
  @js.native
  open class Lazy[T] protected () extends StObject {
    def this(creator: js.Function0[js.Promise[T]]) = this()
    
    /* private */ var _value: Any = js.native
    
    /* private */ var creator: Any = js.native
    
    val hasValue: Boolean = js.native
    
    var value: js.Promise[T] = js.native
  }
}
