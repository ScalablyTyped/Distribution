package typings.googleapis.metastoreV1alphaMod.metastoreV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestore extends StObject {
  
  /**
    * Output only. The relative resource name of the metastore service backup to restore from, in the following form:projects/{project_id\}/locations/{location_id\}/services/{service_id\}/backups/{backup_id\}.
    */
  var backup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The restore details containing the revision of the service to be restored to, in format of JSON.
    */
  var details: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the restore ended.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the restore started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of the restore.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of restore.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestore {
  
  inline def apply(): SchemaRestore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestore]
  }
  
  extension [Self <: SchemaRestore](x: Self) {
    
    inline def setBackup(value: String): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupNull: Self = StObject.set(x, "backup", null)
    
    inline def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
