package typings.libp2pInterfaces

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-interfaces/src/transport/errors", JSImport.Namespace)
@js.native
object transportErrorsMod extends js.Object {
  
  @js.native
  class AbortError () extends Error {
    
    var code: String = js.native
    
    var `type`: String = js.native
  }
  /* static members */
  @js.native
  object AbortError extends js.Object {
    
    def code: String = js.native
    
    def `type`: String = js.native
  }
}
