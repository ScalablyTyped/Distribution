package typings.hexo.hexoMod.extend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Helper extends js.Object {
  def register(name: String, fn: js.Function1[/* repeated */ js.Any, _]): Unit
}

object Helper {
  @scala.inline
  def apply(register: (String, js.Function1[/* repeated */ js.Any, _]) => Unit): Helper = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[Helper]
  }
}

