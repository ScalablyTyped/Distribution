package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperationMetadata extends StObject {
  
  /**
    * This field is deprecated. Use `labels` instead. Optionally provided by the caller when submitting the request that creates the operation.
    */
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the job was submitted to the Genomics service.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the job stopped running.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional event messages that were generated during the job's execution. This also contains any warnings that were generated during import or export.
    */
  var events: js.UndefOr[js.Array[SchemaOperationEvent]] = js.undefined
  
  /**
    * Optionally provided by the caller when submitting the request that creates the operation.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The Google Cloud Project in which the job is scoped.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The original request that started the operation. Note that this will be in current version of the API. If the operation was started with v1beta2 API and a GetOperation is performed on v1 API, a v1 request will be returned.
    */
  var request: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Runtime metadata on this Operation.
    */
  var runtimeMetadata: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The time at which the job began to run.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaOperationMetadata {
  
  inline def apply(): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
  
  extension [Self <: SchemaOperationMetadata](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEvents(value: js.Array[SchemaOperationEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: SchemaOperationEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRequest(value: StringDictionary[Any]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestNull: Self = StObject.set(x, "request", null)
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRuntimeMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "runtimeMetadata", value.asInstanceOf[js.Any])
    
    inline def setRuntimeMetadataNull: Self = StObject.set(x, "runtimeMetadata", null)
    
    inline def setRuntimeMetadataUndefined: Self = StObject.set(x, "runtimeMetadata", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
