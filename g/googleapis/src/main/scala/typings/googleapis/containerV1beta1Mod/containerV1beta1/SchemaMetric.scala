package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Progress metric is (string, int|float|string) pair.
  */
@js.native
trait SchemaMetric extends StObject {
  
  /**
    * For metrics with floating point value.
    */
  var doubleValue: js.UndefOr[Double] = js.native
  
  /**
    * For metrics with integer value.
    */
  var intValue: js.UndefOr[String] = js.native
  
  /**
    * Metric name, required. e.g., &quot;nodes total&quot;, &quot;percent
    * done&quot;
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * For metrics with custom values (ratios, visual progress, etc.).
    */
  var stringValue: js.UndefOr[String] = js.native
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
    def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    @scala.inline
    def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
