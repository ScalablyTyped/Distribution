package typings.infernoShared

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inferno-shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("inferno-shared", "ERROR_MSG")
  @js.native
  val ERROR_MSG: /* "a runtime error occured! Use Inferno in development environment to find the error." */ String = js.native
  
  inline def combineFrom(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("combineFrom")().asInstanceOf[js.Object]
  inline def combineFrom(first: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("combineFrom")(first.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def combineFrom(first: js.Object, second: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("combineFrom")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def combineFrom(first: Null, second: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("combineFrom")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def isArray(arg: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isFunction(o: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(o.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isInvalid(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInvalid")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNull(o: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(o.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isNullOrUndef(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndef")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(o: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(o.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isString(o: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(o.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isStringOrNumber(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringOrNumber")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUndefined(o: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(o.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def throwError(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")().asInstanceOf[Unit]
  inline def throwError(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warning(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
