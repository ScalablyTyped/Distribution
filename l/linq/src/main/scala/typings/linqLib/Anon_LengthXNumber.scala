package typings
package linqLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LengthXNumber[TCollection]
  extends /* x */ org.scalablytyped.runtime.NumberDictionary[TCollection] {
  var length: scala.Double
}

object Anon_LengthXNumber {
  @scala.inline
  def apply[TCollection](
    length: scala.Double,
    NumberDictionary: /* x */ org.scalablytyped.runtime.NumberDictionary[TCollection] = null
  ): Anon_LengthXNumber[TCollection] = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_LengthXNumber[TCollection]]
  }
}

