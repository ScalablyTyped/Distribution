package typings.materialBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/base/foundation", JSImport.Default)
  @js.native
  class default[AdapterType /* <: js.Object */] () extends MDCFoundation[AdapterType] {
    def this(adapter: AdapterType) = this()
  }
  
  @JSImport("@material/base/foundation", "MDCFoundation")
  @js.native
  class MDCFoundation[AdapterType /* <: js.Object */] () extends StObject {
    def this(adapter: AdapterType) = this()
    
    var adapter: AdapterType = js.native
    
    def destroy(): Unit = js.native
    
    def init(): Unit = js.native
  }
}
