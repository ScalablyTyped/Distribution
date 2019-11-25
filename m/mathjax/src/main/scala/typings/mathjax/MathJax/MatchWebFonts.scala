package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchWebFonts extends js.Object {
  /*Initial delay before the first check for web fonts (in milliseconds).*/
  var fontCheckDelay: js.UndefOr[Double] = js.undefined
  /*How long to keep looking for fonts (in milliseconds).*/
  var fontCheckTimeout: js.UndefOr[Double] = js.undefined
  /*This block controls whether to apply font size matching for each output mode.*/
  var matchFor: js.UndefOr[MatchFor] = js.undefined
}

object MatchWebFonts {
  @scala.inline
  def apply(
    fontCheckDelay: Int | Double = null,
    fontCheckTimeout: Int | Double = null,
    matchFor: MatchFor = null
  ): MatchWebFonts = {
    val __obj = js.Dynamic.literal()
    if (fontCheckDelay != null) __obj.updateDynamic("fontCheckDelay")(fontCheckDelay.asInstanceOf[js.Any])
    if (fontCheckTimeout != null) __obj.updateDynamic("fontCheckTimeout")(fontCheckTimeout.asInstanceOf[js.Any])
    if (matchFor != null) __obj.updateDynamic("matchFor")(matchFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchWebFonts]
  }
}

