package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgVideoPlayerBookmark
  extends /**
	 * Option for IgVideoPlayerBookmark
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets whether the bookmark is disabled or not.
  	 *
  	 */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets where the bookmark will be positioned. Should be between 0 and movie duration in seconds.
  	 *
  	 */
  var time: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets bookmark title. It is shown as tooltip on hover.
  	 *
  	 */
  var title: js.UndefOr[String] = js.undefined
}

object IgVideoPlayerBookmark {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgVideoPlayerBookmark
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    time: Int | Double = null,
    title: String = null
  ): IgVideoPlayerBookmark = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IgVideoPlayerBookmark]
  }
}

