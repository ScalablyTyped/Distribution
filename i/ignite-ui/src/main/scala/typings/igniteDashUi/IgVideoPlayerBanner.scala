package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgVideoPlayerBanner
  extends /**
	 * Option for IgVideoPlayerBanner
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets whether to apply animation effects when showing or hiding the banner. If set to true, the animation is played for banner.duration in milliseconds.
  	 *
  	 */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether to automatically hide the banner. If set to true, the banner is hidden after [hidedelay](ui.igvideoplayer#options:banners.hidedelay) in milliseconds.
  	 *
  	 */
  var autohide: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the user will be able to close the banner or not.
  	 *
  	 */
  var closeBanner: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the banner specific css class, that will be applied on the banner grid.
  	 *
  	 */
  var css: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the banner animation duration.
  	 *
  	 */
  var duration: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets the banner height
  	 *
  	 */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
  	 * Gets/Sets the banner autohide delay in milliseconds. It is taken into account only if the banner.autohide option is set to true.
  	 *
  	 */
  var hidedelay: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets the banner image url.
  	 *
  	 */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the banner link that will open in new window.
  	 *
  	 */
  var link: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets an array of numbers. Each number specifies on which second in the movie the banner will pop.
  	 *
  	 */
  var times: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets/Sets whether the banner is visible or not.
  	 *
  	 */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the banner width
  	 *
  	 */
  var width: js.UndefOr[Double | String] = js.undefined
}

object IgVideoPlayerBanner {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgVideoPlayerBanner
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    autohide: js.UndefOr[Boolean] = js.undefined,
    closeBanner: js.UndefOr[Boolean] = js.undefined,
    css: String = null,
    duration: Int | Double = null,
    height: Double | String = null,
    hidedelay: Int | Double = null,
    imageUrl: String = null,
    link: String = null,
    times: js.Array[_] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): IgVideoPlayerBanner = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide)
    if (!js.isUndefined(closeBanner)) __obj.updateDynamic("closeBanner")(closeBanner)
    if (css != null) __obj.updateDynamic("css")(css)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hidedelay != null) __obj.updateDynamic("hidedelay")(hidedelay.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (link != null) __obj.updateDynamic("link")(link)
    if (times != null) __obj.updateDynamic("times")(times)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgVideoPlayerBanner]
  }
}

