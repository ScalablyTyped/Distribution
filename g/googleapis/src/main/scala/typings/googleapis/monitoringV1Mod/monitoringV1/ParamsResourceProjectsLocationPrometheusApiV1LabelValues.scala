package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationPrometheusApiV1LabelValues
  extends StObject
     with StandardParameters {
  
  /**
    * The end time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted timestamp.
    */
  var end: js.UndefOr[String] = js.undefined
  
  /**
    * The label name for which values are queried.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Location of the resource information. Has to be "global" now.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * A list of matchers encoded in the Prometheus label matcher format to constrain the values to series that satisfy them.
    */
  var `match`: js.UndefOr[String] = js.undefined
  
  /**
    * The workspace on which to execute the request. It is not part of the open source API but used as a request path prefix to distinguish different virtual Prometheus instances of Google Prometheus Engine. The format is: projects/PROJECT_ID_OR_NUMBER.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The start time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted timestamp.
    */
  var start: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationPrometheusApiV1LabelValues {
  
  inline def apply(): ParamsResourceProjectsLocationPrometheusApiV1LabelValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationPrometheusApiV1LabelValues]
  }
  
  extension [Self <: ParamsResourceProjectsLocationPrometheusApiV1LabelValues](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
