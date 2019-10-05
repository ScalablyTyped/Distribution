package typings.jsplumb.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsplumb", "jsPlumbUtil")
@js.native
object jsPlumbUtil extends js.Object {
  def addWithFunction(list: js.Array[_], item: js.Any, fn: js.Function1[/* obj */ js.Any, Boolean]): Unit = js.native
  def extend(target: js.Object, source: js.Object): js.Any = js.native
  def fastTrim(s: String): String = js.native
  def findWithFunction(list: js.Array[_], fn: js.Function1[/* obj */ js.Any, Boolean]): Double = js.native
  def isArray(obj: js.Any): Boolean = js.native
  def isBoolean(obj: js.Any): Boolean = js.native
  def isDate(obj: js.Any): Boolean = js.native
  def isEmpty(obj: js.Any): Boolean = js.native
  def isFunction(obj: js.Any): Boolean = js.native
  def isNamedFunction(obj: js.Any): Boolean = js.native
  def isNull(obj: js.Any): Boolean = js.native
  def isNumber(obj: js.Any): Boolean = js.native
  def isObject(obj: js.Any): Boolean = js.native
  def isString(obj: js.Any): Boolean = js.native
  def removeWithFunction(list: js.Array[_], fn: js.Function1[/* obj */ js.Any, Boolean]): Double = js.native
  def suggest(list: js.Array[_], item: js.Any): Boolean = js.native
  def suggest(list: js.Array[_], item: js.Any, insertAtHead: Boolean): Boolean = js.native
  def uuid(): UUID = js.native
}

