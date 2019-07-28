package typings.htmlDashPdf

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends /* page */ NumberDictionary[String] {
  var default: js.UndefOr[String] = js.undefined
  var first: js.UndefOr[String] = js.undefined
  var last: js.UndefOr[String] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(
    NumberDictionary: /* page */ NumberDictionary[String] = null,
    default: String = null,
    first: String = null,
    last: String = null
  ): Anon_Default = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (default != null) __obj.updateDynamic("default")(default)
    if (first != null) __obj.updateDynamic("first")(first)
    if (last != null) __obj.updateDynamic("last")(last)
    __obj.asInstanceOf[Anon_Default]
  }
}

