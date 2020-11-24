package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaManagedZoneForwardingConfigNameServerTarget extends js.Object {
  
  var ipv4Address: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZoneForwardingConfigNameServerTarget&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaManagedZoneForwardingConfigNameServerTarget {
  
  @scala.inline
  def apply(): SchemaManagedZoneForwardingConfigNameServerTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZoneForwardingConfigNameServerTarget]
  }
  
  @scala.inline
  implicit class SchemaManagedZoneForwardingConfigNameServerTargetOps[Self <: SchemaManagedZoneForwardingConfigNameServerTarget] (val x: Self) extends AnyVal {
    
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
    def setIpv4Address(value: String): Self = this.set("ipv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv4Address: Self = this.set("ipv4Address", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
