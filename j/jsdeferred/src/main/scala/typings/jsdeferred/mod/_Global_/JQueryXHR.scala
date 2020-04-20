package typings.jsdeferred.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryXHR extends js.Object {
  def next(fun: js.Function): Deferred
}

object JQueryXHR {
  @scala.inline
  def apply(next: js.Function => Deferred): JQueryXHR = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[JQueryXHR]
  }
}

