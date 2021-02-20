package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookbackConfiguration extends StObject {
  
  /**
    * Lookback window, in days, from the last time a given user clicked on one of your ads. If you enter 0, clicks will not be considered as triggering events for floodlight tracking. If
    * you leave this field blank, the default value for your account will be used. Acceptable values are 0 to 90, inclusive.
    */
  var clickDuration: js.UndefOr[Double] = js.native
  
  /**
    * Lookback window, in days, from the last time a given user viewed one of your ads. If you enter 0, impressions will not be considered as triggering events for floodlight tracking. If
    * you leave this field blank, the default value for your account will be used. Acceptable values are 0 to 90, inclusive.
    */
  var postImpressionActivitiesDuration: js.UndefOr[Double] = js.native
}
object LookbackConfiguration {
  
  @scala.inline
  def apply(): LookbackConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookbackConfiguration]
  }
  
  @scala.inline
  implicit class LookbackConfigurationMutableBuilder[Self <: LookbackConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickDuration(value: Double): Self = StObject.set(x, "clickDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickDurationUndefined: Self = StObject.set(x, "clickDuration", js.undefined)
    
    @scala.inline
    def setPostImpressionActivitiesDuration(value: Double): Self = StObject.set(x, "postImpressionActivitiesDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostImpressionActivitiesDurationUndefined: Self = StObject.set(x, "postImpressionActivitiesDuration", js.undefined)
  }
}
