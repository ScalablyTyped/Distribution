package typings.matrixJsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomstringMod {
  
  @JSImport("matrix-js-sdk/lib/randomstring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def randomString(len: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(len.asInstanceOf[js.Any]).asInstanceOf[String]
}
