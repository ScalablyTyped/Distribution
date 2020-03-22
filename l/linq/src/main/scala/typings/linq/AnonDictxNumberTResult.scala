package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictxNumberTResult[TResult] extends /* x */ NumberDictionary[TResult] {
  var length: Double
}

object AnonDictxNumberTResult {
  @scala.inline
  def apply[TResult](length: Double, NumberDictionary: /* x */ NumberDictionary[TResult] = null): AnonDictxNumberTResult[TResult] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[AnonDictxNumberTResult[TResult]]
  }
}

