package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connect extends StObject {
  
  def addrs(): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.AddrsResult */ Any
    ]
  ] = js.native
  def addrs(options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.AddrsResult */ Any
    ]
  ] = js.native
  
  def connect(multiaddrOrPeerId: PeerId): js.Promise[Unit] = js.native
  def connect(multiaddrOrPeerId: PeerId, options: AbortOptions & HTTPClientExtraOptions): js.Promise[Unit] = js.native
  def connect(multiaddrOrPeerId: Multiaddr_): js.Promise[Unit] = js.native
  def connect(multiaddrOrPeerId: Multiaddr_, options: AbortOptions & HTTPClientExtraOptions): js.Promise[Unit] = js.native
  
  def disconnect(multiaddrOrPeerId: PeerId): js.Promise[Unit] = js.native
  def disconnect(multiaddrOrPeerId: PeerId, options: AbortOptions & HTTPClientExtraOptions): js.Promise[Unit] = js.native
  def disconnect(multiaddrOrPeerId: Multiaddr_): js.Promise[Unit] = js.native
  def disconnect(multiaddrOrPeerId: Multiaddr_, options: AbortOptions & HTTPClientExtraOptions): js.Promise[Unit] = js.native
  
  def localAddrs(): js.Promise[js.Array[Multiaddr_]] = js.native
  def localAddrs(options: AbortOptions & HTTPClientExtraOptions): js.Promise[js.Array[Multiaddr_]] = js.native
  
  def peers(): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PeersResult */ Any
    ]
  ] = js.native
  def peers(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PeersOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PeersResult */ Any
    ]
  ] = js.native
}
