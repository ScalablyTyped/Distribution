package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgVideoPlayerCommercialsAdMessage
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets whether to apply an animation effect when showing or hiding the ad message. If set to true, the animation is played for [animationDuration](ui.igvideoplayer#options:commercials.adMessage.animationDuration) in milliseconds.
    *
    */
  var animate: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets the ad message animation duration of the commercial.
    *
    */
  var animationDuration: js.UndefOr[Double] = js.native
  
  /**
    * Gets/Sets the ad message auto hide of the commercial.
    *
    */
  var autoHide: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets the ad message hide delay.
    *
    */
  var hideDelay: js.UndefOr[Double] = js.native
}
object IgVideoPlayerCommercialsAdMessage {
  
  @scala.inline
  def apply(): IgVideoPlayerCommercialsAdMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerCommercialsAdMessage]
  }
  
  @scala.inline
  implicit class IgVideoPlayerCommercialsAdMessageMutableBuilder[Self <: IgVideoPlayerCommercialsAdMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    @scala.inline
    def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
  }
}
