package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationPrometheusApiV1QueryRange
  extends StObject
     with StandardParameters {
  
  /**
    * Location of the resource information. Has to be "global" now.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The project on which to execute the request. Data associcated with the project's workspace stored under the The format is: projects/PROJECT_ID_OR_NUMBER. Open source API but used as a request path prefix to distinguish different virtual Prometheus instances of Google Prometheus Engine.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaQueryRangeRequest] = js.undefined
}
object ParamsResourceProjectsLocationPrometheusApiV1QueryRange {
  
  inline def apply(): ParamsResourceProjectsLocationPrometheusApiV1QueryRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationPrometheusApiV1QueryRange]
  }
  
  extension [Self <: ParamsResourceProjectsLocationPrometheusApiV1QueryRange](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaQueryRangeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
