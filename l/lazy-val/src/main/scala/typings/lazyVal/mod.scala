package typings.lazyVal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lazy-val", "Lazy")
  @js.native
  class Lazy[T] protected () extends StObject {
    def this(creator: js.Function0[js.Promise[T]]) = this()
    
    var _value: js.Any = js.native
    
    var creator: js.Any = js.native
    
    val hasValue: Boolean = js.native
    
    var value: js.Promise[T] = js.native
  }
}
