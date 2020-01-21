package typings.lokijs

import typings.lokijs.lokijsNumbers.`-1`
import typings.lokijs.lokijsNumbers.`0`
import typings.lokijs.lokijsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("KeyValueStore")
@js.native
class KeyValueStore () extends js.Object {
  var keys: js.Array[_] = js.native
  var values: js.Array[_] = js.native
  def bs(): js.Function2[/* array */ js.Array[_], /* item */ js.Any, AnonFound] = js.native
  def get(key: js.Any): js.Array[_] = js.native
  def set(key: js.Any, value: js.Any): Unit = js.native
  def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, _]): Unit = js.native
  def sort(a: js.Any, b: js.Any): `-1` | `0` | `1` = js.native
}

