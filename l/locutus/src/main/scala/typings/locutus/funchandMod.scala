package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object funchandMod {
  
  @JSImport("locutus/php/funchand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def callUserFunc(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("call_user_func")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def callUserFuncArray(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("call_user_func_array")().asInstanceOf[js.Any]
  inline def callUserFuncArray(cb: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("call_user_func_array")(cb.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def callUserFuncArray(cb: js.Any, parameters: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("call_user_func_array")(cb.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def callUserFuncArray(cb: Unit, parameters: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("call_user_func_array")(cb.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def createFunction(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create_function")().asInstanceOf[js.Any]
  inline def createFunction(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create_function")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def createFunction(args: js.Any, code: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create_function")(args.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def createFunction(args: Unit, code: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create_function")(args.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def functionExists(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("function_exists")().asInstanceOf[js.Any]
  inline def functionExists(funcName: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("function_exists")(funcName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getDefinedFunctions(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get_defined_functions")().asInstanceOf[js.Any]
}
