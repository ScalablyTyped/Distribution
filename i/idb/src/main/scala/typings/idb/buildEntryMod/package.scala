package typings.idb.buildEntryMod

import org.scalablytyped.runtime.StringDictionary
import typings.idb.buildEntryMod.^
import typings.idb.buildWrapIdbValueMod.Unwrap_
import typings.idb.idbStrings.readonly
import typings.std.ArrayLike
import typings.std.Exclude
import typings.std.IDBDatabase
import typings.std.IDBIndex
import typings.std.IDBObjectStore
import typings.std.IDBOpenDBRequest
import typings.std.IDBRequest
import typings.std.IDBTransaction
import typings.std.IDBTransactionMode
import typings.std.IDBValidKey
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def deleteDB(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDB")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def deleteDB(name: String, param1: DeleteDBCallbacks): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteDB")(name.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def openDB[DBTypes /* <: DBSchema | Any */](name: String): js.Promise[IDBPDatabase[DBTypes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]
inline def openDB[DBTypes /* <: DBSchema | Any */](name: String, version: Double): js.Promise[IDBPDatabase[DBTypes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]
inline def openDB[DBTypes /* <: DBSchema | Any */](name: String, version: Double, param2: OpenDBCallbacks[DBTypes]): js.Promise[IDBPDatabase[DBTypes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]
inline def openDB[DBTypes /* <: DBSchema | Any */](name: String, version: Unit, param2: OpenDBCallbacks[DBTypes]): js.Promise[IDBPDatabase[DBTypes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]

inline def unwrap: Unwrap_ = ^.asInstanceOf[js.Dynamic].selectDynamic("unwrap").asInstanceOf[Unwrap_]

inline def wrap(value: IDBDatabase): IDBPDatabase[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPDatabase[Any]]
inline def wrap(value: IDBIndex): IDBPIndex[
Any, 
ArrayLike[StoreNames[Any]], 
StoreNames[Any], 
IndexNames[Any, StoreNames[Any]], 
readonly] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPIndex[
Any, 
ArrayLike[StoreNames[Any]], 
StoreNames[Any], 
IndexNames[Any, StoreNames[Any]], 
readonly]]
inline def wrap(value: IDBObjectStore): IDBPObjectStore[Any, ArrayLike[StoreNames[Any]], StoreNames[Any], readonly] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPObjectStore[Any, ArrayLike[StoreNames[Any]], StoreNames[Any], readonly]]
inline def wrap(value: IDBOpenDBRequest): js.Promise[js.UndefOr[IDBPDatabase[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[IDBPDatabase[Any]]]]
inline def wrap(value: IDBTransaction): IDBPTransaction[Any, ArrayLike[StoreNames[Any]], readonly] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPTransaction[Any, ArrayLike[StoreNames[Any]], readonly]]
inline def wrap[T](value: IDBRequest[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  IndexName extends idb.idb/build/entry.IndexNames<DBTypes, StoreName> ? idb.idb/build/entry.IndexKey<DBTypes, StoreName, IndexName> : idb.idb/build/entry.StoreKey<DBTypes, StoreName>
  }}}
  */
type CursorKey[DBTypes /* <: DBSchema | Any */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */] = IDBValidKey

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  IndexName extends idb.idb/build/entry.IndexNames<DBTypes, StoreName> ? idb.idb/build/entry.IDBPIndex<DBTypes, TxStores, StoreName, IndexName, Mode> : idb.idb/build/entry.IDBPObjectStore<DBTypes, TxStores, StoreName, Mode>
  }}}
  */
type CursorSource[DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */, Mode /* <: IDBTransactionMode */] = IDBPIndex[DBTypes, TxStores, StoreName, IndexName, Mode]

type DBSchema = StringDictionary[DBSchemaValue]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  DBTypes extends idb.idb/build/entry.DBSchema ? IndexName extends keyof DBTypes[StoreName]['indexes'] ? DBTypes[StoreName]['indexes'][IndexName] : std.IDBValidKey : std.IDBValidKey
  }}}
  */
type IndexKey[DBTypes /* <: DBSchema | Any */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, StoreName] */] = IDBValidKey

type IndexKeys = StringDictionary[IDBValidKey]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  DBTypes extends idb.idb/build/entry.DBSchema ? keyof DBTypes[StoreName]['indexes'] : string
  }}}
  */
type IndexNames[DBTypes /* <: DBSchema | Any */, StoreName /* <: StoreNames[DBTypes] */] = String

type KnownKeys[T] = ValuesOf[KeyToKeyNoIndex[T]]

type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  DBTypes extends idb.idb/build/entry.DBSchema ? DBTypes[StoreName]['key'] : std.IDBValidKey
  }}}
  */
type StoreKey[DBTypes /* <: DBSchema | Any */, StoreName /* <: StoreNames[DBTypes] */] = IDBValidKey

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  DBTypes extends idb.idb/build/entry.DBSchema ? idb.idb/build/entry.KnownKeys<DBTypes> : string
  }}}
  */
type StoreNames[DBTypes /* <: DBSchema | Any */] = String
