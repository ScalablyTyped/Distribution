package typings.introJs.mod

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hint extends js.Object {
  var element: js.UndefOr[String | HTMLElement | Element] = js.undefined
  var hint: String
  var hintPosition: js.UndefOr[String] = js.undefined
}

object Hint {
  @scala.inline
  def apply(hint: String, element: String | HTMLElement | Element = null, hintPosition: String = null): Hint = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (hintPosition != null) __obj.updateDynamic("hintPosition")(hintPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hint]
  }
}

