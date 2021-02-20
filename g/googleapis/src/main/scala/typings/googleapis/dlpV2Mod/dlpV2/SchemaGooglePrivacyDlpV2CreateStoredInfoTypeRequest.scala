package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for CreateStoredInfoType.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest extends StObject {
  
  /**
    * Configuration of the storedInfoType to create.
    */
  var config: js.UndefOr[SchemaGooglePrivacyDlpV2StoredInfoTypeConfig] = js.native
  
  /**
    * The storedInfoType ID can contain uppercase and lowercase letters,
    * numbers, and hyphens; that is, it must match the regular expression:
    * `[a-zA-Z\\d-_]+`. The maximum length is 100 characters. Can be empty to
    * allow the system to generate one.
    */
  var storedInfoTypeId: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequestMutableBuilder[Self <: SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: SchemaGooglePrivacyDlpV2StoredInfoTypeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setStoredInfoTypeId(value: String): Self = StObject.set(x, "storedInfoTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoredInfoTypeIdUndefined: Self = StObject.set(x, "storedInfoTypeId", js.undefined)
  }
}
