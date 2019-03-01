package typings
package htmlDashPdfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default
  extends /* page */ org.scalablytyped.runtime.NumberDictionary[java.lang.String] {
  var default: js.UndefOr[java.lang.String] = js.undefined
  var first: js.UndefOr[java.lang.String] = js.undefined
  var last: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(
    NumberDictionary: /* page */ org.scalablytyped.runtime.NumberDictionary[java.lang.String] = null,
    default: java.lang.String = null,
    first: java.lang.String = null,
    last: java.lang.String = null
  ): Anon_Default = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (default != null) __obj.updateDynamic("default")(default)
    if (first != null) __obj.updateDynamic("first")(first)
    if (last != null) __obj.updateDynamic("last")(last)
    __obj.asInstanceOf[Anon_Default]
  }
}

