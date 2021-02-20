package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseChannelConfig extends StObject {
  
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
  implicit class ReleaseChannelConfigMutableBuilder[Self <: ReleaseChannelConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setDefaultVersion(value: String): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVersionUndefined: Self = StObject.set(x, "defaultVersion", js.undefined)
    
    @scala.inline
    def setValidVersions(value: js.Array[String]): Self = StObject.set(x, "validVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidVersionsUndefined: Self = StObject.set(x, "validVersions", js.undefined)
    
    @scala.inline
    def setValidVersionsVarargs(value: String*): Self = StObject.set(x, "validVersions", js.Array(value :_*))
  }
}
