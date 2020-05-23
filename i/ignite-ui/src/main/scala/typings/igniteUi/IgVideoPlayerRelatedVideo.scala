package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgVideoPlayerRelatedVideo
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets custom CSS class to be applied on the related video element.
    *
    */
  var css: js.UndefOr[String] = js.undefined
  /**
    * Gets/Sets the height of the related video image.
    *
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Gets/Sets the URL of the related video image.
    *
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * Gets/Sets a link to a page that will play the related video. It will be opened in a new window. If there are sources also, the link property has a priority.
    *
    */
  var link: js.UndefOr[String] = js.undefined
  /**
    * Gets/Sets the sources of the related video.
    *
    */
  var sources: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Gets/Sets the title of the video.
    *
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Gets/Sets the width of the related video image.
    *
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IgVideoPlayerRelatedVideo {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    css: String = null,
    height: js.UndefOr[Double] = js.undefined,
    imageUrl: String = null,
    link: String = null,
    sources: js.Array[_] = null,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): IgVideoPlayerRelatedVideo = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgVideoPlayerRelatedVideo]
  }
}

