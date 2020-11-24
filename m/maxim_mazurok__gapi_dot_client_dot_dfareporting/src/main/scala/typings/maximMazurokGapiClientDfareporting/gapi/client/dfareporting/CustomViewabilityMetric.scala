package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomViewabilityMetric extends js.Object {
  
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
  implicit class CustomViewabilityMetricOps[Self <: CustomViewabilityMetric] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: CustomViewabilityMetricConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
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
