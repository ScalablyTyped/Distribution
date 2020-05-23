package typings.jshamcrest.JsHamcrest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BetweenBuilder extends js.Object {
  def and(end: js.Any): SimpleMatcher
}

object BetweenBuilder {
  @scala.inline
  def apply(and: js.Any => SimpleMatcher): BetweenBuilder = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and))
    __obj.asInstanceOf[BetweenBuilder]
  }
}

