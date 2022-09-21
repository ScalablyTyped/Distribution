package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricStructuredName extends StObject {
  
  /**
    * Zero or more labeled fields which identify the part of the job this metric is associated with, such as the name of a step or collection. For example, built-in counters associated
    * with steps will have context['step'] = . Counters associated with PCollections in the SDK will have context['pcollection'] = .
    */
  var context: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.MetricStructuredName & TopLevel[Any]
  ] = js.undefined
  
  /** Worker-defined metric name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Origin (namespace) of metric name. May be blank for user-define metrics; will be "dataflow" for metrics defined by the Dataflow service or SDK. */
  var origin: js.UndefOr[String] = js.undefined
}
object MetricStructuredName {
  
  inline def apply(): MetricStructuredName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricStructuredName]
  }
  
  extension [Self <: MetricStructuredName](x: Self) {
    
    inline def setContext(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.MetricStructuredName & TopLevel[Any]
    ): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
