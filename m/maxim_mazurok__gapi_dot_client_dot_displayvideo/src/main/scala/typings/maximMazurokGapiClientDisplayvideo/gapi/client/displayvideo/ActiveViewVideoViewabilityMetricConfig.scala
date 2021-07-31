package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveViewVideoViewabilityMetricConfig extends StObject {
  
  /** Required. The display name of the custom metric. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum visible video duration required (in seconds) in order for an impression to be recorded. You must specify minimum_duration, minimum_quartile or both. If both are
    * specified, an impression meets the metric criteria if either requirement is met (whichever happens first).
    */
  var minimumDuration: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum visible video duration required, based on the video quartiles, in order for an impression to be recorded. You must specify minimum_duration, minimum_quartile or both. If
    * both are specified, an impression meets the metric criteria if either requirement is met (whichever happens first).
    */
  var minimumQuartile: js.UndefOr[String] = js.undefined
  
  /** Required. The minimum percentage of the video ad's pixels visible on the screen in order for an impression to be recorded. */
  var minimumViewability: js.UndefOr[String] = js.undefined
  
  /** Required. The minimum percentage of the video ad's volume required in order for an impression to be recorded. */
  var minimumVolume: js.UndefOr[String] = js.undefined
}
object ActiveViewVideoViewabilityMetricConfig {
  
  @scala.inline
  def apply(): ActiveViewVideoViewabilityMetricConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveViewVideoViewabilityMetricConfig]
  }
  
  @scala.inline
  implicit class ActiveViewVideoViewabilityMetricConfigMutableBuilder[Self <: ActiveViewVideoViewabilityMetricConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setMinimumDuration(value: String): Self = StObject.set(x, "minimumDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumDurationUndefined: Self = StObject.set(x, "minimumDuration", js.undefined)
    
    @scala.inline
    def setMinimumQuartile(value: String): Self = StObject.set(x, "minimumQuartile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumQuartileUndefined: Self = StObject.set(x, "minimumQuartile", js.undefined)
    
    @scala.inline
    def setMinimumViewability(value: String): Self = StObject.set(x, "minimumViewability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumViewabilityUndefined: Self = StObject.set(x, "minimumViewability", js.undefined)
    
    @scala.inline
    def setMinimumVolume(value: String): Self = StObject.set(x, "minimumVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumVolumeUndefined: Self = StObject.set(x, "minimumVolume", js.undefined)
  }
}
