package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListZonesResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * All GTM Zones of a GTM Container.
    */
  var zone: js.UndefOr[js.Array[SchemaZone]] = js.native
}

object SchemaListZonesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, zone: js.Array[SchemaZone] = null): SchemaListZonesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListZonesResponse]
  }
}

