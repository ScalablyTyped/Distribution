package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscalingSettings extends js.Object {
  
  /** The algorithm to use for autoscaling. */
  var algorithm: js.UndefOr[String] = js.native
  
  /** The maximum number of workers to cap scaling at. */
  var maxNumWorkers: js.UndefOr[Double] = js.native
}
object AutoscalingSettings {
  
  @scala.inline
  def apply(): AutoscalingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingSettings]
  }
  
  @scala.inline
  implicit class AutoscalingSettingsOps[Self <: AutoscalingSettings] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setMaxNumWorkers(value: Double): Self = this.set("maxNumWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNumWorkers: Self = this.set("maxNumWorkers", js.undefined)
  }
}
