package typings.ipfsCore.anon

import typings.multiaddr.mod.Multiaddr
import typings.multiaddr.mod.MultiaddrInput
import typings.multiaddr.mod.NodeAddress
import typings.multiaddr.mod.Protocols_
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromNodeAddress extends js.Object {
  
  def apply(): Multiaddr = js.native
  def apply(input: MultiaddrInput): Multiaddr = js.native
  
  /**
    * Creates a Multiaddr from a node-friendly address object
    */
  def fromNodeAddress(addr: NodeAddress, transport: String): Multiaddr = js.native
  
  /**
    * Returns if something is a Multiaddr
    */
  def isMultiaddr(addr: js.Any): /* is multiaddr.multiaddr.Multiaddr */ Boolean = js.native
  
  /**
    * Returns if something is a Multiaddr that is a name
    */
  def isName(addr: Multiaddr): Boolean = js.native
  
  /**
    * Object containing table, names and codes of all supported protocols.
    * To get the protocol values from a Multiaddr, you can use
    * [`.protos()`](#multiaddrprotos),
    * [`.protoCodes()`](#multiaddrprotocodes) or
    * [`.protoNames()`](#multiaddrprotonames)
    */
  val protocols: Protocols_ = js.native
  
  /**
    * Returns an array of multiaddrs, by resolving the multiaddr that is a name
    */
  def resolve(addr: Multiaddr): js.Promise[js.Array[Multiaddr]] = js.native
  
  val resolvers: Map[String, js.Function1[/* addr */ Multiaddr, js.Promise[js.Array[String]]]] = js.native
}
