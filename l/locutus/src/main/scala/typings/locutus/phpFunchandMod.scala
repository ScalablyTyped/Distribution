package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phpFunchandMod {
  
  @JSImport("locutus/php/funchand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def callUserFunc(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("call_user_func")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def callUserFuncArray(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("call_user_func_array")().asInstanceOf[Any]
  inline def callUserFuncArray(cb: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("call_user_func_array")(cb.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def callUserFuncArray(cb: Any, parameters: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("call_user_func_array")(cb.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def callUserFuncArray(cb: Unit, parameters: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("call_user_func_array")(cb.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createFunction(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create_function")().asInstanceOf[Any]
  inline def createFunction(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create_function")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createFunction(args: Any, code: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create_function")(args.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createFunction(args: Unit, code: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create_function")(args.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def functionExists(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("function_exists")().asInstanceOf[Any]
  inline def functionExists(funcName: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("function_exists")(funcName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getDefinedFunctions(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get_defined_functions")().asInstanceOf[Any]
}
