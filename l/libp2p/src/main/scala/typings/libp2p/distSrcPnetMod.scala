package typings.libp2p

import typings.libp2pInterfaceConnection.mod.ConnectionProtector
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPnetMod {
  
  @JSImport("libp2p/dist/src/pnet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateKey(bytes: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(bytes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def generateKey(bytes: WriteStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(bytes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def preSharedKey(init: ProtectorInit): js.Function0[ConnectionProtector] = ^.asInstanceOf[js.Dynamic].applyDynamic("preSharedKey")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function0[ConnectionProtector]]
  
  trait ProtectorInit extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var psk: js.typedarray.Uint8Array
  }
  object ProtectorInit {
    
    inline def apply(psk: js.typedarray.Uint8Array): ProtectorInit = {
      val __obj = js.Dynamic.literal(psk = psk.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtectorInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProtectorInit] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setPsk(value: js.typedarray.Uint8Array): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
    }
  }
}
