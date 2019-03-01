package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// taken from TypeScript lib.core.es6.d.ts, applicable to CustomMatchers.contains()
trait ArrayLike[T]
  extends /* n */ org.scalablytyped.runtime.NumberDictionary[T] {
  var length: scala.Double
}

object ArrayLike {
  @scala.inline
  def apply[T](
    length: scala.Double,
    NumberDictionary: /* n */ org.scalablytyped.runtime.NumberDictionary[T] = null
  ): ArrayLike[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ArrayLike[T]]
  }
}

