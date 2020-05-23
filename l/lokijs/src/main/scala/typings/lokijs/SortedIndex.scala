package typings.lokijs

import typings.lokijs.anon.Found
import typings.lokijs.lokijsNumbers.`-1`
import typings.lokijs.lokijsNumbers.`0`
import typings.lokijs.lokijsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortedIndex extends js.Object {
  var field: String
  var keys: js.Array[_]
  var values: js.Array[_]
  def bs(): js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found]
  // clear will zap the index
  def clear(): Unit
  // get all values which have a key == the given key
  def get(key: js.Any): js.Array[_]
  // get all vals from start to end
  def getAll(key: js.Any, start: Double, end: Double): js.Array[_]
  // get all values which have a key > the given key
  def getGt(key: js.Any): js.Array[_]
  // get all values which have a key < the given key
  def getLt(key: js.Any): js.Array[_]
  // just in case someone wants to do something smart with ranges
  def getPos(key: js.Any): Found
  // remove the value from the index, if the value was the last one, remove the key
  def remove(key: js.Any, value: js.Any): Unit
  // add the value you want returned  to the key in the index
  def set(key: js.Any, value: js.Any): Unit
  // and allow override of the default sort
  def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, Double]): Unit
  // set the default sort
  def sort(a: js.Any, b: js.Any): `-1` | `0` | `1`
}

object SortedIndex {
  @scala.inline
  def apply(
    bs: () => js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found],
    clear: () => Unit,
    field: String,
    get: js.Any => js.Array[_],
    getAll: (js.Any, Double, Double) => js.Array[_],
    getGt: js.Any => js.Array[_],
    getLt: js.Any => js.Array[_],
    getPos: js.Any => Found,
    keys: js.Array[_],
    remove: (js.Any, js.Any) => Unit,
    set: (js.Any, js.Any) => Unit,
    setSort: js.Function2[/* target */ js.Any, /* test */ js.Any, Double] => Unit,
    sort: (js.Any, js.Any) => `-1` | `0` | `1`,
    values: js.Array[_]
  ): SortedIndex = {
    val __obj = js.Dynamic.literal(bs = js.Any.fromFunction0(bs), clear = js.Any.fromFunction0(clear), field = field.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction3(getAll), getGt = js.Any.fromFunction1(getGt), getLt = js.Any.fromFunction1(getLt), getPos = js.Any.fromFunction1(getPos), keys = keys.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set), setSort = js.Any.fromFunction1(setSort), sort = js.Any.fromFunction2(sort), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortedIndex]
  }
}

