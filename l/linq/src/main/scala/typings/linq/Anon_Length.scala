package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length[T] extends /* x */ NumberDictionary[T] {
  var length: Double
}

object Anon_Length {
  @scala.inline
  def apply[T](length: Double, NumberDictionary: /* x */ NumberDictionary[T] = null): Anon_Length[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_Length[T]]
  }
}

