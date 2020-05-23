package typings.lokijs

import typings.lokijs.anon.Found
import typings.lokijs.lokijsNumbers.`-1`
import typings.lokijs.lokijsNumbers.`0`
import typings.lokijs.lokijsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValueStore extends js.Object {
  var keys: js.Array[_]
  var values: js.Array[_]
  def bs(): js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found]
  def get(key: js.Any): js.Array[_]
  def set(key: js.Any, value: js.Any): Unit
  def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, _]): Unit
  def sort(a: js.Any, b: js.Any): `-1` | `0` | `1`
}

object KeyValueStore {
  @scala.inline
  def apply(
    bs: () => js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found],
    get: js.Any => js.Array[_],
    keys: js.Array[_],
    set: (js.Any, js.Any) => Unit,
    setSort: js.Function2[/* target */ js.Any, /* test */ js.Any, _] => Unit,
    sort: (js.Any, js.Any) => `-1` | `0` | `1`,
    values: js.Array[_]
  ): KeyValueStore = {
    val __obj = js.Dynamic.literal(bs = js.Any.fromFunction0(bs), get = js.Any.fromFunction1(get), keys = keys.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), setSort = js.Any.fromFunction1(setSort), sort = js.Any.fromFunction2(sort), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValueStore]
  }
}

