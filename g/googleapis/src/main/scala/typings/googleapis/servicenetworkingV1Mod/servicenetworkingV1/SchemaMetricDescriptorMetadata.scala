package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricDescriptorMetadata extends StObject {
  
  /**
    * The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors.
    */
  var ingestDelay: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. Must use the MetricDescriptor.launch_stage instead.
    */
  var launchStage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period.
    */
  var samplePeriod: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetricDescriptorMetadata {
  
  inline def apply(): SchemaMetricDescriptorMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricDescriptorMetadata]
  }
  
  extension [Self <: SchemaMetricDescriptorMetadata](x: Self) {
    
    inline def setIngestDelay(value: String): Self = StObject.set(x, "ingestDelay", value.asInstanceOf[js.Any])
    
    inline def setIngestDelayNull: Self = StObject.set(x, "ingestDelay", null)
    
    inline def setIngestDelayUndefined: Self = StObject.set(x, "ingestDelay", js.undefined)
    
    inline def setLaunchStage(value: String): Self = StObject.set(x, "launchStage", value.asInstanceOf[js.Any])
    
    inline def setLaunchStageNull: Self = StObject.set(x, "launchStage", null)
    
    inline def setLaunchStageUndefined: Self = StObject.set(x, "launchStage", js.undefined)
    
    inline def setSamplePeriod(value: String): Self = StObject.set(x, "samplePeriod", value.asInstanceOf[js.Any])
    
    inline def setSamplePeriodNull: Self = StObject.set(x, "samplePeriod", null)
    
    inline def setSamplePeriodUndefined: Self = StObject.set(x, "samplePeriod", js.undefined)
  }
}
