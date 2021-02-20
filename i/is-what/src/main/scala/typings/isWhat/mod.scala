package typings.isWhat

import org.scalablytyped.runtime.Instantiable1
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-what", "getType")
  @js.native
  def getType(payload: js.Any): String = js.native
  
  @JSImport("is-what", "isAnyObject")
  @js.native
  def isAnyObject(payload: js.Any): /* is std.Record<string, any> */ Boolean = js.native
  
  @JSImport("is-what", "isArray")
  @js.native
  def isArray(payload: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  @JSImport("is-what", "isBlob")
  @js.native
  def isBlob(payload: js.Any): /* is std.Blob */ Boolean = js.native
  
  @JSImport("is-what", "isBoolean")
  @js.native
  def isBoolean(payload: js.Any): /* is boolean */ Boolean = js.native
  
  @JSImport("is-what", "isDate")
  @js.native
  def isDate(payload: js.Any): /* is std.Date */ Boolean = js.native
  
  @JSImport("is-what", "isEmptyArray")
  @js.native
  def isEmptyArray(payload: js.Any): Boolean = js.native
  
  @JSImport("is-what", "isEmptyObject")
  @js.native
  def isEmptyObject(payload: js.Any): Boolean = js.native
  
  @JSImport("is-what", "isEmptyString")
  @js.native
  def isEmptyString(payload: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("is-what", "isError")
  @js.native
  def isError(payload: js.Any): /* is std.Error */ Boolean = js.native
  
  @JSImport("is-what", "isFile")
  @js.native
  def isFile(payload: js.Any): /* is std.File */ Boolean = js.native
  
  @JSImport("is-what", "isFullArray")
  @js.native
  def isFullArray(payload: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  @JSImport("is-what", "isFullString")
  @js.native
  def isFullString(payload: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("is-what", "isFunction")
  @js.native
  def isFunction(payload: js.Any): /* is is-what.is-what.AnyFunction */ Boolean = js.native
  
  @JSImport("is-what", "isMap")
  @js.native
  def isMap(payload: js.Any): /* is std.Map<any, any> */ Boolean = js.native
  
  @JSImport("is-what", "isNaNValue")
  @js.native
  def isNaNValue(payload: js.Any): /* is number */ Boolean = js.native
  
  @JSImport("is-what", "isNull")
  @js.native
  def isNull(payload: js.Any): /* is null */ Boolean = js.native
  
  @JSImport("is-what", "isNullOrUndefined")
  @js.native
  def isNullOrUndefined(payload: js.Any): Boolean = js.native
  
  @JSImport("is-what", "isNumber")
  @js.native
  def isNumber(payload: js.Any): /* is number */ Boolean = js.native
  
  @JSImport("is-what", "isObject")
  @js.native
  def isObject(payload: js.Any): /* is std.Record<string, any> */ Boolean = js.native
  
  @JSImport("is-what", "isObjectLike")
  @js.native
  def isObjectLike[T /* <: Record[String, _] */](payload: js.Any): /* is T */ Boolean = js.native
  
  @JSImport("is-what", "isPlainObject")
  @js.native
  def isPlainObject(payload: js.Any): /* is std.Record<string, any> */ Boolean = js.native
  
  @JSImport("is-what", "isPrimitive")
  @js.native
  def isPrimitive(payload: js.Any): Boolean = js.native
  
  @JSImport("is-what", "isPromise")
  @js.native
  def isPromise(payload: js.Any): /* is std.Promise<any> */ Boolean = js.native
  
  @JSImport("is-what", "isRegExp")
  @js.native
  def isRegExp(payload: js.Any): /* is std.RegExp */ Boolean = js.native
  
  @JSImport("is-what", "isSet")
  @js.native
  def isSet(payload: js.Any): /* is std.Set<any> */ Boolean = js.native
  
  @JSImport("is-what", "isString")
  @js.native
  def isString(payload: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("is-what", "isSymbol")
  @js.native
  def isSymbol(payload: js.Any): /* is symbol */ Boolean = js.native
  
  @JSImport("is-what", "isType")
  @js.native
  def isType[T /* <: AnyFunction | AnyClass */](payload: js.Any, `type`: T): /* is T */ Boolean = js.native
  
  @JSImport("is-what", "isUndefined")
  @js.native
  def isUndefined(payload: js.Any): /* is undefined */ Boolean = js.native
  
  @JSImport("is-what", "isWeakMap")
  @js.native
  def isWeakMap(payload: js.Any): /* is std.WeakMap<any, any> */ Boolean = js.native
  
  @JSImport("is-what", "isWeakSet")
  @js.native
  def isWeakSet(payload: js.Any): /* is std.WeakSet<any> */ Boolean = js.native
  
  type AnyAsyncFunction = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
  
  type AnyClass = Instantiable1[/* args (repeated) */ js.Any, js.Any]
  
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
