package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2DataProfilePubSubMessage extends StObject {
  
  /**
    * The event that caused the Pub/Sub message to be sent.
    */
  var event: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated. Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and `full_resource` will be populated.
    */
  var profile: js.UndefOr[SchemaGooglePrivacyDlpV2TableDataProfile] = js.undefined
}
object SchemaGooglePrivacyDlpV2DataProfilePubSubMessage {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DataProfilePubSubMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DataProfilePubSubMessage]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DataProfilePubSubMessage](x: Self) {
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventNull: Self = StObject.set(x, "event", null)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setProfile(value: SchemaGooglePrivacyDlpV2TableDataProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
  }
}
