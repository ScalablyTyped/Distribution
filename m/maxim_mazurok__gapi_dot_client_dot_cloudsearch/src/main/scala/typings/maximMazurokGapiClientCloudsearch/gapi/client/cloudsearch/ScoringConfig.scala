package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScoringConfig extends js.Object {
  
  /** Whether to use freshness as a ranking signal. By default, freshness is used as a ranking signal. Note that this setting is not available in the Admin UI. */
  var disableFreshness: js.UndefOr[Boolean] = js.native
  
  /** Whether to personalize the results. By default, personal signals will be used to boost results. */
  var disablePersonalization: js.UndefOr[Boolean] = js.native
}
object ScoringConfig {
  
  @scala.inline
  def apply(): ScoringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScoringConfig]
  }
  
  @scala.inline
  implicit class ScoringConfigOps[Self <: ScoringConfig] (val x: Self) extends AnyVal {
    
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
    def setDisableFreshness(value: Boolean): Self = this.set("disableFreshness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFreshness: Self = this.set("disableFreshness", js.undefined)
    
    @scala.inline
    def setDisablePersonalization(value: Boolean): Self = this.set("disablePersonalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePersonalization: Self = this.set("disablePersonalization", js.undefined)
  }
}
