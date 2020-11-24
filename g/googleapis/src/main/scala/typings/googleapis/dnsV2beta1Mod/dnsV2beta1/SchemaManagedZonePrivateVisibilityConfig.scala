package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaManagedZonePrivateVisibilityConfig extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePrivateVisibilityConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var networks: js.UndefOr[js.Array[SchemaManagedZonePrivateVisibilityConfigNetwork]] = js.native
}
object SchemaManagedZonePrivateVisibilityConfig {
  
  @scala.inline
  def apply(): SchemaManagedZonePrivateVisibilityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonePrivateVisibilityConfig]
  }
  
  @scala.inline
  implicit class SchemaManagedZonePrivateVisibilityConfigOps[Self <: SchemaManagedZonePrivateVisibilityConfig] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNetworksVarargs(value: SchemaManagedZonePrivateVisibilityConfigNetwork*): Self = this.set("networks", js.Array(value :_*))
    
    @scala.inline
    def setNetworks(value: js.Array[SchemaManagedZonePrivateVisibilityConfigNetwork]): Self = this.set("networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworks: Self = this.set("networks", js.undefined)
  }
}
