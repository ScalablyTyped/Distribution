package typings.libp2p

import typings.libp2p.distSrcPnetMod.ProtectorInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object pnetMod {
  
  @JSImport("libp2p/pnet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libp2p/pnet", "PreSharedKeyConnectionProtector")
  @js.native
  open class PreSharedKeyConnectionProtector protected ()
    extends typings.libp2p.distSrcPnetMod.PreSharedKeyConnectionProtector {
    /**
      * Takes a Private Shared Key (psk) and provides a `protect` method
      * for wrapping existing connections in a private encryption stream.
      */
    def this(init: ProtectorInit) = this()
  }
  
  inline def generateKey(bytes: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(bytes.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
