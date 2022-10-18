package typings.ioredis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtUtilsDebugMod {
  
  @JSImport("ioredis/built/utils/debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(namespace: String): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(namespace.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  @JSImport("ioredis/built/utils/debug", "MAX_ARGUMENT_LENGTH")
  @js.native
  val MAX_ARGUMENT_LENGTH: /* 200 */ Double = js.native
  
  /**
    * helper function that redacts a string representation of a "debug" arg
    */
  inline def genRedactedString(str: String, maxLen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("genRedactedString")(str.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * helper function that tried to get a string value for
    * arbitrary "debug" arg
    */
  inline def getStringValue(v: Any): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringValue")(v.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
}
