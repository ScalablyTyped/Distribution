package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assign extends js.Object {
  var name: java.lang.String
  var protocol: js.UndefOr[js.Function1[/* options */ Anon_Topics, Anon_Metadata]] = js.undefined
  var version: scala.Double
  def assign(options: Anon_Members): js.Promise[js.Array[Anon_MemberAssignment]]
}

object Anon_Assign {
  @scala.inline
  def apply(
    assign: js.Function1[Anon_Members, js.Promise[js.Array[Anon_MemberAssignment]]],
    name: java.lang.String,
    version: scala.Double,
    protocol: js.Function1[/* options */ Anon_Topics, Anon_Metadata] = null
  ): Anon_Assign = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assign")(assign)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[Anon_Assign]
  }
}

