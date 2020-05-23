package typings.hexo.mod.extend

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Helper extends js.Object {
  def get(name: String): js.UndefOr[js.Function1[/* repeated */ js.Any, _]]
  def list(): StringDictionary[js.Function1[/* repeated */ js.Any, _]]
  def register(name: String, fn: js.Function1[/* repeated */ js.Any, _]): Unit
}

object Helper {
  @scala.inline
  def apply(
    get: String => js.UndefOr[js.Function1[/* repeated */ js.Any, _]],
    list: () => StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    register: (String, js.Function1[/* repeated */ js.Any, _]) => Unit
  ): Helper = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list), register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Helper]
  }
}

