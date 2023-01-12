package typings.idb.buildEntryMod

import typings.idb.idbStrings.abort
import typings.std.ArrayLike
import typings.std.Event
import typings.std.IDBTransactionDurability
import typings.std.IDBTransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBPTransaction[DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, Mode /* <: IDBTransactionMode */]
  extends StObject
     with IDBPTransactionExtends {
  
  /**
    * The transaction's connection.
    */
  val db: IDBPDatabase[DBTypes]
  
  /**
    * Promise for the completion of this transaction.
    */
  val done: js.Promise[Unit]
  
  /**
    * The transaction's mode.
    */
  @JSName("mode")
  val mode_IDBPTransaction: Mode
  
  /**
    * Returns an IDBObjectStore in the transaction's scope.
    */
  def objectStore[StoreName /* <: /* import warning: importer.ImportType#apply Failed type conversion: TxStores[number] */ js.Any */](name: StoreName): IDBPObjectStore[DBTypes, TxStores, StoreName, Mode]
  
  /**
    * The names of stores in scope for this transaction.
    */
  val objectStoreNames: TypedDOMStringList[
    /* import warning: importer.ImportType#apply Failed type conversion: TxStores[number] */ js.Any
  ]
  
  /**
    * The associated object store, if the transaction covers a single store, otherwise undefined.
    */
  val store: /* import warning: importer.ImportType#apply Failed type conversion: TxStores[1] extends undefined ? idb.idb/build/entry.IDBPObjectStore<DBTypes, TxStores, TxStores[0], Mode> : undefined */ js.Any
}
object IDBPTransaction {
  
  inline def apply[DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, Mode /* <: IDBTransactionMode */](
    abort: () => Unit,
    addEventListener: (abort, /* listener */ js.ThisFunction1[IDBPTransaction[DBTypes, TxStores, Mode], /* ev */ Event, Any]) => Unit,
    commit: () => Unit,
    db: IDBPDatabase[DBTypes],
    dispatchEvent: /* event */ Event => Boolean,
    done: js.Promise[Unit],
    durability: IDBTransactionDurability,
    mode: Mode,
    objectStore: Any => IDBPObjectStore[DBTypes, TxStores, Any, Mode],
    objectStoreNames: TypedDOMStringList[
      /* import warning: importer.ImportType#apply Failed type conversion: TxStores[number] */ js.Any
    ],
    removeEventListener: (abort, /* listener */ js.ThisFunction1[IDBPTransaction[DBTypes, TxStores, Mode], /* ev */ Event, Any]) => Unit,
    store: /* import warning: importer.ImportType#apply Failed type conversion: TxStores[1] extends undefined ? idb.idb/build/entry.IDBPObjectStore<DBTypes, TxStores, TxStores[0], Mode> : undefined */ js.Any
  ): IDBPTransaction[DBTypes, TxStores, Mode] = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), addEventListener = js.Any.fromFunction2(addEventListener), commit = js.Any.fromFunction0(commit), db = db.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), done = done.asInstanceOf[js.Any], durability = durability.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], objectStore = js.Any.fromFunction1(objectStore), objectStoreNames = objectStoreNames.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBPTransaction[DBTypes, TxStores, Mode]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDBPTransaction[?, ?, ?], DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, Mode /* <: IDBTransactionMode */] (val x: Self & (IDBPTransaction[DBTypes, TxStores, Mode])) extends AnyVal {
    
    inline def setDb(value: IDBPDatabase[DBTypes]): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setDone(value: js.Promise[Unit]): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setObjectStore(value: Any => IDBPObjectStore[DBTypes, TxStores, Any, Mode]): Self = StObject.set(x, "objectStore", js.Any.fromFunction1(value))
    
    inline def setObjectStoreNames(
      value: TypedDOMStringList[
          /* import warning: importer.ImportType#apply Failed type conversion: TxStores[number] */ js.Any
        ]
    ): Self = StObject.set(x, "objectStoreNames", value.asInstanceOf[js.Any])
    
    inline def setStore(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TxStores[1] extends undefined ? idb.idb/build/entry.IDBPObjectStore<DBTypes, TxStores, TxStores[0], Mode> : undefined */ js.Any
    ): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
