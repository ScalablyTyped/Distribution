package typings.hexo.hexoMod.extendNs

import typings.minimist.minimistMod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Migrator extends js.Object {
  def register(
    name: String,
    fn: js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ js.Any, Unit], Unit]
  ): Unit
}

object Migrator {
  @scala.inline
  def apply(
    register: (String, js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ js.Any, Unit], Unit]) => Unit
  ): Migrator = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[Migrator]
  }
}

