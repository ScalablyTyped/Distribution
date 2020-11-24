package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseChannelConfig extends js.Object {
  
  /** The release channel this configuration applies to. */
  var channel: js.UndefOr[String] = js.native
  
  /** The default version for newly created clusters on the channel. */
  var defaultVersion: js.UndefOr[String] = js.native
  
  /** List of valid versions for the channel. */
  var validVersions: js.UndefOr[js.Array[String]] = js.native
}
object ReleaseChannelConfig {
  
  @scala.inline
  def apply(): ReleaseChannelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseChannelConfig]
  }
  
  @scala.inline
  implicit class ReleaseChannelConfigOps[Self <: ReleaseChannelConfig] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setDefaultVersion(value: String): Self = this.set("defaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVersion: Self = this.set("defaultVersion", js.undefined)
    
    @scala.inline
    def setValidVersionsVarargs(value: String*): Self = this.set("validVersions", js.Array(value :_*))
    
    @scala.inline
    def setValidVersions(value: js.Array[String]): Self = this.set("validVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidVersions: Self = this.set("validVersions", js.undefined)
  }
}
