package typings.jsData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-data", "Index")
@js.native
class Index protected () extends js.Object {
  def this(fieldList: js.Array[String]) = this()
  def this(fieldList: js.Array[String], opts: js.Any) = this()
  
  def _between(leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Array[_] = js.native
  
  def between(leftKeys: js.Any, rightKeys: js.Any): js.Array[_] = js.native
  def between(leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Array[_] = js.native
  
  def clear(): Unit = js.native
  
  var fieldGetter: js.Function = js.native
  
  var fieldList: js.Array[String] = js.native
  
  def get(keyList: js.Array[_]): js.Any = js.native
  
  def getAll(): js.Array[_] = js.native
  
  @JSName("hashCode")
  var hashCode_FIndex: js.Function = js.native
  
  def insertRecord(data: js.Any): Unit = js.native
  
  var isIndex: Boolean = js.native
  
  var keys: js.Array[_] = js.native
  
  def peek(): js.Any = js.native
  
  def removeRecord(data: js.Any): js.Any = js.native
  
  def set(keyList: js.Array[_], value: js.Any): Unit = js.native
  
  def updateRecord(data: js.Any): Unit = js.native
  
  var values: js.Array[_] = js.native
  
  def visitAll(cb: js.Function): Unit = js.native
  def visitAll(cb: js.Function, thisArg: js.Any): Unit = js.native
}
