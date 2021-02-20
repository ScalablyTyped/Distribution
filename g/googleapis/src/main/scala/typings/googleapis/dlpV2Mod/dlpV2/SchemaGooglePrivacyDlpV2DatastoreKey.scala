package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Record key for a finding in Cloud Datastore.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DatastoreKey extends StObject {
  
  /**
    * Datastore entity key.
    */
  var entityKey: js.UndefOr[SchemaGooglePrivacyDlpV2Key] = js.native
}
object SchemaGooglePrivacyDlpV2DatastoreKey {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DatastoreKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DatastoreKey]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DatastoreKeyMutableBuilder[Self <: SchemaGooglePrivacyDlpV2DatastoreKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityKey(value: SchemaGooglePrivacyDlpV2Key): Self = StObject.set(x, "entityKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityKeyUndefined: Self = StObject.set(x, "entityKey", js.undefined)
  }
}
