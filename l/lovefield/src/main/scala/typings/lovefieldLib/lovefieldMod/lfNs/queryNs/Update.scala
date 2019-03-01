package typings
package lovefieldLib.lovefieldMod.lfNs.queryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update extends Builder {
  def set(column: lovefieldLib.lovefieldMod.lfNs.schemaNs.Column, value: js.Any): Update
  def where(predicate: lovefieldLib.lovefieldMod.lfNs.Predicate): Update
}

object Update {
  @scala.inline
  def apply(
    bind: js.Function1[/* repeated */ js.Any, Builder],
    exec: js.Function0[js.Promise[js.Array[js.Object]]],
    explain: js.Function0[java.lang.String],
    set: js.Function2[lovefieldLib.lovefieldMod.lfNs.schemaNs.Column, js.Any, Update],
    toSql: js.Function0[java.lang.String],
    where: js.Function1[lovefieldLib.lovefieldMod.lfNs.Predicate, Update]
  ): Update = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(bind)
    __obj.updateDynamic("exec")(exec)
    __obj.updateDynamic("explain")(explain)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("toSql")(toSql)
    __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[Update]
  }
}

