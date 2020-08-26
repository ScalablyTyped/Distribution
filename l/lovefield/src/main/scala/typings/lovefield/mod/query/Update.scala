package typings.lovefield.mod.query

import typings.lovefield.mod.Predicate
import typings.lovefield.mod.schema.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Update extends Builder {
  def set(column: Column, value: js.Any): Update = js.native
  def where(predicate: Predicate): Update = js.native
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
  @scala.inline
  implicit class UpdateOps[Self <: Update] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSet(value: (Column, js.Any) => Update): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setWhere(value: Predicate => Update): Self = this.set("where", js.Any.fromFunction1(value))
  }
  
}

