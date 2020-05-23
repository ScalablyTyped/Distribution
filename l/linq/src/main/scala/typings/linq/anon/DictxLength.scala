package typings.linq.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictxLength[TCollection] extends /* x */ NumberDictionary[TCollection] {
  var length: Double
}

object DictxLength {
  @scala.inline
  def apply[TCollection](length: Double, NumberDictionary: /* x */ NumberDictionary[TCollection] = null): DictxLength[TCollection] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[DictxLength[TCollection]]
  }
}

