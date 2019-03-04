package typings
package introDotJsLib.IntroJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  var disableInteraction: js.UndefOr[scala.Boolean] = js.undefined
  var element: js.UndefOr[java.lang.String | stdLib.HTMLElement | stdLib.Element] = js.undefined
  var highlightClass: js.UndefOr[java.lang.String] = js.undefined
  var intro: java.lang.String
  var position: js.UndefOr[
    introDotJsLib.introDotJsLibStrings.top | introDotJsLib.introDotJsLibStrings.left | introDotJsLib.introDotJsLibStrings.right | introDotJsLib.introDotJsLibStrings.bottom | introDotJsLib.introDotJsLibStrings.`bottom-left-aligned` | introDotJsLib.introDotJsLibStrings.`bottom-middle-aligned` | introDotJsLib.introDotJsLibStrings.`bottom-right-aligned` | introDotJsLib.introDotJsLibStrings.auto
  ] = js.undefined
  var scrollTo: js.UndefOr[
    introDotJsLib.introDotJsLibStrings.off | introDotJsLib.introDotJsLibStrings.tooltip | introDotJsLib.introDotJsLibStrings.element
  ] = js.undefined
  var tooltipClass: js.UndefOr[java.lang.String] = js.undefined
}

object Step {
  @scala.inline
  def apply(
    intro: java.lang.String,
    disableInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    element: java.lang.String | stdLib.HTMLElement | stdLib.Element = null,
    highlightClass: java.lang.String = null,
    position: introDotJsLib.introDotJsLibStrings.top | introDotJsLib.introDotJsLibStrings.left | introDotJsLib.introDotJsLibStrings.right | introDotJsLib.introDotJsLibStrings.bottom | introDotJsLib.introDotJsLibStrings.`bottom-left-aligned` | introDotJsLib.introDotJsLibStrings.`bottom-middle-aligned` | introDotJsLib.introDotJsLibStrings.`bottom-right-aligned` | introDotJsLib.introDotJsLibStrings.auto = null,
    scrollTo: introDotJsLib.introDotJsLibStrings.off | introDotJsLib.introDotJsLibStrings.tooltip | introDotJsLib.introDotJsLibStrings.element = null,
    tooltipClass: java.lang.String = null
  ): Step = {
    val __obj = js.Dynamic.literal(intro = intro)
    if (!js.isUndefined(disableInteraction)) __obj.updateDynamic("disableInteraction")(disableInteraction)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (highlightClass != null) __obj.updateDynamic("highlightClass")(highlightClass)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(scrollTo.asInstanceOf[js.Any])
    if (tooltipClass != null) __obj.updateDynamic("tooltipClass")(tooltipClass)
    __obj.asInstanceOf[Step]
  }
}

