package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZoneOperationsListResponse extends js.Object {
  var header: js.UndefOr[SchemaResponseHeader] = js.native
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.native
}

object SchemaManagedZoneOperationsListResponse {
  @scala.inline
  def apply(
    header: SchemaResponseHeader = null,
    kind: String = null,
    nextPageToken: String = null,
    operations: js.Array[SchemaOperation] = null
  ): SchemaManagedZoneOperationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedZoneOperationsListResponse]
  }
}

