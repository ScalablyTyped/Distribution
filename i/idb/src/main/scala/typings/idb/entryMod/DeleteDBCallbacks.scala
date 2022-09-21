package typings.idb.entryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBCallbacks extends StObject {
  
  /**
    * Called if there are connections to this database open, so it cannot be deleted.
    */
  var blocked: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object DeleteDBCallbacks {
  
  inline def apply(): DeleteDBCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBCallbacks]
  }
  
  extension [Self <: DeleteDBCallbacks](x: Self) {
    
    inline def setBlocked(value: () => Unit): Self = StObject.set(x, "blocked", js.Any.fromFunction0(value))
    
    inline def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
  }
}
