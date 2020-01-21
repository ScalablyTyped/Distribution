package typings.googleapis.dnsV1Mod.dnsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProject extends js.Object {
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#project&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var number: js.UndefOr[String] = js.native
  var quota: js.UndefOr[SchemaQuota] = js.native
}

object SchemaProject {
  @scala.inline
  def apply(id: String = null, kind: String = null, number: String = null, quota: SchemaQuota = null): SchemaProject = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (quota != null) __obj.updateDynamic("quota")(quota.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProject]
  }
}

