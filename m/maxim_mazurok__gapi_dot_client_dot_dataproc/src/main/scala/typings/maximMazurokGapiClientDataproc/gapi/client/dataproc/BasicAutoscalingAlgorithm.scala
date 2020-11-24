package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicAutoscalingAlgorithm extends js.Object {
  
  /** Optional. Duration between scaling events. A scaling period starts after the update operation from the previous event has completed.Bounds: 2m, 1d. Default: 2m. */
  var cooldownPeriod: js.UndefOr[String] = js.native
  
  /** Required. YARN autoscaling configuration. */
  var yarnConfig: js.UndefOr[BasicYarnAutoscalingConfig] = js.native
}
object BasicAutoscalingAlgorithm {
  
  @scala.inline
  def apply(): BasicAutoscalingAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicAutoscalingAlgorithm]
  }
  
  @scala.inline
  implicit class BasicAutoscalingAlgorithmOps[Self <: BasicAutoscalingAlgorithm] (val x: Self) extends AnyVal {
    
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
    def setCooldownPeriod(value: String): Self = this.set("cooldownPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCooldownPeriod: Self = this.set("cooldownPeriod", js.undefined)
    
    @scala.inline
    def setYarnConfig(value: BasicYarnAutoscalingConfig): Self = this.set("yarnConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYarnConfig: Self = this.set("yarnConfig", js.undefined)
  }
}
