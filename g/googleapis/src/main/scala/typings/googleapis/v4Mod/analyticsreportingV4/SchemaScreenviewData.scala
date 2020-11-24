package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaScreenviewData extends js.Object {
  
  /**
    * The application name.
    */
  var appName: js.UndefOr[String] = js.native
  
  /**
    * Mobile manufacturer or branded name. Eg: &quot;Google&quot;,
    * &quot;Apple&quot; etc.
    */
  var mobileDeviceBranding: js.UndefOr[String] = js.native
  
  /**
    * Mobile device model. Eg: &quot;Pixel&quot;, &quot;iPhone&quot; etc.
    */
  var mobileDeviceModel: js.UndefOr[String] = js.native
  
  /**
    * The name of the screen.
    */
  var screenName: js.UndefOr[String] = js.native
}
object SchemaScreenviewData {
  
  @scala.inline
  def apply(): SchemaScreenviewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScreenviewData]
  }
  
  @scala.inline
  implicit class SchemaScreenviewDataOps[Self <: SchemaScreenviewData] (val x: Self) extends AnyVal {
    
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
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppName: Self = this.set("appName", js.undefined)
    
    @scala.inline
    def setMobileDeviceBranding(value: String): Self = this.set("mobileDeviceBranding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileDeviceBranding: Self = this.set("mobileDeviceBranding", js.undefined)
    
    @scala.inline
    def setMobileDeviceModel(value: String): Self = this.set("mobileDeviceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileDeviceModel: Self = this.set("mobileDeviceModel", js.undefined)
    
    @scala.inline
    def setScreenName(value: String): Self = this.set("screenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenName: Self = this.set("screenName", js.undefined)
  }
}
