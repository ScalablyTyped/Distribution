package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaManagedZone extends js.Object {
  
  var creationTime: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var dnsName: js.UndefOr[String] = js.native
  
  var dnssecConfig: js.UndefOr[SchemaManagedZoneDnsSecConfig] = js.native
  
  var forwardingConfig: js.UndefOr[SchemaManagedZoneForwardingConfig] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZone&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nameServerSet: js.UndefOr[String] = js.native
  
  var nameServers: js.UndefOr[js.Array[String]] = js.native
  
  var peeringConfig: js.UndefOr[SchemaManagedZonePeeringConfig] = js.native
  
  var privateVisibilityConfig: js.UndefOr[SchemaManagedZonePrivateVisibilityConfig] = js.native
  
  var visibility: js.UndefOr[String] = js.native
}
object SchemaManagedZone {
  
  @scala.inline
  def apply(): SchemaManagedZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZone]
  }
  
  @scala.inline
  implicit class SchemaManagedZoneOps[Self <: SchemaManagedZone] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDnsName(value: String): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsName: Self = this.set("dnsName", js.undefined)
    
    @scala.inline
    def setDnssecConfig(value: SchemaManagedZoneDnsSecConfig): Self = this.set("dnssecConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnssecConfig: Self = this.set("dnssecConfig", js.undefined)
    
    @scala.inline
    def setForwardingConfig(value: SchemaManagedZoneForwardingConfig): Self = this.set("forwardingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardingConfig: Self = this.set("forwardingConfig", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameServerSet(value: String): Self = this.set("nameServerSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameServerSet: Self = this.set("nameServerSet", js.undefined)
    
    @scala.inline
    def setNameServersVarargs(value: String*): Self = this.set("nameServers", js.Array(value :_*))
    
    @scala.inline
    def setNameServers(value: js.Array[String]): Self = this.set("nameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameServers: Self = this.set("nameServers", js.undefined)
    
    @scala.inline
    def setPeeringConfig(value: SchemaManagedZonePeeringConfig): Self = this.set("peeringConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeeringConfig: Self = this.set("peeringConfig", js.undefined)
    
    @scala.inline
    def setPrivateVisibilityConfig(value: SchemaManagedZonePrivateVisibilityConfig): Self = this.set("privateVisibilityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateVisibilityConfig: Self = this.set("privateVisibilityConfig", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
