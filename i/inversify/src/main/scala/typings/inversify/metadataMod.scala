package typings.inversify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  @JSImport("inversify/dts/planning/metadata", "Metadata")
  @js.native
  class Metadata protected ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.Metadata {
    def this(key: String, value: js.Any) = this()
    def this(key: js.Symbol, value: js.Any) = this()
    def this(key: Double, value: js.Any) = this()
    
    /* CompleteClass */
    var key: String | Double | js.Symbol = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
}
