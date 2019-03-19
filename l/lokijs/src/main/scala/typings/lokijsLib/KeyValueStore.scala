package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("KeyValueStore")
@js.native
class KeyValueStore () extends js.Object {
  var keys: js.Array[_] = js.native
  var values: js.Array[_] = js.native
  def bs(): js.Function2[/* array */ js.Array[_], /* item */ js.Any, Anon_Found] = js.native
  def get(key: js.Any): js.Array[_] = js.native
  def set(key: js.Any, value: js.Any): scala.Unit = js.native
  def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, _]): scala.Unit = js.native
  def sort(a: js.Any, b: js.Any): lokijsLib.lokijsLibNumbers.`-1` | lokijsLib.lokijsLibNumbers.`0` | lokijsLib.lokijsLibNumbers.`1` = js.native
}

