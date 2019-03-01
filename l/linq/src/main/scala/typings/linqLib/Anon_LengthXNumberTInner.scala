package typings
package linqLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LengthXNumberTInner[TInner]
  extends /* x */ org.scalablytyped.runtime.NumberDictionary[TInner] {
  var length: scala.Double
}

object Anon_LengthXNumberTInner {
  @scala.inline
  def apply[TInner](
    length: scala.Double,
    NumberDictionary: /* x */ org.scalablytyped.runtime.NumberDictionary[TInner] = null
  ): Anon_LengthXNumberTInner[TInner] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_LengthXNumberTInner[TInner]]
  }
}

