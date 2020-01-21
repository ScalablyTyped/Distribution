package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDnsKeyDigest extends js.Object {
  var digest: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDnsKeyDigest {
  @scala.inline
  def apply(digest: String = null, `type`: String = null): SchemaDnsKeyDigest = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDnsKeyDigest]
  }
}

