package typings.inversify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlanningMetadataMod {
  
  @JSImport("inversify/lib/planning/metadata", "Metadata")
  @js.native
  open class Metadata protected ()
    extends StObject
       with typings.inversify.libInterfacesInterfacesMod.interfaces.Metadata[Any] {
    def this(key: String, value: Any) = this()
    def this(key: js.Symbol, value: Any) = this()
    def this(key: Double, value: Any) = this()
    
    /* CompleteClass */
    var key: String | Double | js.Symbol = js.native
    
    /* CompleteClass */
    var value: Any = js.native
  }
}
