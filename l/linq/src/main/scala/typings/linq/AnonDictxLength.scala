package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictxLength[TCollection] extends /* x */ NumberDictionary[TCollection] {
  var length: Double
}

object AnonDictxLength {
  @scala.inline
  def apply[TCollection](length: Double, NumberDictionary: /* x */ NumberDictionary[TCollection] = null): AnonDictxLength[TCollection] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[AnonDictxLength[TCollection]]
  }
}

