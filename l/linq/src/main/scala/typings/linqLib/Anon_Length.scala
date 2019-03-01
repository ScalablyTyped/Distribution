package typings
package linqLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length[T]
  extends /* x */ org.scalablytyped.runtime.NumberDictionary[T] {
  var length: scala.Double
}

object Anon_Length {
  @scala.inline
  def apply[T](
    length: scala.Double,
    NumberDictionary: /* x */ org.scalablytyped.runtime.NumberDictionary[T] = null
  ): Anon_Length[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_Length[T]]
  }
}

