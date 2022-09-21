package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricStructuredName extends StObject {
  
  /**
    * Zero or more labeled fields which identify the part of the job this metric is associated with, such as the name of a step or collection. For example, built-in counters associated with steps will have context['step'] = . Counters associated with PCollections in the SDK will have context['pcollection'] = .
    */
  var context: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Worker-defined metric name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Origin (namespace) of metric name. May be blank for user-define metrics; will be "dataflow" for metrics defined by the Dataflow service or SDK.
    */
  var origin: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetricStructuredName {
  
  inline def apply(): SchemaMetricStructuredName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricStructuredName]
  }
  
  extension [Self <: SchemaMetricStructuredName](x: Self) {
    
    inline def setContext(value: StringDictionary[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginNull: Self = StObject.set(x, "origin", null)
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
