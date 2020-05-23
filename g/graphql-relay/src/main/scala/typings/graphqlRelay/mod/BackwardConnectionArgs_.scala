package typings.graphqlRelay.mod

import typings.graphqlRelay.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackwardConnectionArgs_ extends js.Object {
  var before: Type
  var last: Type
}

object BackwardConnectionArgs_ {
  @scala.inline
  def apply(before: Type, last: Type): BackwardConnectionArgs_ = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackwardConnectionArgs_]
  }
}

