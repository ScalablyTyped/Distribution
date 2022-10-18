package typings.libp2pInterfacePeerStore.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtoBook
  extends StObject
     with Book[js.Array[String]] {
  
  /**
    * Adds known protocols of a provided peer.
    * If the peer was not known before, it will be added.
    */
  def add(peerId: PeerId, protocols: js.Array[String]): js.Promise[Unit]
  
  /**
    * Removes known protocols of a provided peer.
    * If the protocols did not exist before, nothing will be done.
    */
  def remove(peerId: PeerId, protocols: js.Array[String]): js.Promise[Unit]
}
object ProtoBook {
  
  inline def apply(
    add: (PeerId, js.Array[String]) => js.Promise[Unit],
    delete: PeerId => js.Promise[Unit],
    get: PeerId => js.Promise[js.Array[String]],
    remove: (PeerId, js.Array[String]) => js.Promise[Unit],
    set: (PeerId, js.Array[String]) => js.Promise[Unit]
  ): ProtoBook = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[ProtoBook]
  }
  
  extension [Self <: ProtoBook](x: Self) {
    
    inline def setAdd(value: (PeerId, js.Array[String]) => js.Promise[Unit]): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setRemove(value: (PeerId, js.Array[String]) => js.Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
  }
}
