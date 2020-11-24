package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaBeaconInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBeaconInfo]
  }
  
  @scala.inline
  implicit class SchemaBeaconInfoOps[Self <: SchemaBeaconInfo] (val x: Self) extends AnyVal {
    
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
    def setAdvertisedId(value: SchemaAdvertisedId): Self = this.set("advertisedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertisedId: Self = this.set("advertisedId", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: SchemaAttachmentInfo*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[SchemaAttachmentInfo]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setBeaconName(value: String): Self = this.set("beaconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeaconName: Self = this.set("beaconName", js.undefined)
  }
}
