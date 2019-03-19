package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SortedIndex")
@js.native
class SortedIndex protected () extends js.Object {
  def this(sortedField: java.lang.String) = this()
  var field: java.lang.String = js.native
  var keys: js.Array[_] = js.native
  var values: js.Array[_] = js.native
  def bs(): js.Function2[/* array */ js.Array[_], /* item */ js.Any, Anon_Found] = js.native
  // clear will zap the index
  def clear(): scala.Unit = js.native
  // get all values which have a key == the given key
  def get(key: js.Any): js.Array[_] = js.native
  // get all vals from start to end
  def getAll(key: js.Any, start: scala.Double, end: scala.Double): js.Array[_] = js.native
  // get all values which have a key > the given key
  def getGt(key: js.Any): js.Array[_] = js.native
  // get all values which have a key < the given key
  def getLt(key: js.Any): js.Array[_] = js.native
  // just in case someone wants to do something smart with ranges
  def getPos(key: js.Any): Anon_Found = js.native
  // remove the value from the index, if the value was the last one, remove the key
  def remove(key: js.Any, value: js.Any): scala.Unit = js.native
  // add the value you want returned  to the key in the index
  def set(key: js.Any, value: js.Any): scala.Unit = js.native
  // and allow override of the default sort
  def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, scala.Double]): scala.Unit = js.native
  // set the default sort
  def sort(a: js.Any, b: js.Any): lokijsLib.lokijsLibNumbers.`-1` | lokijsLib.lokijsLibNumbers.`0` | lokijsLib.lokijsLibNumbers.`1` = js.native
}

