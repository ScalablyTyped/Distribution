package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metric extends StObject {
  
  /** For metrics with floating point value. */
  var doubleValue: js.UndefOr[Double] = js.native
  
  /** For metrics with integer value. */
  var intValue: js.UndefOr[String] = js.native
  
  /** Required. Metric name, e.g., "nodes total", "percent done". */
  var name: js.UndefOr[String] = js.native
  
  /** For metrics with custom values (ratios, visual progress, etc.). */
  var stringValue: js.UndefOr[String] = js.native
}
object Metric {
  
  @scala.inline
  def apply(): Metric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metric]
  }
  
  @scala.inline
  implicit class MetricMutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
    
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
