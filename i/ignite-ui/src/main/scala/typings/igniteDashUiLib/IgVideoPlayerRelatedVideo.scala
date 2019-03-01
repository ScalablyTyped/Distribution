package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgVideoPlayerRelatedVideo
  extends /**
	 * Option for IgVideoPlayerRelatedVideo
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets/Sets custom CSS class to be applied on the related video element.
  	 *
  	 */
  var css: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the height of the related video image.
  	 *
  	 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the URL of the related video image.
  	 *
  	 */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets a link to a page that will play the related video. It will be opened in a new window. If there are sources also, the link property has a priority.
  	 *
  	 */
  var link: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the sources of the related video.
  	 *
  	 */
  var sources: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets/Sets the title of the video.
  	 *
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the width of the related video image.
  	 *
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object IgVideoPlayerRelatedVideo {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgVideoPlayerRelatedVideo
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    css: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    imageUrl: java.lang.String = null,
    link: java.lang.String = null,
    sources: js.Array[_] = null,
    title: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): IgVideoPlayerRelatedVideo = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (css != null) __obj.updateDynamic("css")(css)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (link != null) __obj.updateDynamic("link")(link)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgVideoPlayerRelatedVideo]
  }
}

