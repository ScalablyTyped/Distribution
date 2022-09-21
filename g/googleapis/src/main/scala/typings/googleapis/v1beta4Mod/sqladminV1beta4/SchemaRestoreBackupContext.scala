package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestoreBackupContext extends StObject {
  
  /**
    * The ID of the backup run to restore from.
    */
  var backupRunId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the instance that the backup was taken from.
    */
  var instanceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always `sql#restoreBackupContext`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full project ID of the source instance.
    */
  var project: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestoreBackupContext {
  
  inline def apply(): SchemaRestoreBackupContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestoreBackupContext]
  }
  
  extension [Self <: SchemaRestoreBackupContext](x: Self) {
    
    inline def setBackupRunId(value: String): Self = StObject.set(x, "backupRunId", value.asInstanceOf[js.Any])
    
    inline def setBackupRunIdNull: Self = StObject.set(x, "backupRunId", null)
    
    inline def setBackupRunIdUndefined: Self = StObject.set(x, "backupRunId", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdNull: Self = StObject.set(x, "instanceId", null)
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
