package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource representing a collection of performance samples (or data points)
  */
trait SchemaPerfSampleSeries extends StObject {
  
  /**
    * Basic series represented by a line chart
    */
  var basicPerfSampleSeries: js.UndefOr[SchemaBasicPerfSampleSeries] = js.undefined
  
  /**
    * A tool results execution ID.
    */
  var executionId: js.UndefOr[String] = js.undefined
  
  /**
    * A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.undefined
  
  /**
    * The cloud project
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * A sample series id
    */
  var sampleSeriesId: js.UndefOr[String] = js.undefined
  
  /**
    * A tool results step ID.
    */
  var stepId: js.UndefOr[String] = js.undefined
}
object SchemaPerfSampleSeries {
  
  @scala.inline
  def apply(): SchemaPerfSampleSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerfSampleSeries]
  }
  
  @scala.inline
  implicit class SchemaPerfSampleSeriesMutableBuilder[Self <: SchemaPerfSampleSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicPerfSampleSeries(value: SchemaBasicPerfSampleSeries): Self = StObject.set(x, "basicPerfSampleSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicPerfSampleSeriesUndefined: Self = StObject.set(x, "basicPerfSampleSeries", js.undefined)
    
    @scala.inline
    def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSampleSeriesId(value: String): Self = StObject.set(x, "sampleSeriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleSeriesIdUndefined: Self = StObject.set(x, "sampleSeriesId", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
