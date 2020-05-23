package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgVideoPlayerCommercialsLinkedCommercial
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets the link to open on linked commercial click.
    *
    */
  var link: js.UndefOr[String] = js.undefined
  /**
    * Gets/Sets the sources of the linked commercial video.
    *
    */
  var sources: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Gets/Sets the second in the video at which the linked commercial should play.
    *
    */
  var startTime: js.UndefOr[Double] = js.undefined
  /**
    * Gets/Sets the tooltip for the linked commercial bookmark.
    *
    */
  var title: js.UndefOr[String] = js.undefined
}

object IgVideoPlayerCommercialsLinkedCommercial {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    link: String = null,
    sources: js.Array[_] = null,
    startTime: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): IgVideoPlayerCommercialsLinkedCommercial = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgVideoPlayerCommercialsLinkedCommercial]
  }
}

