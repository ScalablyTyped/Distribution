package typings
package lovefieldLib.lovefieldMod.lfNs.queryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends Builder {
  def from(table: lovefieldLib.lovefieldMod.lfNs.schemaNs.Table): Delete
  def where(predicate: lovefieldLib.lovefieldMod.lfNs.Predicate): Delete
}

object Delete {
  @scala.inline
  def apply(
    bind: js.Function1[/* repeated */ js.Any, Builder],
    exec: js.Function0[js.Promise[js.Array[js.Object]]],
    explain: js.Function0[java.lang.String],
    from: js.Function1[lovefieldLib.lovefieldMod.lfNs.schemaNs.Table, Delete],
    toSql: js.Function0[java.lang.String],
    where: js.Function1[lovefieldLib.lovefieldMod.lfNs.Predicate, Delete]
  ): Delete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(bind)
    __obj.updateDynamic("exec")(exec)
    __obj.updateDynamic("explain")(explain)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("toSql")(toSql)
    __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[Delete]
  }
}

