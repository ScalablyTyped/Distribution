package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsplumb", "jsPlumbUtil")
@js.native
object jsPlumbUtilNs extends js.Object {
  def addWithFunction(list: js.Array[_], item: js.Any, fn: js.Function1[/* obj */ js.Any, scala.Boolean]): scala.Unit = js.native
  def extend(target: js.Object, source: js.Object): js.Any = js.native
  def fastTrim(s: java.lang.String): java.lang.String = js.native
  def findWithFunction(list: js.Array[_], fn: js.Function1[/* obj */ js.Any, scala.Boolean]): scala.Double = js.native
  def isArray(obj: js.Any): scala.Boolean = js.native
  def isBoolean(obj: js.Any): scala.Boolean = js.native
  def isDate(obj: js.Any): scala.Boolean = js.native
  def isEmpty(obj: js.Any): scala.Boolean = js.native
  def isFunction(obj: js.Any): scala.Boolean = js.native
  def isNamedFunction(obj: js.Any): scala.Boolean = js.native
  def isNull(obj: js.Any): scala.Boolean = js.native
  def isNumber(obj: js.Any): scala.Boolean = js.native
  def isObject(obj: js.Any): scala.Boolean = js.native
  def isString(obj: js.Any): scala.Boolean = js.native
  def removeWithFunction(list: js.Array[_], fn: js.Function1[/* obj */ js.Any, scala.Boolean]): scala.Double = js.native
  def suggest(list: js.Array[_], item: js.Any): scala.Boolean = js.native
  def suggest(list: js.Array[_], item: js.Any, insertAtHead: scala.Boolean): scala.Boolean = js.native
  def uuid(): jsplumbLib.jsplumbMod.jsPlumbNs.UUID = js.native
}

