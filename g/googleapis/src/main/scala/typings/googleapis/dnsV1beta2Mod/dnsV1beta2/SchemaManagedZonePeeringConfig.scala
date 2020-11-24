package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaManagedZonePeeringConfig extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePeeringConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var targetNetwork: js.UndefOr[SchemaManagedZonePeeringConfigTargetNetwork] = js.native
}
object SchemaManagedZonePeeringConfig {
  
  @scala.inline
  def apply(): SchemaManagedZonePeeringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonePeeringConfig]
  }
  
  @scala.inline
  implicit class SchemaManagedZonePeeringConfigOps[Self <: SchemaManagedZonePeeringConfig] (val x: Self) extends AnyVal {
    
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
    def setTargetNetwork(value: SchemaManagedZonePeeringConfigTargetNetwork): Self = this.set("targetNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetNetwork: Self = this.set("targetNetwork", js.undefined)
  }
}
