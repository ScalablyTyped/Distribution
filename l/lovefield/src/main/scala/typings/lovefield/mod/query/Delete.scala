package typings.lovefield.mod.query

import typings.lovefield.mod.Predicate
import typings.lovefield.mod.schema.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends Builder {
  def from(table: Table): Delete
  def where(predicate: Predicate): Delete
}

object Delete {
  @scala.inline
  def apply(
    bind: /* repeated */ js.Any => Builder,
    exec: () => js.Promise[js.Array[js.Object]],
    explain: () => String,
    from: Table => Delete,
    toSql: () => String,
    where: Predicate => Delete
  ): Delete = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), exec = js.Any.fromFunction0(exec), explain = js.Any.fromFunction0(explain), from = js.Any.fromFunction1(from), toSql = js.Any.fromFunction0(toSql), where = js.Any.fromFunction1(where))
  
    __obj.asInstanceOf[Delete]
  }
}

