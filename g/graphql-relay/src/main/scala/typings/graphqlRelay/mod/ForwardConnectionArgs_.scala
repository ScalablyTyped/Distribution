package typings.graphqlRelay.mod

import typings.graphqlRelay.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardConnectionArgs_ extends js.Object {
  var after: Type
  var first: Type
}

object ForwardConnectionArgs_ {
  @scala.inline
  def apply(after: Type, first: Type): ForwardConnectionArgs_ = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardConnectionArgs_]
  }
}

