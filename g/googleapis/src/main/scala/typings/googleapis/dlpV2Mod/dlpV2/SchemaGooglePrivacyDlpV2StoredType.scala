package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2StoredType extends StObject {
  
  /**
    * Timestamp indicating when the version of the `StoredInfoType` used for inspection was created. Output-only field, populated by the system.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of the requested `StoredInfoType`, for example `organizations/433245324/storedInfoTypes/432452342` or `projects/project-id/storedInfoTypes/432452342`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2StoredType {
  
  inline def apply(): SchemaGooglePrivacyDlpV2StoredType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredType]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2StoredType](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
