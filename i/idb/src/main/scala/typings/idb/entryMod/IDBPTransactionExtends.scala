package typings.idb.entryMod

import typings.idb.idbStrings.abort
import typings.std.DOMException
import typings.std.Event
import typings.std.IDBTransactionDurability
import typings.std.IDBTransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined idb.idb/build/entry.Omit<std.IDBTransaction, 'db' | 'objectStore' | 'objectStoreNames'> */
trait IDBPTransactionExtends extends StObject {
  
  def abort(): Unit
  @JSName("abort")
  var abort_Original: js.Function0[Unit]
  
  @JSName("addEventListener")
  var addEventListener_Original: js.Function2[
    abort, 
    /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any], 
    Unit
  ]
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit
  
  def commit(): Unit
  @JSName("commit")
  var commit_Original: js.Function0[Unit]
  
  def dispatchEvent(event: Event): Boolean
  @JSName("dispatchEvent")
  var dispatchEvent_Original: js.Function1[/* event */ Event, Boolean]
  
  var durability: IDBTransactionDurability
  
  var error: js.UndefOr[DOMException | Null] = js.undefined
  
  var mode: IDBTransactionMode
  
  var onabort: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
  
  var oncomplete: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
  
  var onerror: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
  
  @JSName("removeEventListener")
  var removeEventListener_Original: js.Function2[
    abort, 
    /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any], 
    Unit
  ]
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit
}
object IDBPTransactionExtends {
  
  inline def apply(
    abort: () => Unit,
    addEventListener: (abort, /* listener */ js.ThisFunction1[IDBPTransactionExtends, /* ev */ Event, Any]) => Unit,
    commit: () => Unit,
    dispatchEvent: /* event */ Event => Boolean,
    durability: IDBTransactionDurability,
    mode: IDBTransactionMode,
    removeEventListener: (abort, /* listener */ js.ThisFunction1[IDBPTransactionExtends, /* ev */ Event, Any]) => Unit
  ): IDBPTransactionExtends = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), addEventListener = js.Any.fromFunction2(addEventListener), commit = js.Any.fromFunction0(commit), dispatchEvent = js.Any.fromFunction1(dispatchEvent), durability = durability.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[IDBPTransactionExtends]
  }
  
  extension [Self <: IDBPTransactionExtends](x: Self) {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setAddEventListener(
      value: (abort, /* listener */ js.ThisFunction1[IDBPTransactionExtends, /* ev */ Event, Any]) => Unit
    ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setCommit(value: () => Unit): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
    
    inline def setDispatchEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    inline def setDurability(value: IDBTransactionDurability): Self = StObject.set(x, "durability", value.asInstanceOf[js.Any])
    
    inline def setError(value: DOMException): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMode(value: IDBTransactionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOnabort(value: js.ThisFunction1[IDBPTransactionExtends, /* ev */ Event, Any]): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
    
    inline def setOnabortNull: Self = StObject.set(x, "onabort", null)
    
    inline def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
    
    inline def setOncomplete(value: js.ThisFunction1[IDBPTransactionExtends, /* ev */ Event, Any]): Self = StObject.set(x, "oncomplete", value.asInstanceOf[js.Any])
    
    inline def setOncompleteNull: Self = StObject.set(x, "oncomplete", null)
    
    inline def setOncompleteUndefined: Self = StObject.set(x, "oncomplete", js.undefined)
    
    inline def setOnerror(value: js.ThisFunction1[IDBPTransactionExtends, /* ev */ Event, Any]): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    inline def setOnerrorNull: Self = StObject.set(x, "onerror", null)
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setRemoveEventListener(
      value: (abort, /* listener */ js.ThisFunction1[IDBPTransactionExtends, /* ev */ Event, Any]) => Unit
    ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
  }
}
