package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A subset of beacon information served via the `beaconinfo.getforobserved`
  * method, which you call when users of your app encounter your beacons.
  */
trait SchemaBeaconInfo extends StObject {
  
  /**
    * The ID advertised by the beacon.
    */
  var advertisedId: js.UndefOr[SchemaAdvertisedId] = js.undefined
  
  /**
    * Attachments matching the type(s) requested. May be empty if no attachment
    * types were requested.
    */
  var attachments: js.UndefOr[js.Array[SchemaAttachmentInfo]] = js.undefined
  
  /**
    * The name under which the beacon is registered.
    */
  var beaconName: js.UndefOr[String] = js.undefined
}
object SchemaBeaconInfo {
  
  inline def apply(): SchemaBeaconInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBeaconInfo]
  }
  
  extension [Self <: SchemaBeaconInfo](x: Self) {
    
    inline def setAdvertisedId(value: SchemaAdvertisedId): Self = StObject.set(x, "advertisedId", value.asInstanceOf[js.Any])
    
    inline def setAdvertisedIdUndefined: Self = StObject.set(x, "advertisedId", js.undefined)
    
    inline def setAttachments(value: js.Array[SchemaAttachmentInfo]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: SchemaAttachmentInfo*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    inline def setBeaconName(value: String): Self = StObject.set(x, "beaconName", value.asInstanceOf[js.Any])
    
    inline def setBeaconNameUndefined: Self = StObject.set(x, "beaconName", js.undefined)
  }
}
