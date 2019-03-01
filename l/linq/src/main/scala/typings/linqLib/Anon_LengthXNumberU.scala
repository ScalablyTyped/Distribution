package typings
package linqLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LengthXNumberU[U]
  extends /* x */ org.scalablytyped.runtime.NumberDictionary[U] {
  var length: scala.Double
}

object Anon_LengthXNumberU {
  @scala.inline
  def apply[U](
    length: scala.Double,
    NumberDictionary: /* x */ org.scalablytyped.runtime.NumberDictionary[U] = null
  ): Anon_LengthXNumberU[U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_LengthXNumberU[U]]
  }
}

