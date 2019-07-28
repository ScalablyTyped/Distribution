package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgVideoPlayerCommercialsLinkedCommercial
  extends /**
	 * Option for IgVideoPlayerCommercialsLinkedCommercial
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
    StringDictionary: /**
  	 * Option for IgVideoPlayerCommercialsLinkedCommercial
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    link: String = null,
    sources: js.Array[_] = null,
    startTime: Int | Double = null,
    title: String = null
  ): IgVideoPlayerCommercialsLinkedCommercial = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (link != null) __obj.updateDynamic("link")(link)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IgVideoPlayerCommercialsLinkedCommercial]
  }
}

