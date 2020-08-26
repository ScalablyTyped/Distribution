package typings.hexo.mod.extend

import typings.minimist.mod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Migrator extends js.Object {
  def register(
    name: String,
    fn: js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ js.Any, Unit], Unit]
  ): Unit = js.native
}

object Migrator {
  @scala.inline
  def apply(
    register: (String, js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ js.Any, Unit], Unit]) => Unit
  ): Migrator = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Migrator]
  }
  @scala.inline
  implicit class MigratorOps[Self <: Migrator] (val x: Self) extends AnyVal {
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
    def setRegister(
      value: (String, js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ js.Any, Unit], Unit]) => Unit
    ): Self = this.set("register", js.Any.fromFunction2(value))
  }
  
}

