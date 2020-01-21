package typings.lovefield.mod.query

import typings.lovefield.mod.Predicate
import typings.lovefield.mod.schema.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update extends Builder {
  def set(column: Column, value: js.Any): Update
  def where(predicate: Predicate): Update
}

object Update {
  @scala.inline
  def apply(
    bind: /* repeated */ js.Any => Builder,
    exec: () => js.Promise[js.Array[js.Object]],
    explain: () => String,
    set: (Column, js.Any) => Update,
    toSql: () => String,
    where: Predicate => Update
  ): Update = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), exec = js.Any.fromFunction0(exec), explain = js.Any.fromFunction0(explain), set = js.Any.fromFunction2(set), toSql = js.Any.fromFunction0(toSql), where = js.Any.fromFunction1(where))
  
    __obj.asInstanceOf[Update]
  }
}

