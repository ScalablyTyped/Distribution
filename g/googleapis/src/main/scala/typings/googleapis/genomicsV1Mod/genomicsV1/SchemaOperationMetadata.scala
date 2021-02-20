package typings.googleapis.genomicsV1Mod.genomicsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata describing an Operation.
  */
@js.native
trait SchemaOperationMetadata extends StObject {
  
  /**
    * This field is deprecated. Use `labels` instead. Optionally provided by
    * the caller when submitting the request that creates the operation.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * The time at which the job was submitted to the Genomics service.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The time at which the job stopped running.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Optional event messages that were generated during the job&#39;s
    * execution. This also contains any warnings that were generated during
    * import or export.
    */
  var events: js.UndefOr[js.Array[SchemaOperationEvent]] = js.native
  
  /**
    * Optionally provided by the caller when submitting the request that
    * creates the operation.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The Google Cloud Project in which the job is scoped.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * The original request that started the operation. Note that this will be
    * in current version of the API. If the operation was started with v1beta2
    * API and a GetOperation is performed on v1 API, a v1 request will be
    * returned.
    */
  var request: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Runtime metadata on this Operation.
    */
  var runtimeMetadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * The time at which the job began to run.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaOperationMetadata {
  
  @scala.inline
  def apply(): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaOperationMetadataMutableBuilder[Self <: SchemaOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[SchemaOperationEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: SchemaOperationEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRequest(value: StringDictionary[js.Any]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setRuntimeMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "runtimeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeMetadataUndefined: Self = StObject.set(x, "runtimeMetadata", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
