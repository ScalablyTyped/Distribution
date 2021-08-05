package typings.googleapis.genomicsV1Mod.genomicsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata describing an Operation.
  */
trait SchemaOperationMetadata extends StObject {
  
  /**
    * This field is deprecated. Use `labels` instead. Optionally provided by
    * the caller when submitting the request that creates the operation.
    */
  var clientId: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the job was submitted to the Genomics service.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the job stopped running.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional event messages that were generated during the job&#39;s
    * execution. This also contains any warnings that were generated during
    * import or export.
    */
  var events: js.UndefOr[js.Array[SchemaOperationEvent]] = js.undefined
  
  /**
    * Optionally provided by the caller when submitting the request that
    * creates the operation.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The Google Cloud Project in which the job is scoped.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * The original request that started the operation. Note that this will be
    * in current version of the API. If the operation was started with v1beta2
    * API and a GetOperation is performed on v1 API, a v1 request will be
    * returned.
    */
  var request: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Runtime metadata on this Operation.
    */
  var runtimeMetadata: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The time at which the job began to run.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaOperationMetadata {
  
  inline def apply(): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
  
  extension [Self <: SchemaOperationMetadata](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEvents(value: js.Array[SchemaOperationEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: SchemaOperationEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRequest(value: StringDictionary[js.Any]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRuntimeMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "runtimeMetadata", value.asInstanceOf[js.Any])
    
    inline def setRuntimeMetadataUndefined: Self = StObject.set(x, "runtimeMetadata", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
