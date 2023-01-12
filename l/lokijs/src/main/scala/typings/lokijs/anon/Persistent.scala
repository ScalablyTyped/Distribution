package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Persistent extends StObject {
  
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var suppressRebuildEvent: js.UndefOr[Boolean] = js.undefined
}
object Persistent {
  
  inline def apply(): Persistent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Persistent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Persistent] (val x: Self) extends AnyVal {
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    inline def setSuppressRebuildEvent(value: Boolean): Self = StObject.set(x, "suppressRebuildEvent", value.asInstanceOf[js.Any])
    
    inline def setSuppressRebuildEventUndefined: Self = StObject.set(x, "suppressRebuildEvent", js.undefined)
  }
}
