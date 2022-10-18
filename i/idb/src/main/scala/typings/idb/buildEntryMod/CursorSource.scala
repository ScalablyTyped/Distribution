package typings.idb.buildEntryMod

import typings.std.ArrayLike
import typings.std.IDBTransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  IndexName extends idb.idb/build/entry.IndexNames<DBTypes, StoreName> ? idb.idb/build/entry.IDBPIndex<DBTypes, TxStores, StoreName, IndexName, Mode> : idb.idb/build/entry.IDBPObjectStore<DBTypes, TxStores, StoreName, Mode>
  }}}
  */
@js.native
trait CursorSource[DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */, Mode /* <: IDBTransactionMode */] extends StObject
