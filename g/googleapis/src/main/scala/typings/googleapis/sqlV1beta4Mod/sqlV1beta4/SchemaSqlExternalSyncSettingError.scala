package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSqlExternalSyncSettingError extends StObject {
  
  /**
    * Additional information about the error encountered.
    */
  var detail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always *sql#migrationSettingError*.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the specific error that occurred.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSqlExternalSyncSettingError {
  
  inline def apply(): SchemaSqlExternalSyncSettingError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlExternalSyncSettingError]
  }
  
  extension [Self <: SchemaSqlExternalSyncSettingError](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailNull: Self = StObject.set(x, "detail", null)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
