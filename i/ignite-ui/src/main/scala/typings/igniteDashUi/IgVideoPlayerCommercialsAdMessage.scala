package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgVideoPlayerCommercialsAdMessage
  extends /**
	 * Option for IgVideoPlayerCommercialsAdMessage
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
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgVideoPlayerCommercialsAdMessage
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    autoHide: js.UndefOr[Boolean] = js.undefined,
    hideDelay: Int | Double = null
  ): IgVideoPlayerCommercialsAdMessage = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (hideDelay != null) __obj.updateDynamic("hideDelay")(hideDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgVideoPlayerCommercialsAdMessage]
  }
}

