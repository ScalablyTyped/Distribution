package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackupRetentionSettings extends StObject {
  
  /**
    * Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit is 'COUNT', we will retain this many backups.
    */
  var retainedBackups: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The unit that 'retained_backups' represents.
    */
  var retentionUnit: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackupRetentionSettings {
  
  inline def apply(): SchemaBackupRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackupRetentionSettings]
  }
  
  extension [Self <: SchemaBackupRetentionSettings](x: Self) {
    
    inline def setRetainedBackups(value: Double): Self = StObject.set(x, "retainedBackups", value.asInstanceOf[js.Any])
    
    inline def setRetainedBackupsNull: Self = StObject.set(x, "retainedBackups", null)
    
    inline def setRetainedBackupsUndefined: Self = StObject.set(x, "retainedBackups", js.undefined)
    
    inline def setRetentionUnit(value: String): Self = StObject.set(x, "retentionUnit", value.asInstanceOf[js.Any])
    
    inline def setRetentionUnitNull: Self = StObject.set(x, "retentionUnit", null)
    
    inline def setRetentionUnitUndefined: Self = StObject.set(x, "retentionUnit", js.undefined)
  }
}
