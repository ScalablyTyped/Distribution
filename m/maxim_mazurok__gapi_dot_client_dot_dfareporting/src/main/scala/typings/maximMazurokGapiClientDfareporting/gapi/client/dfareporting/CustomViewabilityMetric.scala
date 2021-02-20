package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomViewabilityMetric extends StObject {
  
  /** Configuration of the custom viewability metric. */
  var configuration: js.UndefOr[CustomViewabilityMetricConfiguration] = js.native
  
  /** ID of the custom viewability metric. */
  var id: js.UndefOr[String] = js.native
  
  /** Name of the custom viewability metric. */
  var name: js.UndefOr[String] = js.native
}
object CustomViewabilityMetric {
  
  @scala.inline
  def apply(): CustomViewabilityMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomViewabilityMetric]
  }
  
  @scala.inline
  implicit class CustomViewabilityMetricMutableBuilder[Self <: CustomViewabilityMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: CustomViewabilityMetricConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
