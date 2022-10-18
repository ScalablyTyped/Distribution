package typings.libp2pPeerStore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorsMod {
  
  object codes {
    
    @JSImport("@libp2p/peer-store/dist/src/errors", "codes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@libp2p/peer-store/dist/src/errors", "codes.ERR_INVALID_PARAMETERS")
    @js.native
    def ERR_INVALID_PARAMETERS: String = js.native
    inline def ERR_INVALID_PARAMETERS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_INVALID_PARAMETERS")(x.asInstanceOf[js.Any])
    
    @JSImport("@libp2p/peer-store/dist/src/errors", "codes.ERR_NOT_FOUND")
    @js.native
    def ERR_NOT_FOUND: String = js.native
    inline def ERR_NOT_FOUND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_NOT_FOUND")(x.asInstanceOf[js.Any])
  }
}
