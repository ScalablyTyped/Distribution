package typings.iobroker.anon

import typings.iobroker.iobrokerBooleans.`true`
import typings.iobroker.iobrokerStrings.JavascriptSlashNodeDotjs
import typings.iobroker.iobrokerStrings.`js-controller`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.HostCommon> */
@js.native
trait PartialHostCommon extends js.Object {
  
  var address: js.UndefOr[js.Array[String]] = js.native
  
  var cmd: js.UndefOr[String] = js.native
  
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  var dontDelete: js.UndefOr[`true`] = js.native
  
  var expert: js.UndefOr[`true`] = js.native
  
  var hostname: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var installedVersion: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var platform: js.UndefOr[JavascriptSlashNodeDotjs] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[`js-controller`] = js.native
}
object PartialHostCommon {
  
  @scala.inline
  def apply(): PartialHostCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHostCommon]
  }
  
  @scala.inline
  implicit class PartialHostCommonOps[Self <: PartialHostCommon] (val x: Self) extends AnyVal {
    
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
    def setAddressVarargs(value: String*): Self = this.set("address", js.Array(value :_*))
    
    @scala.inline
    def setAddress(value: js.Array[String]): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setCmd(value: String): Self = this.set("cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmd: Self = this.set("cmd", js.undefined)
    
    @scala.inline
    def setDontDelete(value: `true`): Self = this.set("dontDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDontDelete: Self = this.set("dontDelete", js.undefined)
    
    @scala.inline
    def setExpert(value: `true`): Self = this.set("expert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpert: Self = this.set("expert", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setInstalledVersion(value: String): Self = this.set("installedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstalledVersion: Self = this.set("installedVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPlatform(value: JavascriptSlashNodeDotjs): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: `js-controller`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
