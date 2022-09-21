package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesRestoreBackupRequest extends StObject {
  
  /**
    * Parameters required to perform the restore backup operation.
    */
  var restoreBackupContext: js.UndefOr[SchemaRestoreBackupContext] = js.undefined
}
object SchemaInstancesRestoreBackupRequest {
  
  inline def apply(): SchemaInstancesRestoreBackupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesRestoreBackupRequest]
  }
  
  extension [Self <: SchemaInstancesRestoreBackupRequest](x: Self) {
    
    inline def setRestoreBackupContext(value: SchemaRestoreBackupContext): Self = StObject.set(x, "restoreBackupContext", value.asInstanceOf[js.Any])
    
    inline def setRestoreBackupContextUndefined: Self = StObject.set(x, "restoreBackupContext", js.undefined)
  }
}
