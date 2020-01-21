package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Project-specific data associated with a beacon.
  */
@js.native
trait SchemaBeaconAttachment extends js.Object {
  /**
    * Resource name of this attachment. Attachment names have the format:
    * &lt;code&gt;beacons/&lt;var&gt;beacon_id&lt;/var&gt;/attachments/&lt;var&gt;attachment_id&lt;/var&gt;&lt;/code&gt;.
    * Leave this empty on creation.
    */
  var attachmentName: js.UndefOr[String] = js.native
  /**
    * The UTC time when this attachment was created, in milliseconds since the
    * UNIX epoch.
    */
  var creationTimeMs: js.UndefOr[String] = js.native
  /**
    * An opaque data container for client-provided data. Must be
    * [base64](http://tools.ietf.org/html/rfc4648#section-4) encoded in HTTP
    * requests, and will be so encoded (with padding) in responses. Required.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The distance away from the beacon at which this attachment should be
    * delivered to a mobile app.  Setting this to a value greater than zero
    * indicates that the app should behave as if the beacon is &quot;seen&quot;
    * when the mobile device is less than this distance away from the beacon.
    * Different attachments on the same beacon can have different max
    * distances.  Note that even though this value is expressed with fractional
    * meter precision, real-world behavior is likley to be much less precise
    * than one meter, due to the nature of current Bluetooth radio technology.
    * Optional. When not set or zero, the attachment should be delivered at the
    * beacon&#39;s outer limit of detection.  Negative values are invalid and
    * return an error.
    */
  var maxDistanceMeters: js.UndefOr[Double] = js.native
  /**
    * Specifies what kind of attachment this is. Tells a client how to
    * interpret the `data` field. Format is
    * &lt;var&gt;namespace/type&lt;/var&gt;. Namespace provides type separation
    * between clients. Type describes the type of `data`, for use by the client
    * when parsing the `data` field. Required.
    */
  var namespacedType: js.UndefOr[String] = js.native
}

object SchemaBeaconAttachment {
  @scala.inline
  def apply(
    attachmentName: String = null,
    creationTimeMs: String = null,
    data: String = null,
    maxDistanceMeters: Int | Double = null,
    namespacedType: String = null
  ): SchemaBeaconAttachment = {
    val __obj = js.Dynamic.literal()
    if (attachmentName != null) __obj.updateDynamic("attachmentName")(attachmentName.asInstanceOf[js.Any])
    if (creationTimeMs != null) __obj.updateDynamic("creationTimeMs")(creationTimeMs.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (maxDistanceMeters != null) __obj.updateDynamic("maxDistanceMeters")(maxDistanceMeters.asInstanceOf[js.Any])
    if (namespacedType != null) __obj.updateDynamic("namespacedType")(namespacedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBeaconAttachment]
  }
}

