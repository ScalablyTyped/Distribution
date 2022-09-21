package typings.isWhat

import org.scalablytyped.runtime.Instantiable1
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-what", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getType(payload: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(payload.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAnyObject(payload: Any): /* is is-what.is-what.PlainObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyObject")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is is-what.is-what.PlainObject */ Boolean]
  
  inline def isArray(payload: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isBlob(payload: Any): /* is std.Blob */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlob")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is std.Blob */ Boolean]
  
  inline def isBoolean(payload: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isDate(payload: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isEmptyArray(payload: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyArray")(payload.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmptyObject(payload: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyObject")(payload.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmptyString(payload: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyString")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isError(payload: Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  inline def isFile(payload: Any): /* is std.File */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is std.File */ Boolean]
  
  inline def isFullArray(payload: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullArray")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isFullObject(payload: Any): /* is is-what.is-what.PlainObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullObject")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is is-what.is-what.PlainObject */ Boolean]
  
  inline def isFullString(payload: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullString")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isFunction(payload: Any): /* is is-what.is-what.AnyFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is is-what.is-what.AnyFunction */ Boolean]
  
  inline def isMap(payload: Any): /* is std.Map<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is std.Map<any, any> */ Boolean]
  
  inline def isNaNValue(payload: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaNValue")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isNegativeNumber(payload: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegativeNumber")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isNull(payload: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  @JSImport("is-what", "isNullOrUndefined")
  @js.native
  val isNullOrUndefined: TypeGuard[Any, js.UndefOr[Null]] = js.native
  
  inline def isNumber(payload: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isObject(payload: Any): /* is is-what.is-what.PlainObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is is-what.is-what.PlainObject */ Boolean]
  
  inline def isObjectLike[T /* <: PlainObject */](payload: Any): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectLike")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isOneOf[A, B /* <: A */, C /* <: A */](a: TypeGuard[A, B], b: TypeGuard[A, C]): TypeGuard[A, B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[TypeGuard[A, B | C]]
  inline def isOneOf[A, B /* <: A */, C /* <: A */, D /* <: A */](a: TypeGuard[A, B], b: TypeGuard[A, C], c: TypeGuard[A, D]): TypeGuard[A, B | C | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[TypeGuard[A, B | C | D]]
  inline def isOneOf[A, B /* <: A */, C /* <: A */, D /* <: A */, E /* <: A */](a: TypeGuard[A, B], b: TypeGuard[A, C], c: TypeGuard[A, D], d: TypeGuard[A, E]): TypeGuard[A, B | C | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[TypeGuard[A, B | C | D | E]]
  inline def isOneOf[A, B /* <: A */, C /* <: A */, D /* <: A */, E /* <: A */, F /* <: A */](a: TypeGuard[A, B], b: TypeGuard[A, C], c: TypeGuard[A, D], d: TypeGuard[A, E], e: TypeGuard[A, F]): TypeGuard[A, B | C | D | E | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[TypeGuard[A, B | C | D | E | F]]
  
  inline def isPlainObject(payload: Any): /* is is-what.is-what.PlainObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is is-what.is-what.PlainObject */ Boolean]
  
  inline def isPositiveNumber(payload: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositiveNumber")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isPrimitive(payload: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(payload.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPromise(payload: Any): /* is std.Promise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<any> */ Boolean]
  
  inline def isRegExp(payload: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isSet(payload: Any): /* is std.Set<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is std.Set<any> */ Boolean]
  
  inline def isString(payload: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isSymbol(payload: Any): /* is symbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is symbol */ Boolean]
  
  inline def isType[T /* <: AnyFunction | AnyClass */](payload: Any, `type`: T): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(payload.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  inline def isUndefined(payload: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def isWeakMap(payload: Any): /* is std.WeakMap<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeakMap")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is std.WeakMap<any, any> */ Boolean]
  
  inline def isWeakSet(payload: Any): /* is std.WeakSet<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeakSet")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is std.WeakSet<any> */ Boolean]
  
  @js.native
  trait AnyAsyncFunction extends StObject {
    
    def apply(args: Any*): js.Promise[Any] = js.native
  }
  
  type AnyClass = Instantiable1[/* args (repeated) */ Any, Any]
  
  @js.native
  trait AnyFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  type PlainObject = Record[String | Double | js.Symbol, Any]
  
  type TypeGuard[A, B /* <: A */] = js.Function1[/* payload */ A, /* is B */ Boolean]
}
