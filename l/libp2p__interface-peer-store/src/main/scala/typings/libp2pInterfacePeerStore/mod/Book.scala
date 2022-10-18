package typings.libp2pInterfacePeerStore.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Book[Type] extends StObject {
  
  /**
    * Remove the known data of a peer
    */
  def delete(peerId: PeerId): js.Promise[Unit]
  
  /**
    * Get the known data of a peer
    */
  def get(peerId: PeerId): js.Promise[Type]
  
  /**
    * Set the known data of a peer
    */
  def set(peerId: PeerId, data: Type): js.Promise[Unit]
}
object Book {
  
  inline def apply[Type](
    delete: PeerId => js.Promise[Unit],
    get: PeerId => js.Promise[Type],
    set: (PeerId, Type) => js.Promise[Unit]
  ): Book[Type] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Book[Type]]
  }
  
  extension [Self <: Book[?], Type](x: Self & Book[Type]) {
    
    inline def setDelete(value: PeerId => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGet(value: PeerId => js.Promise[Type]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (PeerId, Type) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
