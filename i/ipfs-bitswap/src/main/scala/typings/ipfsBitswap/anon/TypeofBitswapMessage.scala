package typings.ipfsBitswap.anon

import typings.ipfsBitswap.distSrcMessageMod.BitswapMessage
import typings.ipfsBitswap.distSrcTypesMod.MultihashHasherLoader
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBitswapMessage extends StObject {
  
  val BlockPresenceType: TypeofBlockPresenceType = js.native
  
  val WantType: TypeofWantType = js.native
  
  def blockPresenceSize(cid: CID[Any, Double, Double, Version]): Double = js.native
  
  def deserialize(raw: js.typedarray.Uint8Array): js.Promise[BitswapMessage] = js.native
  def deserialize(raw: js.typedarray.Uint8Array, hashLoader: MultihashHasherLoader): js.Promise[BitswapMessage] = js.native
}
