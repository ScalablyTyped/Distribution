package typings.kendoUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppMode extends js.Object {
  
  var appMode: Boolean = js.native
  
  var browser: String = js.native
  
  var device: String = js.native
  
  var flatVersion: Double = js.native
  
  var majorVersion: String = js.native
  
  var minorVersion: String = js.native
  
  var name: String = js.native
  
  var tablet: js.Any = js.native
}
object AppMode {
  
  @scala.inline
  def apply(
    appMode: Boolean,
    browser: String,
    device: String,
    flatVersion: Double,
    majorVersion: String,
    minorVersion: String,
    name: String,
    tablet: js.Any
  ): AppMode = {
    val __obj = js.Dynamic.literal(appMode = appMode.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], flatVersion = flatVersion.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppMode]
  }
  
  @scala.inline
  implicit class AppModeOps[Self <: AppMode] (val x: Self) extends AnyVal {
    
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
    def setAppMode(value: Boolean): Self = this.set("appMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatVersion(value: Double): Self = this.set("flatVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorVersion(value: String): Self = this.set("majorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorVersion(value: String): Self = this.set("minorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablet(value: js.Any): Self = this.set("tablet", value.asInstanceOf[js.Any])
  }
}
