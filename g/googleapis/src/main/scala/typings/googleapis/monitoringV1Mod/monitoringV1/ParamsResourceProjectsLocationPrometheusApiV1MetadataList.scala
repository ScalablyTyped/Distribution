package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationPrometheusApiV1MetadataList
  extends StObject
     with StandardParameters {
  
  /**
    * Maximum number of metrics to return.
    */
  var limit: js.UndefOr[String] = js.undefined
  
  /**
    * Location of the resource information. Has to be "global" for now.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The metric name for which to query metadata. If unset, all metric metadata is returned.
    */
  var metric: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The workspace on which to execute the request. It is not part of the open source API but used as a request path prefix to distinguish different virtual Prometheus instances of Google Prometheus Engine. The format is: projects/PROJECT_ID_OR_NUMBER.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationPrometheusApiV1MetadataList {
  
  inline def apply(): ParamsResourceProjectsLocationPrometheusApiV1MetadataList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationPrometheusApiV1MetadataList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationPrometheusApiV1MetadataList](x: Self) {
    
    inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
