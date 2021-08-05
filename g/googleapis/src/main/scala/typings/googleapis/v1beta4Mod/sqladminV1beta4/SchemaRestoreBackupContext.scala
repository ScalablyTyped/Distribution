package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance restore from backup context.
  */
trait SchemaRestoreBackupContext extends StObject {
  
  /**
    * The ID of the backup run to restore from.
    */
  var backupRunId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance that the backup was taken from.
    */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /**
    * This is always sql#restoreBackupContext.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaRestoreBackupContext {
  
  inline def apply(): SchemaRestoreBackupContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestoreBackupContext]
  }
  
  extension [Self <: SchemaRestoreBackupContext](x: Self) {
    
    inline def setBackupRunId(value: String): Self = StObject.set(x, "backupRunId", value.asInstanceOf[js.Any])
    
    inline def setBackupRunIdUndefined: Self = StObject.set(x, "backupRunId", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
