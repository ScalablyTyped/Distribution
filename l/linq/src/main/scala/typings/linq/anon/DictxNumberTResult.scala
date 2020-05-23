package typings.linq.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictxNumberTResult[TResult] extends /* x */ NumberDictionary[TResult] {
  var length: Double
}

object DictxNumberTResult {
  @scala.inline
  def apply[TResult](length: Double, NumberDictionary: /* x */ NumberDictionary[TResult] = null): DictxNumberTResult[TResult] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[DictxNumberTResult[TResult]]
  }
}

