package typings.googleapis.fileV1beta1Mod.fileV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackup extends StObject {
  
  /**
    * Output only. Capacity of the source file share when the backup was created.
    */
  var capacityGb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the backup was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Amount of bytes that will be downloaded if the backup is restored
    */
  var downloadBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. KMS key name used for data encryption.
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource labels to represent user provided metadata.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The resource name of the backup, in the format `projects/{project_id\}/locations/{location_id\}/backups/{backup_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Reserved for future use.
    */
  var satisfiesPzs: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Name of the file share in the source Filestore instance that the backup is created from.
    */
  var sourceFileShare: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the source Filestore instance, in the format `projects/{project_id\}/locations/{location_id\}/instances/{instance_id\}`, used to create this backup.
    */
  var sourceInstance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The service tier of the source Filestore instance that this backup is created from.
    */
  var sourceInstanceTier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The backup state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
    */
  var storageBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackup {
  
  inline def apply(): SchemaBackup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackup]
  }
  
  extension [Self <: SchemaBackup](x: Self) {
    
    inline def setCapacityGb(value: String): Self = StObject.set(x, "capacityGb", value.asInstanceOf[js.Any])
    
    inline def setCapacityGbNull: Self = StObject.set(x, "capacityGb", null)
    
    inline def setCapacityGbUndefined: Self = StObject.set(x, "capacityGb", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDownloadBytes(value: String): Self = StObject.set(x, "downloadBytes", value.asInstanceOf[js.Any])
    
    inline def setDownloadBytesNull: Self = StObject.set(x, "downloadBytes", null)
    
    inline def setDownloadBytesUndefined: Self = StObject.set(x, "downloadBytes", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSatisfiesPzs(value: Boolean): Self = StObject.set(x, "satisfiesPzs", value.asInstanceOf[js.Any])
    
    inline def setSatisfiesPzsNull: Self = StObject.set(x, "satisfiesPzs", null)
    
    inline def setSatisfiesPzsUndefined: Self = StObject.set(x, "satisfiesPzs", js.undefined)
    
    inline def setSourceFileShare(value: String): Self = StObject.set(x, "sourceFileShare", value.asInstanceOf[js.Any])
    
    inline def setSourceFileShareNull: Self = StObject.set(x, "sourceFileShare", null)
    
    inline def setSourceFileShareUndefined: Self = StObject.set(x, "sourceFileShare", js.undefined)
    
    inline def setSourceInstance(value: String): Self = StObject.set(x, "sourceInstance", value.asInstanceOf[js.Any])
    
    inline def setSourceInstanceNull: Self = StObject.set(x, "sourceInstance", null)
    
    inline def setSourceInstanceTier(value: String): Self = StObject.set(x, "sourceInstanceTier", value.asInstanceOf[js.Any])
    
    inline def setSourceInstanceTierNull: Self = StObject.set(x, "sourceInstanceTier", null)
    
    inline def setSourceInstanceTierUndefined: Self = StObject.set(x, "sourceInstanceTier", js.undefined)
    
    inline def setSourceInstanceUndefined: Self = StObject.set(x, "sourceInstance", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStorageBytes(value: String): Self = StObject.set(x, "storageBytes", value.asInstanceOf[js.Any])
    
    inline def setStorageBytesNull: Self = StObject.set(x, "storageBytes", null)
    
    inline def setStorageBytesUndefined: Self = StObject.set(x, "storageBytes", js.undefined)
  }
}
