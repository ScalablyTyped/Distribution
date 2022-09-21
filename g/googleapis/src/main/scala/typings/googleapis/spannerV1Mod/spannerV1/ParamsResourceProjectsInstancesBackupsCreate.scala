package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesBackupsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the backup to be created. The `backup_id` appended to `parent` forms the full backup name of the form `projects//instances//backups/`.
    */
  var backupId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The encryption type of the backup.
    */
  @JSName("encryptionConfig.encryptionType")
  var encryptionConfigDotencryptionType: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The Cloud KMS key that will be used to protect the backup. This field should be set only when encryption_type is `CUSTOMER_MANAGED_ENCRYPTION`. Values are of the form `projects//locations//keyRings//cryptoKeys/`.
    */
  @JSName("encryptionConfig.kmsKeyName")
  var encryptionConfigDotkmsKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the instance in which the backup will be created. This must be the same instance that contains the database the backup will be created from. The backup will be stored in the location(s) specified in the instance configuration of this instance. Values are of the form `projects//instances/`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBackup] = js.undefined
}
object ParamsResourceProjectsInstancesBackupsCreate {
  
  inline def apply(): ParamsResourceProjectsInstancesBackupsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesBackupsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesBackupsCreate](x: Self) {
    
    inline def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "backupId", js.undefined)
    
    inline def setEncryptionConfigDotencryptionType(value: String): Self = StObject.set(x, "encryptionConfig.encryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigDotencryptionTypeUndefined: Self = StObject.set(x, "encryptionConfig.encryptionType", js.undefined)
    
    inline def setEncryptionConfigDotkmsKeyName(value: String): Self = StObject.set(x, "encryptionConfig.kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigDotkmsKeyNameUndefined: Self = StObject.set(x, "encryptionConfig.kmsKeyName", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBackup): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
