package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom Viewability Metric
  */
@js.native
trait SchemaCustomViewabilityMetric extends js.Object {
  
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
  implicit class SchemaCustomViewabilityMetricOps[Self <: SchemaCustomViewabilityMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfiguration(value: SchemaCustomViewabilityMetricConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
