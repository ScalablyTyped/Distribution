package typings.idbKeyval

import typings.idbKeyval.mod.UseStore
import typings.std.IDBRequest
import typings.std.IDBTransaction
import typings.std.IDBValidKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompatMod {
  
  @JSImport("idb-keyval/dist/compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[js.Promise[Unit]]
  inline def clear(customStore: UseStore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(customStore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def createStore(dbName: String, storeName: String): UseStore = (^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(dbName.asInstanceOf[js.Any], storeName.asInstanceOf[js.Any])).asInstanceOf[UseStore]
  
  inline def del(key: IDBValidKey): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def del(key: IDBValidKey, customStore: UseStore): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(key.asInstanceOf[js.Any], customStore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def delMany(keys: js.Array[IDBValidKey]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delMany")(keys.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def delMany(keys: js.Array[IDBValidKey], customStore: UseStore): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delMany")(keys.asInstanceOf[js.Any], customStore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def entries[KeyType /* <: IDBValidKey */, ValueType](): js.Promise[js.Array[js.Tuple2[KeyType, ValueType]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[js.Promise[js.Array[js.Tuple2[KeyType, ValueType]]]]
  inline def entries[KeyType /* <: IDBValidKey */, ValueType](customStore: UseStore): js.Promise[js.Array[js.Tuple2[KeyType, ValueType]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(customStore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Tuple2[KeyType, ValueType]]]]
  
  inline def get[T](key: IDBValidKey): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[T]]]
  inline def get[T](key: IDBValidKey, customStore: UseStore): js.Promise[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], customStore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[T]]]
  
  inline def getMany[T](keys: js.Array[IDBValidKey]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMany")(keys.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
  inline def getMany[T](keys: js.Array[IDBValidKey], customStore: UseStore): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMany")(keys.asInstanceOf[js.Any], customStore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  
  inline def keys[KeyType /* <: IDBValidKey */](): js.Promise[js.Array[KeyType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[js.Promise[js.Array[KeyType]]]
  inline def keys[KeyType /* <: IDBValidKey */](customStore: UseStore): js.Promise[js.Array[KeyType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(customStore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[KeyType]]]
  
  inline def promisifyRequest[T](request: IDBRequest[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("promisifyRequest")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def promisifyRequest[T](request: IDBTransaction): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("promisifyRequest")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def set(key: IDBValidKey, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def set(key: IDBValidKey, value: Any, customStore: UseStore): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], customStore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setMany(entries: js.Array[js.Tuple2[IDBValidKey, Any]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setMany")(entries.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setMany(entries: js.Array[js.Tuple2[IDBValidKey, Any]], customStore: UseStore): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setMany")(entries.asInstanceOf[js.Any], customStore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def update[T](key: IDBValidKey, updater: js.Function1[/* oldValue */ js.UndefOr[T], T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(key.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def update[T](key: IDBValidKey, updater: js.Function1[/* oldValue */ js.UndefOr[T], T], customStore: UseStore): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(key.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], customStore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def values[T](): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[js.Promise[js.Array[T]]]
  inline def values[T](customStore: UseStore): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(customStore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
}
