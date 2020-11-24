package typings.ionic.capacitorConfigMod

import typings.ionic.anon.OriginalUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacitorConfigFile extends js.Object {
  
  var appId: js.UndefOr[String] = js.native
  
  var appName: js.UndefOr[String] = js.native
  
  var server: js.UndefOr[OriginalUrl] = js.native
  
  var webDir: js.UndefOr[String] = js.native
}
object CapacitorConfigFile {
  
  @scala.inline
  def apply(): CapacitorConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacitorConfigFile]
  }
  
  @scala.inline
  implicit class CapacitorConfigFileOps[Self <: CapacitorConfigFile] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppName: Self = this.set("appName", js.undefined)
    
    @scala.inline
    def setServer(value: OriginalUrl): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    
    @scala.inline
    def setWebDir(value: String): Self = this.set("webDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebDir: Self = this.set("webDir", js.undefined)
  }
}
