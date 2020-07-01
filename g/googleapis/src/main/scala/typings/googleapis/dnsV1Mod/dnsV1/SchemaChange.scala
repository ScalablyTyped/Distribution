package typings.googleapis.dnsV1Mod.dnsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaChange extends js.Object {
  var additions: js.UndefOr[js.Array[SchemaResourceRecordSet]] = js.native
  var deletions: js.UndefOr[js.Array[SchemaResourceRecordSet]] = js.native
  var id: js.UndefOr[String] = js.native
  var isServing: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#change&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var startTime: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object SchemaChange {
  @scala.inline
  def apply(
    additions: js.Array[SchemaResourceRecordSet] = null,
    deletions: js.Array[SchemaResourceRecordSet] = null,
    id: String = null,
    isServing: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    startTime: String = null,
    status: String = null
  ): SchemaChange = {
    val __obj = js.Dynamic.literal()
    if (additions != null) __obj.updateDynamic("additions")(additions.asInstanceOf[js.Any])
    if (deletions != null) __obj.updateDynamic("deletions")(deletions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isServing)) __obj.updateDynamic("isServing")(isServing.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChange]
  }
}

