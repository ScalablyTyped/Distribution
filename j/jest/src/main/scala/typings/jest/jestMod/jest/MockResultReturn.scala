package typings.jest.jestMod.jest

import typings.jest.jestStrings.`return`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the result of a single call to a mock function with a return value.
  */
trait MockResultReturn[T] extends MockResult[T] {
  var `type`: `return`
  var value: T
}

object MockResultReturn {
  @scala.inline
  def apply[T](`type`: `return`, value: T): MockResultReturn[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockResultReturn[T]]
  }
}

