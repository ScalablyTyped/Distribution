package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDnsKey extends js.Object {
  var algorithm: js.UndefOr[String] = js.native
  var creationTime: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var digests: js.UndefOr[js.Array[SchemaDnsKeyDigest]] = js.native
  var id: js.UndefOr[String] = js.native
  var isActive: js.UndefOr[Boolean] = js.native
  var keyLength: js.UndefOr[Double] = js.native
  var keyTag: js.UndefOr[Double] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#dnsKey&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var publicKey: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDnsKey {
  @scala.inline
  def apply(
    algorithm: String = null,
    creationTime: String = null,
    description: String = null,
    digests: js.Array[SchemaDnsKeyDigest] = null,
    id: String = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    keyLength: js.UndefOr[Double] = js.undefined,
    keyTag: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    publicKey: String = null,
    `type`: String = null
  ): SchemaDnsKey = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (digests != null) __obj.updateDynamic("digests")(digests.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyLength)) __obj.updateDynamic("keyLength")(keyLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyTag)) __obj.updateDynamic("keyTag")(keyTag.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDnsKey]
  }
}

