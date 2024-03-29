package typings.libp2pInterfaces

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportErrorsMod {
  
  @JSImport("libp2p-interfaces/src/transport/errors", "AbortError")
  @js.native
  class AbortError ()
    extends StObject
       with Error {
    
    var code: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var `type`: String = js.native
  }
}
