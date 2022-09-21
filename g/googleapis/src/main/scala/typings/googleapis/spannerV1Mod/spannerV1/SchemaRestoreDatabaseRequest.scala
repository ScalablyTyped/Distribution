package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestoreDatabaseRequest extends StObject {
  
  /**
    * Name of the backup from which to restore. Values are of the form `projects//instances//backups/`.
    */
  var backup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The id of the database to create and restore to. This database must not already exist. The `database_id` appended to `parent` forms the full database name of the form `projects//instances//databases/`.
    */
  var databaseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. An encryption configuration describing the encryption type and key resources in Cloud KMS used to encrypt/decrypt the database to restore to. If this field is not specified, the restored database will use the same encryption configuration as the backup by default, namely encryption_type = `USE_CONFIG_DEFAULT_OR_BACKUP_ENCRYPTION`.
    */
  var encryptionConfig: js.UndefOr[SchemaRestoreDatabaseEncryptionConfig] = js.undefined
}
object SchemaRestoreDatabaseRequest {
  
  inline def apply(): SchemaRestoreDatabaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestoreDatabaseRequest]
  }
  
  extension [Self <: SchemaRestoreDatabaseRequest](x: Self) {
    
    inline def setBackup(value: String): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupNull: Self = StObject.set(x, "backup", null)
    
    inline def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdNull: Self = StObject.set(x, "databaseId", null)
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
    inline def setEncryptionConfig(value: SchemaRestoreDatabaseEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
  }
}
