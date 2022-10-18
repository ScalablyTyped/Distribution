package typings.isIpfs

import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-ipfs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def base32cid(cid: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("base32cid")(cid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def base32cid(cid: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("base32cid")(cid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def base32cid(cid: CID[Any, Double, Double, Version]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("base32cid")(cid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def cid(hash: String): /* is multiformats.multiformats/cid.CID<unknown, number, number, multiformats.multiformats/dist/types/src/link/interface.Version> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cid")(hash.asInstanceOf[js.Any]).asInstanceOf[/* is multiformats.multiformats/cid.CID<unknown, number, number, multiformats.multiformats/dist/types/src/link/interface.Version> */ Boolean]
  inline def cid(hash: js.typedarray.Uint8Array): /* is multiformats.multiformats/cid.CID<unknown, number, number, multiformats.multiformats/dist/types/src/link/interface.Version> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cid")(hash.asInstanceOf[js.Any]).asInstanceOf[/* is multiformats.multiformats/cid.CID<unknown, number, number, multiformats.multiformats/dist/types/src/link/interface.Version> */ Boolean]
  inline def cid(hash: CID[Any, Double, Double, Version]): /* is multiformats.multiformats/cid.CID<unknown, number, number, multiformats.multiformats/dist/types/src/link/interface.Version> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cid")(hash.asInstanceOf[js.Any]).asInstanceOf[/* is multiformats.multiformats/cid.CID<unknown, number, number, multiformats.multiformats/dist/types/src/link/interface.Version> */ Boolean]
  
  inline def cidPath(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cidPath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def cidPath(path: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cidPath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def cidPath(path: CID[Any, Double, Double, Version]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cidPath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def ipfsPath(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ipfsPath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def ipfsPath(path: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ipfsPath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def ipfsSubdomain(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ipfsSubdomain")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def ipfsSubdomain(url: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ipfsSubdomain")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def ipfsUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ipfsUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def ipfsUrl(url: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ipfsUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def ipnsPath(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ipnsPath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def ipnsPath(path: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ipnsPath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def ipnsSubdomain(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ipnsSubdomain")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def ipnsSubdomain(url: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ipnsSubdomain")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def ipnsUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ipnsUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def ipnsUrl(url: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ipnsUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def multiaddr(input: String): /* is @multiformats/multiaddr.@multiformats/multiaddr.Multiaddr */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("multiaddr")(input.asInstanceOf[js.Any]).asInstanceOf[/* is @multiformats/multiaddr.@multiformats/multiaddr.Multiaddr */ Boolean]
  inline def multiaddr(input: js.typedarray.Uint8Array): /* is @multiformats/multiaddr.@multiformats/multiaddr.Multiaddr */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("multiaddr")(input.asInstanceOf[js.Any]).asInstanceOf[/* is @multiformats/multiaddr.@multiformats/multiaddr.Multiaddr */ Boolean]
  inline def multiaddr(input: Multiaddr_): /* is @multiformats/multiaddr.@multiformats/multiaddr.Multiaddr */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("multiaddr")(input.asInstanceOf[js.Any]).asInstanceOf[/* is @multiformats/multiaddr.@multiformats/multiaddr.Multiaddr */ Boolean]
  
  inline def multihash(hash: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("multihash")(hash.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def multihash(hash: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("multihash")(hash.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def path(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def path(path: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("is-ipfs", "pathGatewayPattern")
  @js.native
  val pathGatewayPattern: js.RegExp = js.native
  
  @JSImport("is-ipfs", "pathPattern")
  @js.native
  val pathPattern: js.RegExp = js.native
  
  /**
    * @param {string | Uint8Array | Multiaddr} input
    */
  inline def peerMultiaddr(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("peerMultiaddr")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def peerMultiaddr(input: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("peerMultiaddr")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def peerMultiaddr(input: Multiaddr_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("peerMultiaddr")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def subdomain(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("subdomain")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def subdomain(url: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("subdomain")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("is-ipfs", "subdomainGatewayPattern")
  @js.native
  val subdomainGatewayPattern: js.RegExp = js.native
  
  inline def url(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def url(url: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def urlOrPath(x: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("urlOrPath")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def urlOrPath(x: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("urlOrPath")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
