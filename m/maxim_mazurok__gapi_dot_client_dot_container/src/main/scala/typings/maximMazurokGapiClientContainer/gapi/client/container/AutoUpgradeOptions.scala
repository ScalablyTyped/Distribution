package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoUpgradeOptions extends StObject {
  
  /** [Output only] This field is set when upgrades are about to commence with the approximate start time for the upgrades, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var autoUpgradeStartTime: js.UndefOr[String] = js.undefined
  
  /** [Output only] This field is set when upgrades are about to commence with the description of the upgrade. */
  var description: js.UndefOr[String] = js.undefined
}
object AutoUpgradeOptions {
  
  @scala.inline
  def apply(): AutoUpgradeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoUpgradeOptions]
  }
  
  @scala.inline
  implicit class AutoUpgradeOptionsMutableBuilder[Self <: AutoUpgradeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoUpgradeStartTime(value: String): Self = StObject.set(x, "autoUpgradeStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpgradeStartTimeUndefined: Self = StObject.set(x, "autoUpgradeStartTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
