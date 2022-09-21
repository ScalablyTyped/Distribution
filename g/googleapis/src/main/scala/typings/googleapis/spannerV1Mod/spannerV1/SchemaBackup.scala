package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackup extends StObject {
  
  /**
    * Output only. The time the CreateBackup request is received. If the request does not specify `version_time`, the `version_time` of the backup will be equivalent to the `create_time`.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required for the CreateBackup operation. Name of the database from which this backup was created. This needs to be in the same instance as the backup. Values are of the form `projects//instances//databases/`.
    */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The database dialect information for the backup.
    */
  var databaseDialect: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The encryption information for the backup.
    */
  var encryptionInfo: js.UndefOr[SchemaEncryptionInfo] = js.undefined
  
  /**
    * Required for the CreateBackup operation. The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 366 days from the time the CreateBackup request is processed. Once the `expire_time` has passed, the backup is eligible to be automatically deleted by Cloud Spanner to free the resources used by the backup.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The max allowed expiration time of the backup, with microseconds granularity. A backup's expiration time can be configured in multiple APIs: CreateBackup, UpdateBackup, CopyBackup. When updating or copying an existing backup, the expiration time specified must be less than `Backup.max_expire_time`.
    */
  var maxExpireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only for the CreateBackup operation. Required for the UpdateBackup operation. A globally unique identifier for the backup which cannot be changed. Values are of the form `projects//instances//backups/a-z*[a-z0-9]` The final segment of the name must be between 2 and 60 characters in length. The backup is stored in the location(s) specified in the instance configuration of the instance containing the backup, identified by the prefix of the backup name of the form `projects//instances/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The names of the destination backups being created by copying this source backup. The backup names are of the form `projects//instances//backups/`. Referencing backups may exist in different instances. The existence of any referencing backup prevents the backup from being deleted. When the copy operation is done (either successfully completed or cancelled or the destination backup is deleted), the reference to the backup is removed.
    */
  var referencingBackups: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The names of the restored databases that reference the backup. The database names are of the form `projects//instances//databases/`. Referencing databases may exist in different instances. The existence of any referencing database prevents the backup from being deleted. When a restored database from the backup enters the `READY` state, the reference to the backup is removed.
    */
  var referencingDatabases: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Size of the backup in bytes.
    */
  var sizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of the backup.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The backup will contain an externally consistent copy of the database at the timestamp specified by `version_time`. If `version_time` is not specified, the system will set `version_time` to the `create_time` of the backup.
    */
  var versionTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackup {
  
  inline def apply(): SchemaBackup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackup]
  }
  
  extension [Self <: SchemaBackup](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseDialect(value: String): Self = StObject.set(x, "databaseDialect", value.asInstanceOf[js.Any])
    
    inline def setDatabaseDialectNull: Self = StObject.set(x, "databaseDialect", null)
    
    inline def setDatabaseDialectUndefined: Self = StObject.set(x, "databaseDialect", js.undefined)
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setEncryptionInfo(value: SchemaEncryptionInfo): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setMaxExpireTime(value: String): Self = StObject.set(x, "maxExpireTime", value.asInstanceOf[js.Any])
    
    inline def setMaxExpireTimeNull: Self = StObject.set(x, "maxExpireTime", null)
    
    inline def setMaxExpireTimeUndefined: Self = StObject.set(x, "maxExpireTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferencingBackups(value: js.Array[String]): Self = StObject.set(x, "referencingBackups", value.asInstanceOf[js.Any])
    
    inline def setReferencingBackupsNull: Self = StObject.set(x, "referencingBackups", null)
    
    inline def setReferencingBackupsUndefined: Self = StObject.set(x, "referencingBackups", js.undefined)
    
    inline def setReferencingBackupsVarargs(value: String*): Self = StObject.set(x, "referencingBackups", js.Array(value*))
    
    inline def setReferencingDatabases(value: js.Array[String]): Self = StObject.set(x, "referencingDatabases", value.asInstanceOf[js.Any])
    
    inline def setReferencingDatabasesNull: Self = StObject.set(x, "referencingDatabases", null)
    
    inline def setReferencingDatabasesUndefined: Self = StObject.set(x, "referencingDatabases", js.undefined)
    
    inline def setReferencingDatabasesVarargs(value: String*): Self = StObject.set(x, "referencingDatabases", js.Array(value*))
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesNull: Self = StObject.set(x, "sizeBytes", null)
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVersionTime(value: String): Self = StObject.set(x, "versionTime", value.asInstanceOf[js.Any])
    
    inline def setVersionTimeNull: Self = StObject.set(x, "versionTime", null)
    
    inline def setVersionTimeUndefined: Self = StObject.set(x, "versionTime", js.undefined)
  }
}
