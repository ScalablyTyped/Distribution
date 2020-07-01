package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResourceRecordSet extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#resourceRecordSet&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var rrdatas: js.UndefOr[js.Array[String]] = js.native
  var signatureRrdatas: js.UndefOr[js.Array[String]] = js.native
  var ttl: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SchemaResourceRecordSet {
  @scala.inline
  def apply(
    kind: String = null,
    name: String = null,
    rrdatas: js.Array[String] = null,
    signatureRrdatas: js.Array[String] = null,
    ttl: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): SchemaResourceRecordSet = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rrdatas != null) __obj.updateDynamic("rrdatas")(rrdatas.asInstanceOf[js.Any])
    if (signatureRrdatas != null) __obj.updateDynamic("signatureRrdatas")(signatureRrdatas.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceRecordSet]
  }
}

