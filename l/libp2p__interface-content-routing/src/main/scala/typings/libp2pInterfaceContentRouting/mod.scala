package typings.libp2pInterfaceContentRouting

import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait ContentRouting extends StObject {
    
    def findProviders(cid: CID[Any, Double, Double, Version]): AsyncIterable[PeerInfo] = js.native
    def findProviders(cid: CID[Any, Double, Double, Version], options: AbortOptions): AsyncIterable[PeerInfo] = js.native
    
    def get(key: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    def get(key: js.typedarray.Uint8Array, options: AbortOptions): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def provide(cid: CID[Any, Double, Double, Version]): js.Promise[Unit] = js.native
    def provide(cid: CID[Any, Double, Double, Version], options: AbortOptions): js.Promise[Unit] = js.native
    
    def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array, options: AbortOptions): js.Promise[Unit] = js.native
  }
}
