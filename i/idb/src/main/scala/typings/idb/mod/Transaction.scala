package typings.idb.mod

import typings.idb.idbStrings.readonly
import typings.idb.idbStrings.readwrite
import typings.idb.idbStrings.versionchange
import typings.std.DOMStringList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends js.Object {
  
  /** Rolls back all the changes to objects in the database associated with this transaction. If this transaction has been aborted or completed, then this method throws an error event. */
  def abort(): Unit = js.native
  
  /** Resolves when transaction completes, rejects if transaction aborts or errors. */
  val complete: js.Promise[Unit] = js.native
  
  /** The mode for isolating access to data in the object stores that are in the scope of the transaction. For possible values, see the Constants section below. The default value is readonly. */
  val mode: readonly | readwrite | versionchange = js.native
  
  /** Returns an ObjectStore object representing an object store that is part of the scope of this transaction.
    * @param name The name of the requested object store.
    * @returns The object store in the context of the transaction. */
  def objectStore[TValue, TKey](name: String): ObjectStore[TValue, TKey] = js.native
  
  /** Returns a DOMStringList of the names of IDBObjectStore objects. */
  val objectStoreNames: DOMStringList = js.native
}
object Transaction {
  
  @scala.inline
  def apply(
    abort: () => Unit,
    complete: js.Promise[Unit],
    mode: readonly | readwrite | versionchange,
    objectStore: String => ObjectStore[js.Any, js.Any],
    objectStoreNames: DOMStringList
  ): Transaction = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), complete = complete.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], objectStore = js.Any.fromFunction1(objectStore), objectStoreNames = objectStoreNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComplete(value: js.Promise[Unit]): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: readonly | readwrite | versionchange): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectStore(value: String => ObjectStore[js.Any, js.Any]): Self = this.set("objectStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObjectStoreNames(value: DOMStringList): Self = this.set("objectStoreNames", value.asInstanceOf[js.Any])
  }
}
