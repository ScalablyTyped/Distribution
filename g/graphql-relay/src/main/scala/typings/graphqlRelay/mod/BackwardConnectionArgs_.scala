package typings.graphqlRelay.mod

import typings.graphqlRelay.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackwardConnectionArgs_ extends js.Object {
  var before: AnonType
  var last: AnonType
}

object BackwardConnectionArgs_ {
  @scala.inline
  def apply(before: AnonType, last: AnonType): BackwardConnectionArgs_ = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackwardConnectionArgs_]
  }
}

