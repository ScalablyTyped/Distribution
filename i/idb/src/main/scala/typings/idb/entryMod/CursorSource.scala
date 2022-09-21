package typings.idb.entryMod

import typings.std.ArrayLike
import typings.std.IDBTransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.idb.entryMod.IDBPObjectStore[DBTypes, TxStores, StoreName, Mode]
  - typings.idb.entryMod.IDBPIndex[DBTypes, TxStores, StoreName, IndexName, Mode]
*/
trait CursorSource[DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */, Mode /* <: IDBTransactionMode */] extends StObject
