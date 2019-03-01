package typings
package introDotJsLib.IntroJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hint extends js.Object {
  var element: js.UndefOr[java.lang.String | stdLib.HTMLElement | stdLib.Element] = js.undefined
  var hint: java.lang.String
  var hintPosition: js.UndefOr[java.lang.String] = js.undefined
}

object Hint {
  @scala.inline
  def apply(
    hint: java.lang.String,
    element: java.lang.String | stdLib.HTMLElement | stdLib.Element = null,
    hintPosition: java.lang.String = null
  ): Hint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hint")(hint)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (hintPosition != null) __obj.updateDynamic("hintPosition")(hintPosition)
    __obj.asInstanceOf[Hint]
  }
}

