package typings.graphqlDashRelay.graphqlDashRelayMod

import typings.graphqlDashRelay.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardConnectionArgs extends js.Object {
  var after: Anon_Type
  var first: Anon_Type
}

object ForwardConnectionArgs {
  @scala.inline
  def apply(after: Anon_Type, first: Anon_Type): ForwardConnectionArgs = {
    val __obj = js.Dynamic.literal(after = after, first = first)
  
    __obj.asInstanceOf[ForwardConnectionArgs]
  }
}

