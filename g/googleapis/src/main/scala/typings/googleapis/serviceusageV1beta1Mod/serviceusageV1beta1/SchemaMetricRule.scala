package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Bind API methods to metrics. Binding a method to a metric causes that
  * metric&#39;s configured quota behaviors to apply to the method call.
  */
@js.native
trait SchemaMetricRule extends StObject {
  
  /**
    * Metrics to update when the selected methods are called, and the
    * associated cost applied to each metric.  The key of the map is the metric
    * name, and the values are the amount increased for the metric against
    * which the quota limits are defined. The value must not be negative.
    */
  var metricCosts: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Selects the methods to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}
object SchemaMetricRule {
  
  @scala.inline
  def apply(): SchemaMetricRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricRule]
  }
  
  @scala.inline
  implicit class SchemaMetricRuleMutableBuilder[Self <: SchemaMetricRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricCosts(value: StringDictionary[String]): Self = StObject.set(x, "metricCosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricCostsUndefined: Self = StObject.set(x, "metricCosts", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
