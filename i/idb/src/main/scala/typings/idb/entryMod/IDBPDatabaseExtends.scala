package typings.idb.entryMod

import typings.idb.idbStrings.abort
import typings.std.Event
import typings.std.IDBVersionChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined idb.idb/build/entry.Omit<std.IDBDatabase, 'createObjectStore' | 'deleteObjectStore' | 'transaction' | 'objectStoreNames'> */
trait IDBPDatabaseExtends extends StObject {
  
  @JSName("addEventListener")
  var addEventListener_Original: js.Function2[
    abort, 
    /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any], 
    Unit
  ]
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit
  
  def close(): Unit
  @JSName("close")
  var close_Original: js.Function0[Unit]
  
  def dispatchEvent(event: Event): Boolean
  @JSName("dispatchEvent")
  var dispatchEvent_Original: js.Function1[/* event */ Event, Boolean]
  
  var name: String
  
  var onabort: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
  
  var onclose: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
  
  var onerror: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
  
  var onversionchange: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]) | Null
  ] = js.undefined
  
  @JSName("removeEventListener")
  var removeEventListener_Original: js.Function2[
    abort, 
    /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any], 
    Unit
  ]
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit
  
  var version: Double
}
object IDBPDatabaseExtends {
  
  inline def apply(
    addEventListener: (abort, /* listener */ js.ThisFunction1[IDBPDatabaseExtends, /* ev */ Event, Any]) => Unit,
    close: () => Unit,
    dispatchEvent: /* event */ Event => Boolean,
    name: String,
    removeEventListener: (abort, /* listener */ js.ThisFunction1[IDBPDatabaseExtends, /* ev */ Event, Any]) => Unit,
    version: Double
  ): IDBPDatabaseExtends = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), close = js.Any.fromFunction0(close), dispatchEvent = js.Any.fromFunction1(dispatchEvent), name = name.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBPDatabaseExtends]
  }
  
  extension [Self <: IDBPDatabaseExtends](x: Self) {
    
    inline def setAddEventListener(value: (abort, /* listener */ js.ThisFunction1[IDBPDatabaseExtends, /* ev */ Event, Any]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setDispatchEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnabort(value: js.ThisFunction1[IDBPDatabaseExtends, /* ev */ Event, Any]): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
    
    inline def setOnabortNull: Self = StObject.set(x, "onabort", null)
    
    inline def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
    
    inline def setOnclose(value: js.ThisFunction1[IDBPDatabaseExtends, /* ev */ Event, Any]): Self = StObject.set(x, "onclose", value.asInstanceOf[js.Any])
    
    inline def setOncloseNull: Self = StObject.set(x, "onclose", null)
    
    inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
    
    inline def setOnerror(value: js.ThisFunction1[IDBPDatabaseExtends, /* ev */ Event, Any]): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    inline def setOnerrorNull: Self = StObject.set(x, "onerror", null)
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setOnversionchange(value: js.ThisFunction1[IDBPDatabaseExtends, /* ev */ IDBVersionChangeEvent, Any]): Self = StObject.set(x, "onversionchange", value.asInstanceOf[js.Any])
    
    inline def setOnversionchangeNull: Self = StObject.set(x, "onversionchange", null)
    
    inline def setOnversionchangeUndefined: Self = StObject.set(x, "onversionchange", js.undefined)
    
    inline def setRemoveEventListener(value: (abort, /* listener */ js.ThisFunction1[IDBPDatabaseExtends, /* ev */ Event, Any]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
