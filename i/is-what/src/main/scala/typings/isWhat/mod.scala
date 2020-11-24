package typings.isWhat

import org.scalablytyped.runtime.Instantiable1
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("is-what", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getType(payload: js.Any): String = js.native
  
  def isAnyObject(payload: js.Any): /* is std.Record<string, any> */ Boolean = js.native
  
  def isArray(payload: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  def isBlob(payload: js.Any): /* is std.Blob */ Boolean = js.native
  
  def isBoolean(payload: js.Any): /* is boolean */ Boolean = js.native
  
  def isDate(payload: js.Any): /* is std.Date */ Boolean = js.native
  
  def isEmptyArray(payload: js.Any): Boolean = js.native
  
  def isEmptyObject(payload: js.Any): Boolean = js.native
  
  def isEmptyString(payload: js.Any): /* is string */ Boolean = js.native
  
  def isError(payload: js.Any): /* is std.Error */ Boolean = js.native
  
  def isFile(payload: js.Any): /* is std.File */ Boolean = js.native
  
  def isFullArray(payload: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  def isFullString(payload: js.Any): /* is string */ Boolean = js.native
  
  def isFunction(payload: js.Any): /* is is-what.is-what.AnyFunction */ Boolean = js.native
  
  def isMap(payload: js.Any): /* is std.Map<any, any> */ Boolean = js.native
  
  def isNaNValue(payload: js.Any): /* is number */ Boolean = js.native
  
  def isNull(payload: js.Any): /* is null */ Boolean = js.native
  
  def isNullOrUndefined(payload: js.Any): Boolean = js.native
  
  def isNumber(payload: js.Any): /* is number */ Boolean = js.native
  
  def isObject(payload: js.Any): /* is std.Record<string, any> */ Boolean = js.native
  
  def isObjectLike[T /* <: Record[String, _] */](payload: js.Any): /* is T */ Boolean = js.native
  
  def isPlainObject(payload: js.Any): /* is std.Record<string, any> */ Boolean = js.native
  
  def isPrimitive(payload: js.Any): Boolean = js.native
  
  def isPromise(payload: js.Any): /* is std.Promise<any> */ Boolean = js.native
  
  def isRegExp(payload: js.Any): /* is std.RegExp */ Boolean = js.native
  
  def isSet(payload: js.Any): /* is std.Set<any> */ Boolean = js.native
  
  def isString(payload: js.Any): /* is string */ Boolean = js.native
  
  def isSymbol(payload: js.Any): /* is symbol */ Boolean = js.native
  
  def isType[T /* <: AnyFunction | AnyClass */](payload: js.Any, `type`: T): /* is T */ Boolean = js.native
  
  def isUndefined(payload: js.Any): /* is undefined */ Boolean = js.native
  
  def isWeakMap(payload: js.Any): /* is std.WeakMap<any, any> */ Boolean = js.native
  
  def isWeakSet(payload: js.Any): /* is std.WeakSet<any> */ Boolean = js.native
  
  type AnyAsyncFunction = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
  
  type AnyClass = Instantiable1[/* args (repeated) */ js.Any, js.Any]
  
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
