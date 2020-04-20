package typings.graphqlRelay.mod

import typings.graphqlRelay.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardConnectionArgs_ extends js.Object {
  var after: AnonType
  var first: AnonType
}

object ForwardConnectionArgs_ {
  @scala.inline
  def apply(after: AnonType, first: AnonType): ForwardConnectionArgs_ = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardConnectionArgs_]
  }
}

