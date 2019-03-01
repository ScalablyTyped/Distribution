package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardConnectionArgs extends js.Object {
  var after: graphqlDashRelayLib.Anon_Type
  var first: graphqlDashRelayLib.Anon_Type
}

object ForwardConnectionArgs {
  @scala.inline
  def apply(after: graphqlDashRelayLib.Anon_Type, first: graphqlDashRelayLib.Anon_Type): ForwardConnectionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(after)
    __obj.updateDynamic("first")(first)
    __obj.asInstanceOf[ForwardConnectionArgs]
  }
}

