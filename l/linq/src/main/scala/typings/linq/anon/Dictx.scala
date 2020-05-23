package typings.linq.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictx[T] extends /* x */ NumberDictionary[T] {
  var length: Double
}

object Dictx {
  @scala.inline
  def apply[T](length: Double, NumberDictionary: /* n */ NumberDictionary[T] = null): Dictx[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Dictx[T]]
  }
}

