package typings.htmlPdf

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictpage extends /* page */ NumberDictionary[String] {
  var default: js.UndefOr[String] = js.undefined
  var first: js.UndefOr[String] = js.undefined
  var last: js.UndefOr[String] = js.undefined
}

object AnonDictpage {
  @scala.inline
  def apply(
    NumberDictionary: /* page */ NumberDictionary[String] = null,
    default: String = null,
    first: String = null,
    last: String = null
  ): AnonDictpage = {
    val __obj = js.Dynamic.literal()
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictpage]
  }
}

