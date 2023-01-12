package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagSettings extends StObject {
  
  /** Whether dynamic floodlight tags are enabled. */
  var dynamicTagEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether image tags are enabled. */
  var imageTagEnabled: js.UndefOr[Boolean] = js.undefined
}
object TagSettings {
  
  inline def apply(): TagSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagSettings] (val x: Self) extends AnyVal {
    
    inline def setDynamicTagEnabled(value: Boolean): Self = StObject.set(x, "dynamicTagEnabled", value.asInstanceOf[js.Any])
    
    inline def setDynamicTagEnabledUndefined: Self = StObject.set(x, "dynamicTagEnabled", js.undefined)
    
    inline def setImageTagEnabled(value: Boolean): Self = StObject.set(x, "imageTagEnabled", value.asInstanceOf[js.Any])
    
    inline def setImageTagEnabledUndefined: Self = StObject.set(x, "imageTagEnabled", js.undefined)
  }
}
