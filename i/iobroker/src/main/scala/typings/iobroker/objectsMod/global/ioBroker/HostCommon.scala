package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.JavascriptSlashNodeDotjs
import typings.iobroker.iobrokerStrings.`js-controller`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostCommon extends ObjectCommon {
  
  /** An array of IP addresses this host exposes */
  var address: js.Array[String] = js.native
  
   // e.g. 1.2.3 (following semver)
  /** The command line of the executable */
  var cmd: String = js.native
  
  // Make it possible to narrow the object type using the custom property
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  var hostname: String = js.native
  
  var installedVersion: String = js.native
  
  /** The display name of this host */
  @JSName("name")
  var name_HostCommon: String = js.native
  
  var platform: JavascriptSlashNodeDotjs = js.native
  
  var title: String = js.native
  
   // IPv4 or IPv6
  var `type`: `js-controller` = js.native
}
object HostCommon {
  
  @scala.inline
  def apply(
    address: js.Array[String],
    cmd: String,
    hostname: String,
    installedVersion: String,
    name: String,
    platform: JavascriptSlashNodeDotjs,
    title: String,
    `type`: `js-controller`
  ): HostCommon = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], installedVersion = installedVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostCommon]
  }
  
  @scala.inline
  implicit class HostCommonOps[Self <: HostCommon] (val x: Self) extends AnyVal {
    
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
    def setCmd(value: String): Self = this.set("cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledVersion(value: String): Self = this.set("installedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: JavascriptSlashNodeDotjs): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `js-controller`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
