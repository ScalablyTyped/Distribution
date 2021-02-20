package typings.ledgerhqHwTransportU2f

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ledgerhq/hw-transport-u2f", JSImport.Default)
  @js.native
  class default ()
    extends typings.ledgerhqHwTransport.mod.default[String]
  object default {
    
    /* static member */
    @JSImport("@ledgerhq/hw-transport-u2f", "default.open")
    @js.native
    def open(_underscore: js.Any): js.Promise[TransportU2F] = js.native
    @JSImport("@ledgerhq/hw-transport-u2f", "default.open")
    @js.native
    def open(_underscore: js.Any, _openTimeout: Double): js.Promise[TransportU2F] = js.native
  }
  
  type TransportU2F = typings.ledgerhqHwTransport.mod.default[String]
}
