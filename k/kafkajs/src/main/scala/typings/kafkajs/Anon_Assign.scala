package typings.kafkajs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assign extends js.Object {
  var name: String
  var protocol: js.UndefOr[js.Function1[/* options */ Anon_Topics, Anon_Metadata]] = js.undefined
  var version: Double
  def assign(options: Anon_Members): js.Promise[js.Array[Anon_MemberAssignment]]
}

object Anon_Assign {
  @scala.inline
  def apply(
    assign: Anon_Members => js.Promise[js.Array[Anon_MemberAssignment]],
    name: String,
    version: Double,
    protocol: /* options */ Anon_Topics => Anon_Metadata = null
  ): Anon_Assign = {
    val __obj = js.Dynamic.literal(assign = js.Any.fromFunction1(assign), name = name, version = version)
    if (protocol != null) __obj.updateDynamic("protocol")(js.Any.fromFunction1(protocol))
    __obj.asInstanceOf[Anon_Assign]
  }
}

