package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength[T] extends /* x */ NumberDictionary[T] {
  var length: Double
}

object AnonLength {
  @scala.inline
  def apply[T](length: Double, NumberDictionary: /* x */ NumberDictionary[T] = null): AnonLength[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[AnonLength[T]]
  }
}

