package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional annotations that can be used to guide the usage of a metric.
  */
trait SchemaMetricDescriptorMetadata extends StObject {
  
  /**
    * The delay of data points caused by ingestion. Data points older than this
    * age are guaranteed to be ingested and available to be read, excluding
    * data loss due to errors.
    */
  var ingestDelay: js.UndefOr[String] = js.undefined
  
  /**
    * The launch stage of the metric definition.
    */
  var launchStage: js.UndefOr[String] = js.undefined
  
  /**
    * The sampling period of metric data points. For metrics which are written
    * periodically, consecutive data points are stored at this time interval,
    * excluding data loss due to errors. Metrics with a higher granularity have
    * a smaller sampling period.
    */
  var samplePeriod: js.UndefOr[String] = js.undefined
}
object SchemaMetricDescriptorMetadata {
  
  @scala.inline
  def apply(): SchemaMetricDescriptorMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricDescriptorMetadata]
  }
  
  @scala.inline
  implicit class SchemaMetricDescriptorMetadataMutableBuilder[Self <: SchemaMetricDescriptorMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIngestDelay(value: String): Self = StObject.set(x, "ingestDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestDelayUndefined: Self = StObject.set(x, "ingestDelay", js.undefined)
    
    @scala.inline
    def setLaunchStage(value: String): Self = StObject.set(x, "launchStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchStageUndefined: Self = StObject.set(x, "launchStage", js.undefined)
    
    @scala.inline
    def setSamplePeriod(value: String): Self = StObject.set(x, "samplePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplePeriodUndefined: Self = StObject.set(x, "samplePeriod", js.undefined)
  }
}
