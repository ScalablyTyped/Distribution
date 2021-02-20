package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance restore from backup context.
  */
@js.native
trait SchemaRestoreBackupContext extends StObject {
  
  /**
    * The ID of the backup run to restore from.
    */
  var backupRunId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the instance that the backup was taken from.
    */
  var instanceId: js.UndefOr[String] = js.native
  
  /**
    * This is always sql#restoreBackupContext.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaRestoreBackupContext {
  
  @scala.inline
  def apply(): SchemaRestoreBackupContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestoreBackupContext]
  }
  
  @scala.inline
  implicit class SchemaRestoreBackupContextMutableBuilder[Self <: SchemaRestoreBackupContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupRunId(value: String): Self = StObject.set(x, "backupRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRunIdUndefined: Self = StObject.set(x, "backupRunId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
