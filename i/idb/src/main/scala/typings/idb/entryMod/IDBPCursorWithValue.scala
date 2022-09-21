package typings.idb.entryMod

import typings.std.ArrayLike
import typings.std.IDBTransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBPCursorWithValue[DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */, Mode /* <: IDBTransactionMode */]
  extends StObject
     with IDBPCursor[DBTypes, TxStores, StoreName, IndexName, Mode] {
  
  /**
    * The value of the current item.
    */
  val value: StoreValue[DBTypes, StoreName] = js.native
}
