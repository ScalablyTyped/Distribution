package typings.graphqlDashRelay.graphqlDashRelayMod

import typings.graphqlDashRelay.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackwardConnectionArgs extends js.Object {
  var before: Anon_Type
  var last: Anon_Type
}

object BackwardConnectionArgs {
  @scala.inline
  def apply(before: Anon_Type, last: Anon_Type): BackwardConnectionArgs = {
    val __obj = js.Dynamic.literal(before = before, last = last)
  
    __obj.asInstanceOf[BackwardConnectionArgs]
  }
}

