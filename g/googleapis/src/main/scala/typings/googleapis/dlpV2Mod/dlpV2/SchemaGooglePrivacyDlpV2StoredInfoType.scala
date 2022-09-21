package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2StoredInfoType extends StObject {
  
  /**
    * Current version of the stored info type.
    */
  var currentVersion: js.UndefOr[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion] = js.undefined
  
  /**
    * Resource name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pending versions of the stored info type. Empty if no versions are pending.
    */
  var pendingVersions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion]] = js.undefined
}
object SchemaGooglePrivacyDlpV2StoredInfoType {
  
  inline def apply(): SchemaGooglePrivacyDlpV2StoredInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredInfoType]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2StoredInfoType](x: Self) {
    
    inline def setCurrentVersion(value: SchemaGooglePrivacyDlpV2StoredInfoTypeVersion): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPendingVersions(value: js.Array[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion]): Self = StObject.set(x, "pendingVersions", value.asInstanceOf[js.Any])
    
    inline def setPendingVersionsUndefined: Self = StObject.set(x, "pendingVersions", js.undefined)
    
    inline def setPendingVersionsVarargs(value: SchemaGooglePrivacyDlpV2StoredInfoTypeVersion*): Self = StObject.set(x, "pendingVersions", js.Array(value*))
  }
}
