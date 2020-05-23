package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgVideoPlayerCommercialsEmbeddedCommercial
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets the end second of the embedded commercial.
    *
    */
  var endTime: js.UndefOr[Double] = js.undefined
  /**
    * Gets/Sets the sponsored link of the embedded commercial.
    *
    */
  var link: js.UndefOr[String] = js.undefined
  /**
    * Gets/Sets the start second of the embedded commercial.
    *
    */
  var startTime: js.UndefOr[Double] = js.undefined
  /**
    * Gets/Sets the tooltip for the bookmark of the embedded commercial.
    *
    */
  var title: js.UndefOr[String] = js.undefined
}

object IgVideoPlayerCommercialsEmbeddedCommercial {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    endTime: js.UndefOr[Double] = js.undefined,
    link: String = null,
    startTime: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): IgVideoPlayerCommercialsEmbeddedCommercial = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(endTime)) __obj.updateDynamic("endTime")(endTime.get.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgVideoPlayerCommercialsEmbeddedCommercial]
  }
}

