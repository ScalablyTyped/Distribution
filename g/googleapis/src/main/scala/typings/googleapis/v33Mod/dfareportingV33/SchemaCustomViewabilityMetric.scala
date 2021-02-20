package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom Viewability Metric
  */
@js.native
trait SchemaCustomViewabilityMetric extends StObject {
  
  /**
    * Configuration of the custom viewability metric.
    */
  var configuration: js.UndefOr[SchemaCustomViewabilityMetricConfiguration] = js.native
  
  /**
    * ID of the custom viewability metric.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Name of the custom viewability metric.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaCustomViewabilityMetric {
  
  @scala.inline
  def apply(): SchemaCustomViewabilityMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomViewabilityMetric]
  }
  
  @scala.inline
  implicit class SchemaCustomViewabilityMetricMutableBuilder[Self <: SchemaCustomViewabilityMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: SchemaCustomViewabilityMetricConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
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
