package typings.idb.entryMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.idb.entryMod.^
import typings.idb.idbStrings.readonly
import typings.idb.wrapIdbValueMod.Unwrap_
import typings.std.ArrayLike
import typings.std.Exclude
import typings.std.IDBDatabase
import typings.std.IDBIndex
import typings.std.IDBObjectStore
import typings.std.IDBOpenDBRequest
import typings.std.IDBRequest
import typings.std.IDBTransaction
import typings.std.IDBValidKey
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def deleteDB(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDB")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def deleteDB(name: String, hasBlocked: DeleteDBCallbacks): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteDB")(name.asInstanceOf[js.Any], hasBlocked.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def openDB[DBTypes /* <: DBSchema | Any */](name: String): js.Promise[IDBPDatabase[DBTypes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]
inline def openDB[DBTypes /* <: DBSchema | Any */](name: String, version: Double): js.Promise[IDBPDatabase[DBTypes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]
inline def openDB[DBTypes /* <: DBSchema | Any */](name: String, version: Double, hasBlockedUpgradeBlockingTerminated: OpenDBCallbacks[DBTypes]): js.Promise[IDBPDatabase[DBTypes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], hasBlockedUpgradeBlockingTerminated.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]
inline def openDB[DBTypes /* <: DBSchema | Any */](name: String, version: Unit, hasBlockedUpgradeBlockingTerminated: OpenDBCallbacks[DBTypes]): js.Promise[IDBPDatabase[DBTypes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], hasBlockedUpgradeBlockingTerminated.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]

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

type CursorKey[DBTypes /* <: DBSchema | Any */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */] = (StoreKey[DBTypes, StoreName]) | (IndexKey[DBTypes, StoreName, IndexName])

type DBSchema = StringDictionary[DBSchemaValue]

type IndexKey[DBTypes /* <: DBSchema | Any */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, StoreName] */] = IDBValidKey | (/* import warning: importer.ImportType#apply Failed type conversion: DBTypes[StoreName]['indexes'][IndexName] */ js.Any)

type IndexKeys = StringDictionary[IDBValidKey]

type IndexNames[DBTypes /* <: DBSchema | Any */, StoreName /* <: StoreNames[DBTypes] */] = String | (/* import warning: importer.ImportType#apply Failed type conversion: keyof DBTypes[StoreName]['indexes'] */ js.Any)

type KeyToKeyNoIndex[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: string extends K? never : number extends K? never : K}
  */ typings.idb.idbStrings.KeyToKeyNoIndex & TopLevel[Any]

type KnownKeys[T] = ValuesOf[KeyToKeyNoIndex[T]]

type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]

type StoreKey[DBTypes /* <: DBSchema | Any */, StoreName /* <: StoreNames[DBTypes] */] = IDBValidKey | (/* import warning: importer.ImportType#apply Failed type conversion: DBTypes[StoreName]['key'] */ js.Any)

type StoreNames[DBTypes /* <: DBSchema | Any */] = String | KnownKeys[DBTypes]

type StoreValue[DBTypes /* <: DBSchema | Any */, StoreName /* <: StoreNames[DBTypes] */] = /* import warning: importer.ImportType#apply Failed type conversion: DBTypes[StoreName]['value'] */ js.Any

type ValuesOf[T] = Any
