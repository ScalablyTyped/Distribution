package typings
package jsDashDataLib.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", "Index")
@js.native
class Index protected () extends js.Object {
  def this(fieldList: js.Array[java.lang.String]) = this()
  def this(fieldList: js.Array[java.lang.String], opts: js.Any) = this()
  var fieldGetter: js.Function = js.native
  var fieldList: js.Array[java.lang.String] = js.native
  @JSName("hashCode")
  var hashCode_FIndex: js.Function = js.native
  var isIndex: scala.Boolean = js.native
  var keys: js.Array[_] = js.native
  var values: js.Array[_] = js.native
  def _between(leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Array[_] = js.native
  def between(leftKeys: js.Any, rightKeys: js.Any): js.Array[_] = js.native
  def between(leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Array[_] = js.native
  def clear(): scala.Unit = js.native
  def get(keyList: js.Array[_]): js.Any = js.native
  def getAll(): js.Array[_] = js.native
  def insertRecord(data: js.Any): scala.Unit = js.native
  def peek(): js.Any = js.native
  def removeRecord(data: js.Any): js.Any = js.native
  def set(keyList: js.Array[_], value: js.Any): scala.Unit = js.native
  def updateRecord(data: js.Any): scala.Unit = js.native
  def visitAll(cb: js.Function): scala.Unit = js.native
  def visitAll(cb: js.Function, thisArg: js.Any): scala.Unit = js.native
}

