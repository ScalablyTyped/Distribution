package typings.ipfsCoreUtils

import typings.ipfsCoreUtils.anon.Cid
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcToCidAndPathMod {
  
  @JSImport("ipfs-core-utils/dist/src/to-cid-and-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toCidAndPath(string: String): Cid = ^.asInstanceOf[js.Dynamic].applyDynamic("toCidAndPath")(string.asInstanceOf[js.Any]).asInstanceOf[Cid]
  inline def toCidAndPath(string: js.typedarray.Uint8Array): Cid = ^.asInstanceOf[js.Dynamic].applyDynamic("toCidAndPath")(string.asInstanceOf[js.Any]).asInstanceOf[Cid]
  inline def toCidAndPath(string: CID[Any, Double, Double, Version]): Cid = ^.asInstanceOf[js.Dynamic].applyDynamic("toCidAndPath")(string.asInstanceOf[js.Any]).asInstanceOf[Cid]
}
