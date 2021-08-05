package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Record key for a finding in Cloud Datastore.
  */
trait SchemaGooglePrivacyDlpV2DatastoreKey extends StObject {
  
  /**
    * Datastore entity key.
    */
  var entityKey: js.UndefOr[SchemaGooglePrivacyDlpV2Key] = js.undefined
}
object SchemaGooglePrivacyDlpV2DatastoreKey {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DatastoreKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DatastoreKey]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DatastoreKey](x: Self) {
    
    inline def setEntityKey(value: SchemaGooglePrivacyDlpV2Key): Self = StObject.set(x, "entityKey", value.asInstanceOf[js.Any])
    
    inline def setEntityKeyUndefined: Self = StObject.set(x, "entityKey", js.undefined)
  }
}
