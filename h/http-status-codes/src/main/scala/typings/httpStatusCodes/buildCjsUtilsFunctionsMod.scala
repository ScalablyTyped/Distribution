package typings.httpStatusCodes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCjsUtilsFunctionsMod {
  
  @JSImport("http-status-codes/build/cjs/utils-functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getReasonPhrase(statusCode: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getReasonPhrase")(statusCode.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getReasonPhrase(statusCode: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getReasonPhrase")(statusCode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getStatusCode(reasonPhrase: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusCode")(reasonPhrase.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("http-status-codes/build/cjs/utils-functions", "getStatusText")
  @js.native
  val getStatusText: js.Function1[/* statusCode */ Double | String, String] = js.native
}
