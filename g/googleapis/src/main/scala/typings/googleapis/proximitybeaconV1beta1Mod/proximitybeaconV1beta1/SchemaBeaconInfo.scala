package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A subset of beacon information served via the `beaconinfo.getforobserved`
  * method, which you call when users of your app encounter your beacons.
  */
@js.native
trait SchemaBeaconInfo extends StObject {
  
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
  implicit class SchemaBeaconInfoMutableBuilder[Self <: SchemaBeaconInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisedId(value: SchemaAdvertisedId): Self = StObject.set(x, "advertisedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisedIdUndefined: Self = StObject.set(x, "advertisedId", js.undefined)
    
    @scala.inline
    def setAttachments(value: js.Array[SchemaAttachmentInfo]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: SchemaAttachmentInfo*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setBeaconName(value: String): Self = StObject.set(x, "beaconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconNameUndefined: Self = StObject.set(x, "beaconName", js.undefined)
  }
}
