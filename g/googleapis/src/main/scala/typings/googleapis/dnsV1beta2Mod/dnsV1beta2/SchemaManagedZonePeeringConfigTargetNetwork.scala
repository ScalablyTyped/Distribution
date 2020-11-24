package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaManagedZonePeeringConfigTargetNetwork extends js.Object {
  
  var deactivateTime: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePeeringConfigTargetNetwork&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var networkUrl: js.UndefOr[String] = js.native
}
object SchemaManagedZonePeeringConfigTargetNetwork {
  
  @scala.inline
  def apply(): SchemaManagedZonePeeringConfigTargetNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonePeeringConfigTargetNetwork]
  }
  
  @scala.inline
  implicit class SchemaManagedZonePeeringConfigTargetNetworkOps[Self <: SchemaManagedZonePeeringConfigTargetNetwork] (val x: Self) extends AnyVal {
    
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
    def setDeactivateTime(value: String): Self = this.set("deactivateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeactivateTime: Self = this.set("deactivateTime", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNetworkUrl(value: String): Self = this.set("networkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkUrl: Self = this.set("networkUrl", js.undefined)
  }
}
