package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveViewVideoViewabilityMetricConfig extends js.Object {
  
  /** Required. The display name of the custom metric. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The minimum visible video duration required (in seconds) in order for an impression to be recorded. You must specify minimum_duration, minimum_quartile or both. If both are
    * specified, an impression meets the metric criteria if either requirement is met (whichever happens first).
    */
  var minimumDuration: js.UndefOr[String] = js.native
  
  /**
    * The minimum visible video duration required, based on the video quartiles, in order for an impression to be recorded. You must specify minimum_duration, minimum_quartile or both. If
    * both are specified, an impression meets the metric criteria if either requirement is met (whichever happens first).
    */
  var minimumQuartile: js.UndefOr[String] = js.native
  
  /** Required. The minimum percentage of the video ad's pixels visible on the screen in order for an impression to be recorded. */
  var minimumViewability: js.UndefOr[String] = js.native
  
  /** Required. The minimum percentage of the video ad's volume required in order for an impression to be recorded. */
  var minimumVolume: js.UndefOr[String] = js.native
}
object ActiveViewVideoViewabilityMetricConfig {
  
  @scala.inline
  def apply(): ActiveViewVideoViewabilityMetricConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveViewVideoViewabilityMetricConfig]
  }
  
  @scala.inline
  implicit class ActiveViewVideoViewabilityMetricConfigOps[Self <: ActiveViewVideoViewabilityMetricConfig] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setMinimumDuration(value: String): Self = this.set("minimumDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumDuration: Self = this.set("minimumDuration", js.undefined)
    
    @scala.inline
    def setMinimumQuartile(value: String): Self = this.set("minimumQuartile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumQuartile: Self = this.set("minimumQuartile", js.undefined)
    
    @scala.inline
    def setMinimumViewability(value: String): Self = this.set("minimumViewability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumViewability: Self = this.set("minimumViewability", js.undefined)
    
    @scala.inline
    def setMinimumVolume(value: String): Self = this.set("minimumVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumVolume: Self = this.set("minimumVolume", js.undefined)
  }
}
