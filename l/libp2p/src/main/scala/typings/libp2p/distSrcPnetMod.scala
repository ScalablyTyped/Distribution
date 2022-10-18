package typings.libp2p

import typings.libp2pInterfaceConnection.mod.ConnectionProtector
import typings.libp2pInterfaceConnection.mod.MultiaddrConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPnetMod {
  
  @JSImport("libp2p/dist/src/pnet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libp2p/dist/src/pnet", "PreSharedKeyConnectionProtector")
  @js.native
  open class PreSharedKeyConnectionProtector protected ()
    extends StObject
       with ConnectionProtector {
    /**
      * Takes a Private Shared Key (psk) and provides a `protect` method
      * for wrapping existing connections in a private encryption stream.
      */
    def this(init: ProtectorInit) = this()
    
    /* private */ val enabled: Any = js.native
    
    /**
      * Takes a given Connection and creates a private encryption stream
      * between its two peers from the PSK the Protector instance was
      * created with.
      */
    /* CompleteClass */
    override def protect(connection: MultiaddrConnection): js.Promise[MultiaddrConnection] = js.native
    
    /* private */ val psk: Any = js.native
    
    var tag: String = js.native
  }
  
  inline def generateKey(bytes: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(bytes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ProtectorInit extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var psk: js.typedarray.Uint8Array
  }
  object ProtectorInit {
    
    inline def apply(psk: js.typedarray.Uint8Array): ProtectorInit = {
      val __obj = js.Dynamic.literal(psk = psk.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtectorInit]
    }
    
    extension [Self <: ProtectorInit](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setPsk(value: js.typedarray.Uint8Array): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
    }
  }
}
