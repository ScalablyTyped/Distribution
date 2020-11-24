package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversionCountingConfig extends js.Object {
  
  /**
    * The Floodlight activity configs used to track conversions. The number of conversions counted is the sum of all of the conversions counted by all of the Floodlight activity IDs
    * specified in this field.
    */
  var floodlightActivityConfigs: js.UndefOr[js.Array[TrackingFloodlightActivityConfig]] = js.native
  
  /**
    * The percentage of post-view conversions to count, in millis (1/1000 of a percent). Must be between 0 and 100000 inclusive. For example, to track 50% of the post-click conversions,
    * set a value of 50000.
    */
  var postViewCountPercentageMillis: js.UndefOr[String] = js.native
}
object ConversionCountingConfig {
  
  @scala.inline
  def apply(): ConversionCountingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionCountingConfig]
  }
  
  @scala.inline
  implicit class ConversionCountingConfigOps[Self <: ConversionCountingConfig] (val x: Self) extends AnyVal {
    
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
    def setFloodlightActivityConfigsVarargs(value: TrackingFloodlightActivityConfig*): Self = this.set("floodlightActivityConfigs", js.Array(value :_*))
    
    @scala.inline
    def setFloodlightActivityConfigs(value: js.Array[TrackingFloodlightActivityConfig]): Self = this.set("floodlightActivityConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityConfigs: Self = this.set("floodlightActivityConfigs", js.undefined)
    
    @scala.inline
    def setPostViewCountPercentageMillis(value: String): Self = this.set("postViewCountPercentageMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostViewCountPercentageMillis: Self = this.set("postViewCountPercentageMillis", js.undefined)
  }
}
