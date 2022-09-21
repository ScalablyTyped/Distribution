package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackupContext extends StObject {
  
  /**
    * The identifier of the backup.
    */
  var backupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always `sql#backupContext`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackupContext {
  
  inline def apply(): SchemaBackupContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackupContext]
  }
  
  extension [Self <: SchemaBackupContext](x: Self) {
    
    inline def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdNull: Self = StObject.set(x, "backupId", null)
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "backupId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
