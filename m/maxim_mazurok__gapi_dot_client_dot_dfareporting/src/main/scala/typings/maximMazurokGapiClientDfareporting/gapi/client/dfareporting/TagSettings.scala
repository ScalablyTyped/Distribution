package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagSettings extends StObject {
  
  /** Whether dynamic floodlight tags are enabled. */
  var dynamicTagEnabled: js.UndefOr[Boolean] = js.native
  
  /** Whether image tags are enabled. */
  var imageTagEnabled: js.UndefOr[Boolean] = js.native
}
object TagSettings {
  
  @scala.inline
  def apply(): TagSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagSettings]
  }
  
  @scala.inline
  implicit class TagSettingsMutableBuilder[Self <: TagSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicTagEnabled(value: Boolean): Self = StObject.set(x, "dynamicTagEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicTagEnabledUndefined: Self = StObject.set(x, "dynamicTagEnabled", js.undefined)
    
    @scala.inline
    def setImageTagEnabled(value: Boolean): Self = StObject.set(x, "imageTagEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTagEnabledUndefined: Self = StObject.set(x, "imageTagEnabled", js.undefined)
  }
}
