package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDnsKeysListResponse extends js.Object {
  var dnsKeys: js.UndefOr[js.Array[SchemaDnsKey]] = js.native
  var header: js.UndefOr[SchemaResponseHeader] = js.native
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaDnsKeysListResponse {
  @scala.inline
  def apply(
    dnsKeys: js.Array[SchemaDnsKey] = null,
    header: SchemaResponseHeader = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaDnsKeysListResponse = {
    val __obj = js.Dynamic.literal()
    if (dnsKeys != null) __obj.updateDynamic("dnsKeys")(dnsKeys.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDnsKeysListResponse]
  }
}

