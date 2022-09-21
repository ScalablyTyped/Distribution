package typings.materialBase

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/base/foundation", JSImport.Default)
  @js.native
  open class default[AdapterType /* <: js.Object */] () extends MDCFoundation[AdapterType] {
    def this(adapter: AdapterType) = this()
  }
  
  @JSImport("@material/base/foundation", "MDCFoundation")
  @js.native
  open class MDCFoundation[AdapterType /* <: js.Object */] () extends StObject {
    def this(adapter: AdapterType) = this()
    
    /* protected */ var adapter: AdapterType = js.native
    
    def destroy(): Unit = js.native
    
    def init(): Unit = js.native
  }
  
  type MDCFoundationAdapter[T] = Any
  
  @js.native
  trait MDCFoundationConstructor[AdapterType /* <: js.Object */]
    extends StObject
       with Instantiable1[/* adapter */ AdapterType, MDCFoundation[AdapterType]]
  
  @js.native
  trait MDCFoundationDeprecatedConstructor[AdapterType /* <: js.Object */]
    extends StObject
       with Instantiable0[MDCFoundation[AdapterType]]
       with Instantiable1[/* adapter */ Partial[AdapterType], MDCFoundation[AdapterType]] {
    
    val cssClasses: Record[String, String] = js.native
    
    val defaultAdapter: AdapterType = js.native
    
    val numbers: Record[String, Double] = js.native
    
    val strings: Record[String, String] = js.native
  }
}
