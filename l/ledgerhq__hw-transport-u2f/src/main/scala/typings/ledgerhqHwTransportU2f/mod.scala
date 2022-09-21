package typings.ledgerhqHwTransportU2f

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ledgerhq/hw-transport-u2f", JSImport.Default)
  @js.native
  open class default ()
    extends typings.ledgerhqHwTransport.mod.default[String]
  object default {
    
    @JSImport("@ledgerhq/hw-transport-u2f", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def open(_underscore: Any): js.Promise[TransportU2F] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(_underscore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransportU2F]]
    inline def open(_underscore: Any, _openTimeout: Double): js.Promise[TransportU2F] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(_underscore.asInstanceOf[js.Any], _openTimeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportU2F]]
  }
  
  type TransportU2F = typings.ledgerhqHwTransport.mod.default[String]
}
