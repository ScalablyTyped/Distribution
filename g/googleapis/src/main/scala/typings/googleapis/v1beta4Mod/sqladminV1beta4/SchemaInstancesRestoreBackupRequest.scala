package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance restore backup request.
  */
trait SchemaInstancesRestoreBackupRequest extends StObject {
  
  /**
    * Parameters required to perform the restore backup operation.
    */
  var restoreBackupContext: js.UndefOr[SchemaRestoreBackupContext] = js.undefined
}
object SchemaInstancesRestoreBackupRequest {
  
  @scala.inline
  def apply(): SchemaInstancesRestoreBackupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesRestoreBackupRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesRestoreBackupRequestMutableBuilder[Self <: SchemaInstancesRestoreBackupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestoreBackupContext(value: SchemaRestoreBackupContext): Self = StObject.set(x, "restoreBackupContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreBackupContextUndefined: Self = StObject.set(x, "restoreBackupContext", js.undefined)
  }
}
