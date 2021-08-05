package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgVideoPlayerCommercialsAdMessage
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets whether to apply an animation effect when showing or hiding the ad message. If set to true, the animation is played for [animationDuration](ui.igvideoplayer#options:commercials.adMessage.animationDuration) in milliseconds.
    *
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets the ad message animation duration of the commercial.
    *
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the ad message auto hide of the commercial.
    *
    */
  var autoHide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets the ad message hide delay.
    *
    */
  var hideDelay: js.UndefOr[Double] = js.undefined
}
object IgVideoPlayerCommercialsAdMessage {
  
  inline def apply(): IgVideoPlayerCommercialsAdMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerCommercialsAdMessage]
  }
  
  extension [Self <: IgVideoPlayerCommercialsAdMessage](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
  }
}
