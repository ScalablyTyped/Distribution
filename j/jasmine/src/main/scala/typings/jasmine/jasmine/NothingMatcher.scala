package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NothingMatcher extends js.Object {
  def nothing(): Unit
}

object NothingMatcher {
  @scala.inline
  def apply(nothing: () => Unit): NothingMatcher = {
    val __obj = js.Dynamic.literal(nothing = js.Any.fromFunction0(nothing))
    __obj.asInstanceOf[NothingMatcher]
  }
}

