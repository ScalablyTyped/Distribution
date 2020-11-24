package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeOptimizationConfiguration extends js.Object {
  
  /** ID of this creative optimization config. This field is auto-generated when the campaign is inserted or updated. It can be null for existing campaigns. */
  var id: js.UndefOr[String] = js.native
  
  /** Name of this creative optimization config. This is a required field and must be less than 129 characters long. */
  var name: js.UndefOr[String] = js.native
  
  /** List of optimization activities associated with this configuration. */
  var optimizationActivitys: js.UndefOr[js.Array[OptimizationActivity]] = js.native
  
  /** Optimization model for this configuration. */
  var optimizationModel: js.UndefOr[String] = js.native
}
object CreativeOptimizationConfiguration {
  
  @scala.inline
  def apply(): CreativeOptimizationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeOptimizationConfiguration]
  }
  
  @scala.inline
  implicit class CreativeOptimizationConfigurationOps[Self <: CreativeOptimizationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptimizationActivitysVarargs(value: OptimizationActivity*): Self = this.set("optimizationActivitys", js.Array(value :_*))
    
    @scala.inline
    def setOptimizationActivitys(value: js.Array[OptimizationActivity]): Self = this.set("optimizationActivitys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizationActivitys: Self = this.set("optimizationActivitys", js.undefined)
    
    @scala.inline
    def setOptimizationModel(value: String): Self = this.set("optimizationModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizationModel: Self = this.set("optimizationModel", js.undefined)
  }
}
