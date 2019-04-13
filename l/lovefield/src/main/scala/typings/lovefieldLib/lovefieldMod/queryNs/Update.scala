package typings
package lovefieldLib.lovefieldMod.queryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update extends Builder {
  def set(column: lovefieldLib.lovefieldMod.schemaNs.Column, value: js.Any): Update
  def where(predicate: lovefieldLib.lovefieldMod.Predicate): Update
}

object Update {
  @scala.inline
  def apply(
    bind: /* repeated */ js.Any => Builder,
    exec: () => js.Promise[js.Array[js.Object]],
    explain: () => java.lang.String,
    set: (lovefieldLib.lovefieldMod.schemaNs.Column, js.Any) => Update,
    toSql: () => java.lang.String,
    where: lovefieldLib.lovefieldMod.Predicate => Update
  ): Update = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), exec = js.Any.fromFunction0(exec), explain = js.Any.fromFunction0(explain), set = js.Any.fromFunction2(set), toSql = js.Any.fromFunction0(toSql), where = js.Any.fromFunction1(where))
  
    __obj.asInstanceOf[Update]
  }
}

