package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.roomBridgeStoreMod.RoomStoreEntryDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "RoomBridgeStoreEntry")
@js.native
class RoomBridgeStoreEntry ()
  extends typings.matrixAppserviceBridge.roomBridgeStoreMod.RoomBridgeStoreEntry {
  def this(doc: RoomStoreEntryDoc) = this()
}
/* static members */
object RoomBridgeStoreEntry {
  
  @JSImport("matrix-appservice-bridge", "RoomBridgeStoreEntry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializeEntry(entry: typings.matrixAppserviceBridge.roomBridgeStoreMod.RoomBridgeStoreEntry): RoomStoreEntryDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[RoomStoreEntryDoc]
}
