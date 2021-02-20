package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombinedAudienceGroup extends StObject {
  
  /**
    * Required. All combined audience targeting settings in combined audience group. Repeated settings with same id will be ignored. The number of combined audience settings should be no
    * more than five, error will be thrown otherwise.
    */
  var settings: js.UndefOr[js.Array[CombinedAudienceTargetingSetting]] = js.native
}
object CombinedAudienceGroup {
  
  @scala.inline
  def apply(): CombinedAudienceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombinedAudienceGroup]
  }
  
  @scala.inline
  implicit class CombinedAudienceGroupMutableBuilder[Self <: CombinedAudienceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSettings(value: js.Array[CombinedAudienceTargetingSetting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: CombinedAudienceTargetingSetting*): Self = StObject.set(x, "settings", js.Array(value :_*))
  }
}
