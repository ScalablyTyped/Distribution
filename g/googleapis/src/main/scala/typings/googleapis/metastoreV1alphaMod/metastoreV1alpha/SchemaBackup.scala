package typings.googleapis.metastoreV1alphaMod.metastoreV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackup extends StObject {
  
  /**
    * Output only. The time when the backup was started.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The description of the backup.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the backup finished creating.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The relative resource name of the backup, in the following form:projects/{project_number\}/locations/{location_id\}/services/{service_id\}/backups/{backup_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Services that are restoring from the backup.
    */
  var restoringServices: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The revision of the service at the time of backup.
    */
  var serviceRevision: js.UndefOr[SchemaService] = js.undefined
  
  /**
    * Output only. The current state of the backup.
    */
  var state: js.UndefOr[String | Null] = js.undefined
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
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRestoringServices(value: js.Array[String]): Self = StObject.set(x, "restoringServices", value.asInstanceOf[js.Any])
    
    inline def setRestoringServicesNull: Self = StObject.set(x, "restoringServices", null)
    
    inline def setRestoringServicesUndefined: Self = StObject.set(x, "restoringServices", js.undefined)
    
    inline def setRestoringServicesVarargs(value: String*): Self = StObject.set(x, "restoringServices", js.Array(value*))
    
    inline def setServiceRevision(value: SchemaService): Self = StObject.set(x, "serviceRevision", value.asInstanceOf[js.Any])
    
    inline def setServiceRevisionUndefined: Self = StObject.set(x, "serviceRevision", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
