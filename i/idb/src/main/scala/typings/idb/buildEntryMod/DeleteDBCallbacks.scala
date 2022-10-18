package typings.idb.buildEntryMod

import typings.std.IDBVersionChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBCallbacks extends StObject {
  
  /**
    * Called if there are connections to this database open, so it cannot be deleted.
    *
    * @param currentVersion Version of the database that's blocking the delete operation.
    * @param event The event object for the associated `blocked` event.
    */
  var blocked: js.UndefOr[
    js.Function2[/* currentVersion */ Double, /* event */ IDBVersionChangeEvent, Unit]
  ] = js.undefined
}
object DeleteDBCallbacks {
  
  inline def apply(): DeleteDBCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBCallbacks]
  }
  
  extension [Self <: DeleteDBCallbacks](x: Self) {
    
    inline def setBlocked(value: (/* currentVersion */ Double, /* event */ IDBVersionChangeEvent) => Unit): Self = StObject.set(x, "blocked", js.Any.fromFunction2(value))
    
    inline def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
  }
}
