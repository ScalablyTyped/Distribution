package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTagOverride extends StObject {
  
  /** Whether this override is enabled. */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** ID of this event tag override. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
}
object EventTagOverride {
  
  @scala.inline
  def apply(): EventTagOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTagOverride]
  }
  
  @scala.inline
  implicit class EventTagOverrideMutableBuilder[Self <: EventTagOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
