package typings.lib0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environment {
  
  @JSImport("lib0", "environment")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getConf(name: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getConf")(name.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getParam(name: String, defaultVal: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getParam")(name.asInstanceOf[js.Any], defaultVal.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getVariable(name: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getVariable")(name.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def hasConf(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasConf")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasParam(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasParam")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("lib0", "environment.isBrowser")
  @js.native
  val isBrowser: Boolean = js.native
  
  @JSImport("lib0", "environment.isMac")
  @js.native
  val isMac: Boolean = js.native
  
  @JSImport("lib0", "environment.isNode")
  @js.native
  val isNode: Boolean = js.native
  
  @JSImport("lib0", "environment.production")
  @js.native
  val production: Boolean = js.native
  
  @JSImport("lib0", "environment.supportsColor")
  @js.native
  val supportsColor: Boolean = js.native
}
