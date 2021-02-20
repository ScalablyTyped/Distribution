package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Carries information about the pipeline execution that is returned in the
  * long running operation&#39;s metadata field.
  */
@js.native
trait SchemaMetadata extends StObject {
  
  /**
    * The time at which the operation was created by the API.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The time at which execution was completed and resources were cleaned up.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * The list of events that have happened so far during the execution of this
    * operation.
    */
  var events: js.UndefOr[js.Array[SchemaEvent]] = js.native
  
  /**
    * The user-defined labels associated with this operation.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The pipeline this operation represents.
    */
  var pipeline: js.UndefOr[SchemaPipeline] = js.native
  
  /**
    * The first time at which resources were allocated to execute the pipeline.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaMetadata {
  
  @scala.inline
  def apply(): SchemaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadata]
  }
  
  @scala.inline
  implicit class SchemaMetadataMutableBuilder[Self <: SchemaMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[SchemaEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: SchemaEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setPipeline(value: SchemaPipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
