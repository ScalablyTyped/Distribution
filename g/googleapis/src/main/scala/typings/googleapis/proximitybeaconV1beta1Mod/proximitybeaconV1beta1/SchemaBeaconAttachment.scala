package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaBeaconAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBeaconAttachment]
  }
  
  @scala.inline
  implicit class SchemaBeaconAttachmentOps[Self <: SchemaBeaconAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachmentName(value: String): Self = this.set("attachmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentName: Self = this.set("attachmentName", js.undefined)
    
    @scala.inline
    def setCreationTimeMs(value: String): Self = this.set("creationTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimeMs: Self = this.set("creationTimeMs", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setMaxDistanceMeters(value: Double): Self = this.set("maxDistanceMeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDistanceMeters: Self = this.set("maxDistanceMeters", js.undefined)
    
    @scala.inline
    def setNamespacedType(value: String): Self = this.set("namespacedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespacedType: Self = this.set("namespacedType", js.undefined)
  }
}
