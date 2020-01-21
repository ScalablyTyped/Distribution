package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPolicyAlternativeNameServerConfigTargetNameServer extends js.Object {
  var ipv4Address: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#policyAlternativeNameServerConfigTargetNameServer&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaPolicyAlternativeNameServerConfigTargetNameServer {
  @scala.inline
  def apply(ipv4Address: String = null, kind: String = null): SchemaPolicyAlternativeNameServerConfigTargetNameServer = {
    val __obj = js.Dynamic.literal()
    if (ipv4Address != null) __obj.updateDynamic("ipv4Address")(ipv4Address.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPolicyAlternativeNameServerConfigTargetNameServer]
  }
}

