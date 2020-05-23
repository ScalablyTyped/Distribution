package typings.lokijs.global

import typings.lokijs.anon.Found
import typings.lokijs.lokijsNumbers.`-1`
import typings.lokijs.lokijsNumbers.`0`
import typings.lokijs.lokijsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("_KeyValueStore")
@js.native
class _KeyValueStore ()
  extends typings.lokijs.KeyValueStore {
  /* CompleteClass */
  override var keys: js.Array[_] = js.native
  /* CompleteClass */
  override var values: js.Array[_] = js.native
  /* CompleteClass */
  override def bs(): js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found] = js.native
  /* CompleteClass */
  override def get(key: js.Any): js.Array[_] = js.native
  /* CompleteClass */
  override def set(key: js.Any, value: js.Any): Unit = js.native
  /* CompleteClass */
  override def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, _]): Unit = js.native
  /* CompleteClass */
  override def sort(a: js.Any, b: js.Any): `-1` | `0` | `1` = js.native
}

