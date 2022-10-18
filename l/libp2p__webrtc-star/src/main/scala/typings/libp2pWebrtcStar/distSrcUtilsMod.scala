package typings.libp2pWebrtcStar

import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("@libp2p/webrtc-star/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanMultiaddr(maStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanMultiaddr")(maStr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cleanUrlSIO(ma: Multiaddr_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanUrlSIO")(ma.asInstanceOf[js.Any]).asInstanceOf[String]
}
