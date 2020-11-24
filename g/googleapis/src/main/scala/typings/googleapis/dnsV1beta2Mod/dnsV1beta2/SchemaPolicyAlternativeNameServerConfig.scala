package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPolicyAlternativeNameServerConfig extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#policyAlternativeNameServerConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var targetNameServers: js.UndefOr[js.Array[SchemaPolicyAlternativeNameServerConfigTargetNameServer]] = js.native
}
object SchemaPolicyAlternativeNameServerConfig {
  
  @scala.inline
  def apply(): SchemaPolicyAlternativeNameServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyAlternativeNameServerConfig]
  }
  
  @scala.inline
  implicit class SchemaPolicyAlternativeNameServerConfigOps[Self <: SchemaPolicyAlternativeNameServerConfig] (val x: Self) extends AnyVal {
    
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
    def setTargetNameServersVarargs(value: SchemaPolicyAlternativeNameServerConfigTargetNameServer*): Self = this.set("targetNameServers", js.Array(value :_*))
    
    @scala.inline
    def setTargetNameServers(value: js.Array[SchemaPolicyAlternativeNameServerConfigTargetNameServer]): Self = this.set("targetNameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetNameServers: Self = this.set("targetNameServers", js.undefined)
  }
}
