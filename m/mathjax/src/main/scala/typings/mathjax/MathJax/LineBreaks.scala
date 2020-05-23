package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineBreaks extends js.Object {
  /*This controls the automatic breaking of expressions: when false, only linebreak="newline" is processed; when
    * true, line breaks are inserted automatically in long expressions.
    */
  var automatic: js.UndefOr[Boolean] = js.undefined
  /*This controls how wide the lines of mathematics can be.
    * Use an explicit width like "30em" for a fixed width. Use "container" to compute the size from the containing
    * element. Use "nn% container" for a portion of the container. Use "nn%" for a portion of the window size.
    * The container-based widths may be slower, and may not produce the expected results if the layout width changes
    * due to the removal of previews or inclusion of mathematics during typesetting.
    */
  var width: js.UndefOr[String] = js.undefined
}

object LineBreaks {
  @scala.inline
  def apply(automatic: js.UndefOr[Boolean] = js.undefined, width: String = null): LineBreaks = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automatic)) __obj.updateDynamic("automatic")(automatic.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineBreaks]
  }
}

