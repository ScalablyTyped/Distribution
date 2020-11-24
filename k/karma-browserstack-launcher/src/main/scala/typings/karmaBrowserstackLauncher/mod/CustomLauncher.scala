package typings.karmaBrowserstackLauncher.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLauncher
  extends /**
  * you can also pass through any additional options supported by browserstack. (EG. `url`, `resolution`, etc.)
  * See {@link browserstack.com/automate/capabilities} for a full list of supported options.
  */
/* option */ StringDictionary[js.Any] {
  
  /** name of the browser */
  var browser: js.UndefOr[String | Null] = js.native
  
  /** version of the browser */
  var browser_version: js.UndefOr[String | Null] = js.native
  
  /** the BS worker build name (optional, defaults to global) */
  var build: js.UndefOr[String] = js.native
  
  /** name of the device */
  var device: js.UndefOr[String | Null] = js.native
  
  /** the BS worker name (optional, defaults to global) */
  var name: js.UndefOr[String] = js.native
  
  /** which platform */
  var os: js.UndefOr[String | Null] = js.native
  
  /** version of the platform */
  var os_version: js.UndefOr[String | Null] = js.native
  
  /** the BS worker project name (optional, defaults to global) */
  var project: js.UndefOr[String] = js.native
  
  /** allows the session to run on a real mobile device instead of an emulator / simulator */
  var realMobile: js.UndefOr[Boolean] = js.native
  
  /** allows the session to run on a real mobile device instead of an emulator / simulator */
  var real_mobile: js.UndefOr[Boolean] = js.native
}
object CustomLauncher {
  
  @scala.inline
  def apply(): CustomLauncher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLauncher]
  }
  
  @scala.inline
  implicit class CustomLauncherOps[Self <: CustomLauncher] (val x: Self) extends AnyVal {
    
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
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    
    @scala.inline
    def setBrowserNull: Self = this.set("browser", null)
    
    @scala.inline
    def setBrowser_version(value: String): Self = this.set("browser_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser_version: Self = this.set("browser_version", js.undefined)
    
    @scala.inline
    def setBrowser_versionNull: Self = this.set("browser_version", null)
    
    @scala.inline
    def setBuild(value: String): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    
    @scala.inline
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setDeviceNull: Self = this.set("device", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    
    @scala.inline
    def setOsNull: Self = this.set("os", null)
    
    @scala.inline
    def setOs_version(value: String): Self = this.set("os_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs_version: Self = this.set("os_version", js.undefined)
    
    @scala.inline
    def setOs_versionNull: Self = this.set("os_version", null)
    
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setRealMobile(value: Boolean): Self = this.set("realMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealMobile: Self = this.set("realMobile", js.undefined)
    
    @scala.inline
    def setReal_mobile(value: Boolean): Self = this.set("real_mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReal_mobile: Self = this.set("real_mobile", js.undefined)
  }
}
