package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata describing an Operation.
  */
@js.native
trait SchemaOperationMetadata extends js.Object {
  
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
  implicit class SchemaOperationMetadataOps[Self <: SchemaOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: SchemaOperationEvent*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[SchemaOperationEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setRequest(value: StringDictionary[js.Any]): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setRuntimeMetadata(value: StringDictionary[js.Any]): Self = this.set("runtimeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeMetadata: Self = this.set("runtimeMetadata", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
