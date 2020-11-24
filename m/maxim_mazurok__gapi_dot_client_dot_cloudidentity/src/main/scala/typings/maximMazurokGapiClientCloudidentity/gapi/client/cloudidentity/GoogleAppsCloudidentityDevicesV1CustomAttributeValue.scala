package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1CustomAttributeValue extends js.Object {
  
  /** Represents a boolean value. */
  var boolValue: js.UndefOr[Boolean] = js.native
  
  /** Represents a double value. */
  var numberValue: js.UndefOr[Double] = js.native
  
  /** Represents a string value. */
  var stringValue: js.UndefOr[String] = js.native
}
object GoogleAppsCloudidentityDevicesV1CustomAttributeValue {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1CustomAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1CustomAttributeValue]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1CustomAttributeValueOps[Self <: GoogleAppsCloudidentityDevicesV1CustomAttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    
    @scala.inline
    def setNumberValue(value: Double): Self = this.set("numberValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberValue: Self = this.set("numberValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
}
