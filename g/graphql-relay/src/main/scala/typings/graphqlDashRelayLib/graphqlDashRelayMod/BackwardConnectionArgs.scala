package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackwardConnectionArgs extends js.Object {
  var before: graphqlDashRelayLib.Anon_Type
  var last: graphqlDashRelayLib.Anon_Type
}

object BackwardConnectionArgs {
  @scala.inline
  def apply(before: graphqlDashRelayLib.Anon_Type, last: graphqlDashRelayLib.Anon_Type): BackwardConnectionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("before")(before)
    __obj.updateDynamic("last")(last)
    __obj.asInstanceOf[BackwardConnectionArgs]
  }
}

