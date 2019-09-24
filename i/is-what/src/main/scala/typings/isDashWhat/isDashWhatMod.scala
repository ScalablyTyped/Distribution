package typings.isDashWhat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-what", JSImport.Namespace)
@js.native
object isDashWhatMod extends js.Object {
  def getType(payload: js.Any): String = js.native
  def isAnyObject(payload: js.Any): Boolean = js.native
  def isArray(payload: js.Any): /* is std.Array<any> */ Boolean = js.native
  def isBoolean(payload: js.Any): /* is boolean */ Boolean = js.native
  def isDate(payload: js.Any): /* is std.Date */ Boolean = js.native
  def isEmptyString(payload: js.Any): /* is string */ Boolean = js.native
  def isFullString(payload: js.Any): /* is string */ Boolean = js.native
  def isFunction(payload: js.Any): /* is std.Function */ Boolean = js.native
  def isNull(payload: js.Any): /* is null */ Boolean = js.native
  def isNumber(payload: js.Any): /* is number */ Boolean = js.native
  def isObject(payload: js.Any): Boolean = js.native
  def isObjectLike[T /* <: js.Object */](payload: js.Any): /* is T */ Boolean = js.native
  def isPlainObject(payload: js.Any): Boolean = js.native
  def isPrimitive(payload: js.Any): Boolean = js.native
  def isRegExp(payload: js.Any): /* is std.RegExp */ Boolean = js.native
  def isString(payload: js.Any): /* is string */ Boolean = js.native
  def isSymbol(payload: js.Any): /* is symbol */ Boolean = js.native
  def isType[T /* <: js.Function */](payload: js.Any, `type`: T): /* is T */ Boolean = js.native
  def isUndefined(payload: js.Any): /* is undefined */ Boolean = js.native
}

