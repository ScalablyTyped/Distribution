package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends StObject {
  
  def add(addr: Multiaddr_): js.Promise[Peers] = js.native
  def add(addr: Multiaddr_, options: AbortOptions & HTTPClientExtraOptions): js.Promise[Peers] = js.native
  
  def clear(): js.Promise[Peers] = js.native
  def clear(options: AbortOptions & HTTPClientExtraOptions): js.Promise[Peers] = js.native
  
  def list(): js.Promise[Peers] = js.native
  def list(options: AbortOptions & HTTPClientExtraOptions): js.Promise[Peers] = js.native
  
  def reset(): js.Promise[Peers] = js.native
  def reset(options: AbortOptions & HTTPClientExtraOptions): js.Promise[Peers] = js.native
  
  def rm(addr: Multiaddr_): js.Promise[Peers] = js.native
  def rm(addr: Multiaddr_, options: AbortOptions & HTTPClientExtraOptions): js.Promise[Peers] = js.native
}
