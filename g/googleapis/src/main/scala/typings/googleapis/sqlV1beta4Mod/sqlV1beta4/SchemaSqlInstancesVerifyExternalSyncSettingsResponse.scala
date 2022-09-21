package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSqlInstancesVerifyExternalSyncSettingsResponse extends StObject {
  
  /**
    * List of migration violations.
    */
  var errors: js.UndefOr[js.Array[SchemaSqlExternalSyncSettingError]] = js.undefined
  
  /**
    * This is always *sql#migrationSettingErrorList*.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaSqlInstancesVerifyExternalSyncSettingsResponse {
  
  inline def apply(): SchemaSqlInstancesVerifyExternalSyncSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlInstancesVerifyExternalSyncSettingsResponse]
  }
  
  extension [Self <: SchemaSqlInstancesVerifyExternalSyncSettingsResponse](x: Self) {
    
    inline def setErrors(value: js.Array[SchemaSqlExternalSyncSettingError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaSqlExternalSyncSettingError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
