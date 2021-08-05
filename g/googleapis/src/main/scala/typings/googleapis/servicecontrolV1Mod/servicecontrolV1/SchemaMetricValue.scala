package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single metric value.
  */
trait SchemaMetricValue extends StObject {
  
  /**
    * A boolean value.
    */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A distribution value.
    */
  var distributionValue: js.UndefOr[SchemaDistribution] = js.undefined
  
  /**
    * A double precision floating point value.
    */
  var doubleValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The end of the time period over which this metric value&#39;s measurement
    * applies.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * A signed 64-bit integer value.
    */
  var int64Value: js.UndefOr[String] = js.undefined
  
  /**
    * The labels describing the metric value. See comments on
    * google.api.servicecontrol.v1.Operation.labels for the overriding
    * relationship.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * A money value.
    */
  var moneyValue: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * The start of the time period over which this metric value&#39;s
    * measurement applies. The time period has different semantics for
    * different metric types (cumulative, delta, and gauge). See the metric
    * definition documentation in the service configuration for details.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * A text string value.
    */
  var stringValue: js.UndefOr[String] = js.undefined
}
object SchemaMetricValue {
  
  inline def apply(): SchemaMetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricValue]
  }
  
  extension [Self <: SchemaMetricValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setDistributionValue(value: SchemaDistribution): Self = StObject.set(x, "distributionValue", value.asInstanceOf[js.Any])
    
    inline def setDistributionValueUndefined: Self = StObject.set(x, "distributionValue", js.undefined)
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setInt64Value(value: String): Self = StObject.set(x, "int64Value", value.asInstanceOf[js.Any])
    
    inline def setInt64ValueUndefined: Self = StObject.set(x, "int64Value", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMoneyValue(value: SchemaMoney): Self = StObject.set(x, "moneyValue", value.asInstanceOf[js.Any])
    
    inline def setMoneyValueUndefined: Self = StObject.set(x, "moneyValue", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
