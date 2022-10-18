package typings.libp2pInterfacePeerStore.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyBook extends StObject {
  
  /**
    * Remove the known data of a peer
    */
  def delete(peerId: PeerId): js.Promise[Unit]
  
  /**
    * Get the known data of a peer
    */
  def get(peerId: PeerId): js.Promise[js.UndefOr[js.typedarray.Uint8Array]]
  
  /**
    * Set the known data of a peer
    */
  def set(peerId: PeerId, data: js.typedarray.Uint8Array): js.Promise[Unit]
}
object KeyBook {
  
  inline def apply(
    delete: PeerId => js.Promise[Unit],
    get: PeerId => js.Promise[js.UndefOr[js.typedarray.Uint8Array]],
    set: (PeerId, js.typedarray.Uint8Array) => js.Promise[Unit]
  ): KeyBook = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[KeyBook]
  }
  
  extension [Self <: KeyBook](x: Self) {
    
    inline def setDelete(value: PeerId => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGet(value: PeerId => js.Promise[js.UndefOr[js.typedarray.Uint8Array]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (PeerId, js.typedarray.Uint8Array) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
