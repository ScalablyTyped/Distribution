package typings.lokijs

import typings.lokijs.lokijsNumbers.`-1`
import typings.lokijs.lokijsNumbers.`0`
import typings.lokijs.lokijsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SortedIndex")
@js.native
class SortedIndex protected () extends js.Object {
  def this(sortedField: String) = this()
  var field: String = js.native
  var keys: js.Array[_] = js.native
  var values: js.Array[_] = js.native
  def bs(): js.Function2[/* array */ js.Array[_], /* item */ js.Any, Anon_Found] = js.native
  // clear will zap the index
  def clear(): Unit = js.native
  // get all values which have a key == the given key
  def get(key: js.Any): js.Array[_] = js.native
  // get all vals from start to end
  def getAll(key: js.Any, start: Double, end: Double): js.Array[_] = js.native
  // get all values which have a key > the given key
  def getGt(key: js.Any): js.Array[_] = js.native
  // get all values which have a key < the given key
  def getLt(key: js.Any): js.Array[_] = js.native
  // just in case someone wants to do something smart with ranges
  def getPos(key: js.Any): Anon_Found = js.native
  // remove the value from the index, if the value was the last one, remove the key
  def remove(key: js.Any, value: js.Any): Unit = js.native
  // add the value you want returned  to the key in the index
  def set(key: js.Any, value: js.Any): Unit = js.native
  // and allow override of the default sort
  def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, Double]): Unit = js.native
  // set the default sort
  def sort(a: js.Any, b: js.Any): `-1` | `0` | `1` = js.native
}

