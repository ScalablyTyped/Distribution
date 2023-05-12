package typings.libp2p

import typings.libp2p.distSrcPnetMod.ProtectorInit
import typings.libp2pInterfaceConnection.mod.ConnectionProtector
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object pnetMod {
  
  @JSImport("libp2p/pnet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateKey(bytes: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(bytes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def generateKey(bytes: WriteStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(bytes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def preSharedKey(init: ProtectorInit): js.Function0[ConnectionProtector] = ^.asInstanceOf[js.Dynamic].applyDynamic("preSharedKey")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function0[ConnectionProtector]]
}
