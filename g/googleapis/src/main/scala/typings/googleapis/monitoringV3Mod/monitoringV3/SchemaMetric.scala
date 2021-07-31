package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A specific metric, identified by specifying values for all of the labels of
  * a MetricDescriptor.
  */
trait SchemaMetric extends StObject {
  
  /**
    * The set of label values that uniquely identify this metric. All labels
    * listed in the MetricDescriptor must be assigned values.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * An existing metric type, see google.api.MetricDescriptor. For example,
    * custom.googleapis.com/invoice/paid/amount.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaMetric {
  
  @scala.inline
  def apply(): SchemaMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetric]
  }
  
  @scala.inline
  implicit class SchemaMetricMutableBuilder[Self <: SchemaMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
