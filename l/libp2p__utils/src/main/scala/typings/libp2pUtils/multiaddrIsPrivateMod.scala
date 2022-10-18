package typings.libp2pUtils

import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object multiaddrIsPrivateMod {
  
  @JSImport("@libp2p/utils/multiaddr/is-private", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPrivate(ma: Multiaddr_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrivate")(ma.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
