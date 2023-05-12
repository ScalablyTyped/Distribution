package typings.libp2p

import typings.libp2p.distSrcUpnpNatMod.UPnPNATComponents
import typings.libp2p.distSrcUpnpNatMod.UPnPNATInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object upnpNatMod {
  
  @JSImport("libp2p/upnp-nat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uPnPNATService(): js.Function1[/* components */ UPnPNATComponents, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("uPnPNATService")().asInstanceOf[js.Function1[/* components */ UPnPNATComponents, js.Object]]
  inline def uPnPNATService(init: UPnPNATInit): js.Function1[/* components */ UPnPNATComponents, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("uPnPNATService")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ UPnPNATComponents, js.Object]]
}
