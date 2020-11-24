package typings.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackdriverLoggingConfig extends js.Object {
  
  /**
    * Specifies the fraction of operations to write to [Stackdriver Logging](https://cloud.google.com/logging/docs/). This field may contain any value between 0.0 and 1.0, inclusive. 0.0
    * is the default and means that no operations are logged.
    */
  var samplingRatio: js.UndefOr[Double] = js.native
}
object StackdriverLoggingConfig {
  
  @scala.inline
  def apply(): StackdriverLoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackdriverLoggingConfig]
  }
  
  @scala.inline
  implicit class StackdriverLoggingConfigOps[Self <: StackdriverLoggingConfig] (val x: Self) extends AnyVal {
    
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
    def setSamplingRatio(value: Double): Self = this.set("samplingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingRatio: Self = this.set("samplingRatio", js.undefined)
  }
}
