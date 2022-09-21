package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperation extends StObject {
  
  /**
    * The context for backup operation, if applicable.
    */
  var backupContext: js.UndefOr[SchemaBackupContext] = js.undefined
  
  /**
    * The time this operation finished in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If errors occurred during processing of this operation, this field will be populated.
    */
  var error: js.UndefOr[SchemaOperationErrors] = js.undefined
  
  /**
    * The context for export operation, if applicable.
    */
  var exportContext: js.UndefOr[SchemaExportContext] = js.undefined
  
  /**
    * The context for import operation, if applicable.
    */
  var importContext: js.UndefOr[SchemaImportContext] = js.undefined
  
  /**
    * The time this operation was enqueued in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
    */
  var insertTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always `sql#operation`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An identifier that uniquely identifies the operation. You can use this identifier to retrieve the Operations resource that has information about the operation.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the operation. Valid values are: * `CREATE` * `DELETE` * `UPDATE` * `RESTART` * `IMPORT` * `EXPORT` * `BACKUP_VOLUME` * `RESTORE_VOLUME` * `CREATE_USER` * `DELETE_USER` * `CREATE_DATABASE` * `DELETE_DATABASE`
    */
  var operationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI of this resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time this operation actually started in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of an operation.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the database instance related to this operation.
    */
  var targetId: js.UndefOr[String | Null] = js.undefined
  
  var targetLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The project ID of the target instance related to this operation.
    */
  var targetProject: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address of the user who initiated this operation.
    */
  var user: js.UndefOr[String | Null] = js.undefined
}
object SchemaOperation {
  
  inline def apply(): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperation]
  }
  
  extension [Self <: SchemaOperation](x: Self) {
    
    inline def setBackupContext(value: SchemaBackupContext): Self = StObject.set(x, "backupContext", value.asInstanceOf[js.Any])
    
    inline def setBackupContextUndefined: Self = StObject.set(x, "backupContext", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setError(value: SchemaOperationErrors): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExportContext(value: SchemaExportContext): Self = StObject.set(x, "exportContext", value.asInstanceOf[js.Any])
    
    inline def setExportContextUndefined: Self = StObject.set(x, "exportContext", js.undefined)
    
    inline def setImportContext(value: SchemaImportContext): Self = StObject.set(x, "importContext", value.asInstanceOf[js.Any])
    
    inline def setImportContextUndefined: Self = StObject.set(x, "importContext", js.undefined)
    
    inline def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    inline def setInsertTimeNull: Self = StObject.set(x, "insertTime", null)
    
    inline def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeNull: Self = StObject.set(x, "operationType", null)
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdNull: Self = StObject.set(x, "targetId", null)
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    inline def setTargetLink(value: String): Self = StObject.set(x, "targetLink", value.asInstanceOf[js.Any])
    
    inline def setTargetLinkNull: Self = StObject.set(x, "targetLink", null)
    
    inline def setTargetLinkUndefined: Self = StObject.set(x, "targetLink", js.undefined)
    
    inline def setTargetProject(value: String): Self = StObject.set(x, "targetProject", value.asInstanceOf[js.Any])
    
    inline def setTargetProjectNull: Self = StObject.set(x, "targetProject", null)
    
    inline def setTargetProjectUndefined: Self = StObject.set(x, "targetProject", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
