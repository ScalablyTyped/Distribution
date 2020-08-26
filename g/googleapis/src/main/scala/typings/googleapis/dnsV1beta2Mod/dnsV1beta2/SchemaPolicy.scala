package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPolicy extends js.Object {
  var alternativeNameServerConfig: js.UndefOr[SchemaPolicyAlternativeNameServerConfig] = js.native
  var description: js.UndefOr[String] = js.native
  var enableInboundForwarding: js.UndefOr[Boolean] = js.native
  var enableLogging: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#policy&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var networks: js.UndefOr[js.Array[SchemaPolicyNetwork]] = js.native
}

object SchemaPolicy {
  @scala.inline
  def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  @scala.inline
  implicit class SchemaPolicyOps[Self <: SchemaPolicy] (val x: Self) extends AnyVal {
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
    def setAlternativeNameServerConfig(value: SchemaPolicyAlternativeNameServerConfig): Self = this.set("alternativeNameServerConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternativeNameServerConfig: Self = this.set("alternativeNameServerConfig", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnableInboundForwarding(value: Boolean): Self = this.set("enableInboundForwarding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableInboundForwarding: Self = this.set("enableInboundForwarding", js.undefined)
    @scala.inline
    def setEnableLogging(value: Boolean): Self = this.set("enableLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLogging: Self = this.set("enableLogging", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetworksVarargs(value: SchemaPolicyNetwork*): Self = this.set("networks", js.Array(value :_*))
    @scala.inline
    def setNetworks(value: js.Array[SchemaPolicyNetwork]): Self = this.set("networks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworks: Self = this.set("networks", js.undefined)
  }
  
}

