package typings.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackdriverLoggingConfig extends StObject {
  
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
  implicit class StackdriverLoggingConfigMutableBuilder[Self <: StackdriverLoggingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSamplingRatio(value: Double): Self = StObject.set(x, "samplingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingRatioUndefined: Self = StObject.set(x, "samplingRatio", js.undefined)
  }
}
