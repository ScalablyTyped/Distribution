package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLengthXNumberTResult[TResult] extends /* x */ NumberDictionary[TResult] {
  var length: Double
}

object AnonLengthXNumberTResult {
  @scala.inline
  def apply[TResult](length: Double, NumberDictionary: /* x */ NumberDictionary[TResult] = null): AnonLengthXNumberTResult[TResult] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[AnonLengthXNumberTResult[TResult]]
  }
}

