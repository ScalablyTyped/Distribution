package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings to control how circular dependencies are resolved with iterative
  * calculation.
  */
@js.native
trait SchemaIterativeCalculationSettings extends js.Object {
  
  /**
    * When iterative calculation is enabled and successive results differ by
    * less than this threshold value, the calculation rounds stop.
    */
  var convergenceThreshold: js.UndefOr[Double] = js.native
  
  /**
    * When iterative calculation is enabled, the maximum number of calculation
    * rounds to perform.
    */
  var maxIterations: js.UndefOr[Double] = js.native
}
object SchemaIterativeCalculationSettings {
  
  @scala.inline
  def apply(): SchemaIterativeCalculationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIterativeCalculationSettings]
  }
  
  @scala.inline
  implicit class SchemaIterativeCalculationSettingsOps[Self <: SchemaIterativeCalculationSettings] (val x: Self) extends AnyVal {
    
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
    def setConvergenceThreshold(value: Double): Self = this.set("convergenceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvergenceThreshold: Self = this.set("convergenceThreshold", js.undefined)
    
    @scala.inline
    def setMaxIterations(value: Double): Self = this.set("maxIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxIterations: Self = this.set("maxIterations", js.undefined)
  }
}
