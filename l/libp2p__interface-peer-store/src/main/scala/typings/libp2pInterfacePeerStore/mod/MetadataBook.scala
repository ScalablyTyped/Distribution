package typings.libp2pInterfacePeerStore.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataBook
  extends StObject
     with Book[Map[String, js.typedarray.Uint8Array]] {
  
  /**
    * Deletes the provided peer metadata key from the book
    */
  def deleteValue(peerId: PeerId, key: String): js.Promise[Unit]
  
  /**
    * Get specific metadata value, if it exists
    */
  def getValue(peerId: PeerId, key: String): js.Promise[js.UndefOr[js.typedarray.Uint8Array]]
  
  /**
    * Set a specific metadata value
    */
  def setValue(peerId: PeerId, key: String, value: js.typedarray.Uint8Array): js.Promise[Unit]
}
object MetadataBook {
  
  inline def apply(
    delete: PeerId => js.Promise[Unit],
    deleteValue: (PeerId, String) => js.Promise[Unit],
    get: PeerId => js.Promise[Map[String, js.typedarray.Uint8Array]],
    getValue: (PeerId, String) => js.Promise[js.UndefOr[js.typedarray.Uint8Array]],
    set: (PeerId, Map[String, js.typedarray.Uint8Array]) => js.Promise[Unit],
    setValue: (PeerId, String, js.typedarray.Uint8Array) => js.Promise[Unit]
  ): MetadataBook = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteValue = js.Any.fromFunction2(deleteValue), get = js.Any.fromFunction1(get), getValue = js.Any.fromFunction2(getValue), set = js.Any.fromFunction2(set), setValue = js.Any.fromFunction3(setValue))
    __obj.asInstanceOf[MetadataBook]
  }
  
  extension [Self <: MetadataBook](x: Self) {
    
    inline def setDeleteValue(value: (PeerId, String) => js.Promise[Unit]): Self = StObject.set(x, "deleteValue", js.Any.fromFunction2(value))
    
    inline def setGetValue(value: (PeerId, String) => js.Promise[js.UndefOr[js.typedarray.Uint8Array]]): Self = StObject.set(x, "getValue", js.Any.fromFunction2(value))
    
    inline def setSetValue(value: (PeerId, String, js.typedarray.Uint8Array) => js.Promise[Unit]): Self = StObject.set(x, "setValue", js.Any.fromFunction3(value))
  }
}
