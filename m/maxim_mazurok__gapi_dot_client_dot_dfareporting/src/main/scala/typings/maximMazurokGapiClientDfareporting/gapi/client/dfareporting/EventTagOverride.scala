package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTagOverride extends StObject {
  
  /** Whether this override is enabled. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** ID of this event tag override. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
}
object EventTagOverride {
  
  inline def apply(): EventTagOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTagOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventTagOverride] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
