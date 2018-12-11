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

