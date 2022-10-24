package typings.idb

import typings.idb.buildEntryMod.DBSchema
import typings.idb.buildEntryMod.DeleteDBCallbacks
import typings.idb.buildEntryMod.IDBPDatabase
import typings.idb.buildEntryMod.IDBPIndex
import typings.idb.buildEntryMod.IDBPObjectStore
import typings.idb.buildEntryMod.IDBPTransaction
import typings.idb.buildEntryMod.IndexNames
import typings.idb.buildEntryMod.OpenDBCallbacks
import typings.idb.buildEntryMod.StoreNames
import typings.idb.buildWrapIdbValueMod.Unwrap_
import typings.idb.idbStrings.readonly
import typings.std.ArrayLike
import typings.std.IDBDatabase
import typings.std.IDBIndex
import typings.std.IDBObjectStore
import typings.std.IDBOpenDBRequest
import typings.std.IDBRequest
import typings.std.IDBTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("idb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteDB(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDB")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def deleteDB(name: String, param1: DeleteDBCallbacks): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteDB")(name.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def openDB[DBTypes /* <: DBSchema | Any */](name: String): js.Promise[IDBPDatabase[DBTypes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]
  inline def openDB[DBTypes /* <: DBSchema | Any */](name: String, version: Double): js.Promise[IDBPDatabase[DBTypes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]
  inline def openDB[DBTypes /* <: DBSchema | Any */](name: String, version: Double, param2: OpenDBCallbacks[DBTypes]): js.Promise[IDBPDatabase[DBTypes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]
  inline def openDB[DBTypes /* <: DBSchema | Any */](name: String, version: Unit, param2: OpenDBCallbacks[DBTypes]): js.Promise[IDBPDatabase[DBTypes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]
  
  @JSImport("idb", "unwrap")
  @js.native
  val unwrap: Unwrap_ = js.native
  
  inline def wrap(value: IDBDatabase): IDBPDatabase[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPDatabase[Any]]
  inline def wrap(value: IDBIndex): IDBPIndex[
    Any, 
    ArrayLike[StoreNames[Any]], 
    StoreNames[Any], 
    IndexNames[Any, StoreNames[Any]], 
    readonly
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPIndex[
    Any, 
    ArrayLike[StoreNames[Any]], 
    StoreNames[Any], 
    IndexNames[Any, StoreNames[Any]], 
    readonly
  ]]
  inline def wrap(value: IDBObjectStore): IDBPObjectStore[Any, ArrayLike[StoreNames[Any]], StoreNames[Any], readonly] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPObjectStore[Any, ArrayLike[StoreNames[Any]], StoreNames[Any], readonly]]
  inline def wrap(value: IDBOpenDBRequest): js.Promise[js.UndefOr[IDBPDatabase[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[IDBPDatabase[Any]]]]
  inline def wrap(value: IDBTransaction): IDBPTransaction[Any, ArrayLike[StoreNames[Any]], readonly] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPTransaction[Any, ArrayLike[StoreNames[Any]], readonly]]
  inline def wrap[T](value: IDBRequest[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
}
