package typings.googleapis.fileV1Mod.fileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFileShareConfig extends StObject {
  
  /**
    * File share capacity in gigabytes (GB). Filestore defines 1 GB as 1024^3 bytes.
    */
  var capacityGb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the file share (must be 16 characters or less).
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Nfs Export Options. There is a limit of 10 export options per file share.
    */
  var nfsExportOptions: js.UndefOr[js.Array[SchemaNfsExportOptions]] = js.undefined
  
  /**
    * The resource name of the backup, in the format `projects/{project_number\}/locations/{location_id\}/backups/{backup_id\}`, that this file share has been restored from.
    */
  var sourceBackup: js.UndefOr[String | Null] = js.undefined
}
object SchemaFileShareConfig {
  
  inline def apply(): SchemaFileShareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileShareConfig]
  }
  
  extension [Self <: SchemaFileShareConfig](x: Self) {
    
    inline def setCapacityGb(value: String): Self = StObject.set(x, "capacityGb", value.asInstanceOf[js.Any])
    
    inline def setCapacityGbNull: Self = StObject.set(x, "capacityGb", null)
    
    inline def setCapacityGbUndefined: Self = StObject.set(x, "capacityGb", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNfsExportOptions(value: js.Array[SchemaNfsExportOptions]): Self = StObject.set(x, "nfsExportOptions", value.asInstanceOf[js.Any])
    
    inline def setNfsExportOptionsUndefined: Self = StObject.set(x, "nfsExportOptions", js.undefined)
    
    inline def setNfsExportOptionsVarargs(value: SchemaNfsExportOptions*): Self = StObject.set(x, "nfsExportOptions", js.Array(value*))
    
    inline def setSourceBackup(value: String): Self = StObject.set(x, "sourceBackup", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupNull: Self = StObject.set(x, "sourceBackup", null)
    
    inline def setSourceBackupUndefined: Self = StObject.set(x, "sourceBackup", js.undefined)
  }
}
