package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies a metric, by describing the source which generated the metric.
  */
trait SchemaMetricStructuredName extends StObject {
  
  /**
    * Zero or more labeled fields which identify the part of the job this
    * metric is associated with, such as the name of a step or collection.  For
    * example, built-in counters associated with steps will have
    * context[&#39;step&#39;] = &lt;step-name&gt;. Counters associated with
    * PCollections in the SDK will have context[&#39;pcollection&#39;] =
    * &lt;pcollection-name&gt;.
    */
  var context: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Worker-defined metric name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Origin (namespace) of metric name. May be blank for user-define metrics;
    * will be &quot;dataflow&quot; for metrics defined by the Dataflow service
    * or SDK.
    */
  var origin: js.UndefOr[String] = js.undefined
}
object SchemaMetricStructuredName {
  
  @scala.inline
  def apply(): SchemaMetricStructuredName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricStructuredName]
  }
  
  @scala.inline
  implicit class SchemaMetricStructuredNameMutableBuilder[Self <: SchemaMetricStructuredName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: StringDictionary[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
