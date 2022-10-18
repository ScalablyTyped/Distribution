package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phpInfoMod {
  
  @JSImport("locutus/php/info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertOptions(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assert_options")().asInstanceOf[Any]
  inline def assertOptions(what: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assert_options")(what.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def assertOptions(what: Any, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assert_options")(what.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def assertOptions(what: Unit, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assert_options")(what.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getenv(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getenv")().asInstanceOf[Any]
  inline def getenv(varname: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getenv")(varname.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def iniGet(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ini_get")().asInstanceOf[Any]
  inline def iniGet(varname: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ini_get")(varname.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def iniSet(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ini_set")().asInstanceOf[Any]
  inline def iniSet(varname: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ini_set")(varname.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def iniSet(varname: Any, newvalue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ini_set")(varname.asInstanceOf[js.Any], newvalue.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def iniSet(varname: Unit, newvalue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ini_set")(varname.asInstanceOf[js.Any], newvalue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setTimeLimit(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("set_time_limit")().asInstanceOf[Any]
  inline def setTimeLimit(seconds: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("set_time_limit")(seconds.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def versionCompare(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")().asInstanceOf[Any]
  inline def versionCompare(v1: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")(v1.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def versionCompare(v1: Any, v2: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def versionCompare(v1: Any, v2: Any, operator: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def versionCompare(v1: Any, v2: Unit, operator: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def versionCompare(v1: Unit, v2: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def versionCompare(v1: Unit, v2: Any, operator: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def versionCompare(v1: Unit, v2: Unit, operator: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Any]
}
