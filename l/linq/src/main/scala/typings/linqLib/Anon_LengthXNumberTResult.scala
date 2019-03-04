package typings
package linqLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LengthXNumberTResult[TResult]
  extends /* x */ org.scalablytyped.runtime.NumberDictionary[TResult] {
  var length: scala.Double
}

object Anon_LengthXNumberTResult {
  @scala.inline
  def apply[TResult](
    length: scala.Double,
    NumberDictionary: /* x */ org.scalablytyped.runtime.NumberDictionary[TResult] = null
  ): Anon_LengthXNumberTResult[TResult] = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_LengthXNumberTResult[TResult]]
  }
}

