package typings
package isDashWhatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-what", JSImport.Namespace)
@js.native
object isDashWhatMod extends js.Object {
  def getType(payload: js.Any): java.lang.String = js.native
  def isAnyObject(payload: js.Any): scala.Boolean = js.native
  def isArray(payload: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
  def isBoolean(payload: js.Any): /* is boolean */ scala.Boolean = js.native
  def isDate(payload: js.Any): /* is std.Date */ scala.Boolean = js.native
  def isEmptyString(payload: js.Any): /* is string */ scala.Boolean = js.native
  def isFullString(payload: js.Any): /* is string */ scala.Boolean = js.native
  def isFunction(payload: js.Any): /* is std.Function */ scala.Boolean = js.native
  def isNull(payload: js.Any): /* is null */ scala.Boolean = js.native
  def isNumber(payload: js.Any): /* is number */ scala.Boolean = js.native
  def isObject(payload: js.Any): scala.Boolean = js.native
  def isObjectLike[T /* <: js.Object */](payload: js.Any): /* is T */ scala.Boolean = js.native
  def isPlainObject(payload: js.Any): scala.Boolean = js.native
  def isPrimitive(payload: js.Any): js.Any = js.native
  def isRegExp(payload: js.Any): /* is std.RegExp */ scala.Boolean = js.native
  def isString(payload: js.Any): /* is string */ scala.Boolean = js.native
  def isSymbol(payload: js.Any): /* is std.Symbol */ scala.Boolean = js.native
  def isType[T /* <: js.Function */](payload: js.Any, `type`: T): /* is T */ scala.Boolean = js.native
  def isUndefined(payload: js.Any): /* is undefined */ scala.Boolean = js.native
}

