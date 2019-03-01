package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgVideoPlayerCommercialsEmbeddedCommercial
  extends /**
	 * Option for IgVideoPlayerCommercialsEmbeddedCommercial
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the end second of the embedded commercial.
  	 *
  	 */
  var endTime: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the sponsored link of the embedded commercial.
  	 *
  	 */
  var link: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the start second of the embedded commercial.
  	 *
  	 */
  var startTime: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the tooltip for the bookmark of the embedded commercial.
  	 *
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IgVideoPlayerCommercialsEmbeddedCommercial {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgVideoPlayerCommercialsEmbeddedCommercial
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    endTime: scala.Int | scala.Double = null,
    link: java.lang.String = null,
    startTime: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): IgVideoPlayerCommercialsEmbeddedCommercial = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IgVideoPlayerCommercialsEmbeddedCommercial]
  }
}

