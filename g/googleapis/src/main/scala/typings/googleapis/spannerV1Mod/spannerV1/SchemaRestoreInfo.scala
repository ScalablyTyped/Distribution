package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestoreInfo extends StObject {
  
  /**
    * Information about the backup used to restore the database. The backup may no longer exist.
    */
  var backupInfo: js.UndefOr[SchemaBackupInfo] = js.undefined
  
  /**
    * The type of the restore source.
    */
  var sourceType: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestoreInfo {
  
  inline def apply(): SchemaRestoreInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestoreInfo]
  }
  
  extension [Self <: SchemaRestoreInfo](x: Self) {
    
    inline def setBackupInfo(value: SchemaBackupInfo): Self = StObject.set(x, "backupInfo", value.asInstanceOf[js.Any])
    
    inline def setBackupInfoUndefined: Self = StObject.set(x, "backupInfo", js.undefined)
    
    inline def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeNull: Self = StObject.set(x, "sourceType", null)
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
  }
}
