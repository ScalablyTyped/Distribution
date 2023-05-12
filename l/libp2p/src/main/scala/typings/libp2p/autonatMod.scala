package typings.libp2p

import typings.libp2p.distSrcAutonatMod.AutoNATComponents
import typings.libp2p.distSrcAutonatMod.AutoNATServiceInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object autonatMod {
  
  @JSImport("libp2p/autonat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoNATService(): js.Function1[/* components */ AutoNATComponents, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("autoNATService")().asInstanceOf[js.Function1[/* components */ AutoNATComponents, js.Object]]
  inline def autoNATService(init: AutoNATServiceInit): js.Function1[/* components */ AutoNATComponents, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("autoNATService")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ AutoNATComponents, js.Object]]
}
