package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoMod {
  
  @JSImport("locutus/php/info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assertOptions(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assert_options")().asInstanceOf[js.Any]
  @scala.inline
  def assertOptions(what: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assert_options")(what.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def assertOptions(what: js.Any, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assert_options")(what.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def assertOptions(what: Unit, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assert_options")(what.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getenv(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getenv")().asInstanceOf[js.Any]
  @scala.inline
  def getenv(varname: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getenv")(varname.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def iniGet(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ini_get")().asInstanceOf[js.Any]
  @scala.inline
  def iniGet(varname: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ini_get")(varname.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def iniSet(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ini_set")().asInstanceOf[js.Any]
  @scala.inline
  def iniSet(varname: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ini_set")(varname.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def iniSet(varname: js.Any, newvalue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ini_set")(varname.asInstanceOf[js.Any], newvalue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def iniSet(varname: Unit, newvalue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ini_set")(varname.asInstanceOf[js.Any], newvalue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def setTimeLimit(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("set_time_limit")().asInstanceOf[js.Any]
  @scala.inline
  def setTimeLimit(seconds: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("set_time_limit")(seconds.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def versionCompare(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")().asInstanceOf[js.Any]
  @scala.inline
  def versionCompare(v1: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")(v1.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def versionCompare(v1: js.Any, v2: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def versionCompare(v1: js.Any, v2: js.Any, operator: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def versionCompare(v1: js.Any, v2: Unit, operator: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def versionCompare(v1: Unit, v2: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def versionCompare(v1: Unit, v2: js.Any, operator: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def versionCompare(v1: Unit, v2: Unit, operator: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("version_compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
