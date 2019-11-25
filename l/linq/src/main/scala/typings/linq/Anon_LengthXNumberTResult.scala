package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LengthXNumberTResult[TResult] extends /* x */ NumberDictionary[TResult] {
  var length: Double
}

object Anon_LengthXNumberTResult {
  @scala.inline
  def apply[TResult](length: Double, NumberDictionary: /* x */ NumberDictionary[TResult] = null): Anon_LengthXNumberTResult[TResult] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_LengthXNumberTResult[TResult]]
  }
}

