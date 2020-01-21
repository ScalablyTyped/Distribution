package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subset of beacon information served via the `beaconinfo.getforobserved`
  * method, which you call when users of your app encounter your beacons.
  */
@js.native
trait SchemaBeaconInfo extends js.Object {
  /**
    * The ID advertised by the beacon.
    */
  var advertisedId: js.UndefOr[SchemaAdvertisedId] = js.native
  /**
    * Attachments matching the type(s) requested. May be empty if no attachment
    * types were requested.
    */
  var attachments: js.UndefOr[js.Array[SchemaAttachmentInfo]] = js.native
  /**
    * The name under which the beacon is registered.
    */
  var beaconName: js.UndefOr[String] = js.native
}

object SchemaBeaconInfo {
  @scala.inline
  def apply(
    advertisedId: SchemaAdvertisedId = null,
    attachments: js.Array[SchemaAttachmentInfo] = null,
    beaconName: String = null
  ): SchemaBeaconInfo = {
    val __obj = js.Dynamic.literal()
    if (advertisedId != null) __obj.updateDynamic("advertisedId")(advertisedId.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (beaconName != null) __obj.updateDynamic("beaconName")(beaconName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBeaconInfo]
  }
}

