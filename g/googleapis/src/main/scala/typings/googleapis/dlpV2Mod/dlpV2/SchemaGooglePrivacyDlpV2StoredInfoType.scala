package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StoredInfoType resource message that contains information about the current
  * version and any pending updates.
  */
@js.native
trait SchemaGooglePrivacyDlpV2StoredInfoType extends StObject {
  
  /**
    * Current version of the stored info type.
    */
  var currentVersion: js.UndefOr[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion] = js.native
  
  /**
    * Resource name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Pending versions of the stored info type. Empty if no versions are
    * pending.
    */
  var pendingVersions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion]] = js.native
}
object SchemaGooglePrivacyDlpV2StoredInfoType {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2StoredInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredInfoType]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2StoredInfoTypeMutableBuilder[Self <: SchemaGooglePrivacyDlpV2StoredInfoType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentVersion(value: SchemaGooglePrivacyDlpV2StoredInfoTypeVersion): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPendingVersions(value: js.Array[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion]): Self = StObject.set(x, "pendingVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingVersionsUndefined: Self = StObject.set(x, "pendingVersions", js.undefined)
    
    @scala.inline
    def setPendingVersionsVarargs(value: SchemaGooglePrivacyDlpV2StoredInfoTypeVersion*): Self = StObject.set(x, "pendingVersions", js.Array(value :_*))
  }
}
