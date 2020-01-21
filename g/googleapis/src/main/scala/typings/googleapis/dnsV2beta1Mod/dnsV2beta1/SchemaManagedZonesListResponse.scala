package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZonesListResponse extends js.Object {
  var header: js.UndefOr[SchemaResponseHeader] = js.native
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  var managedZones: js.UndefOr[js.Array[SchemaManagedZone]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaManagedZonesListResponse {
  @scala.inline
  def apply(
    header: SchemaResponseHeader = null,
    kind: String = null,
    managedZones: js.Array[SchemaManagedZone] = null,
    nextPageToken: String = null
  ): SchemaManagedZonesListResponse = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managedZones != null) __obj.updateDynamic("managedZones")(managedZones.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedZonesListResponse]
  }
}

