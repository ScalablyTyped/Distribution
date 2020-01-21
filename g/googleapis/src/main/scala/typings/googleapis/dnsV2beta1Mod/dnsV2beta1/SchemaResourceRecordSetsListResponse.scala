package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResourceRecordSetsListResponse extends js.Object {
  var header: js.UndefOr[SchemaResponseHeader] = js.native
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var rrsets: js.UndefOr[js.Array[SchemaResourceRecordSet]] = js.native
}

object SchemaResourceRecordSetsListResponse {
  @scala.inline
  def apply(
    header: SchemaResponseHeader = null,
    kind: String = null,
    nextPageToken: String = null,
    rrsets: js.Array[SchemaResourceRecordSet] = null
  ): SchemaResourceRecordSetsListResponse = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (rrsets != null) __obj.updateDynamic("rrsets")(rrsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceRecordSetsListResponse]
  }
}

