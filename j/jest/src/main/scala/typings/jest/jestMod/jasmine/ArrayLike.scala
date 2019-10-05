package typings.jest.jestMod.jasmine

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayLike[T] extends /* n */ NumberDictionary[T] {
  var length: Double
}

object ArrayLike {
  @scala.inline
  def apply[T](length: Double, NumberDictionary: /* n */ NumberDictionary[T] = null): ArrayLike[T] = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ArrayLike[T]]
  }
}

