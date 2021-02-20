package typings.httpStatusCodes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsFunctionsMod {
  
  @JSImport("http-status-codes/build/cjs/utils-functions", "getReasonPhrase")
  @js.native
  def getReasonPhrase(statusCode: String): String = js.native
  @JSImport("http-status-codes/build/cjs/utils-functions", "getReasonPhrase")
  @js.native
  def getReasonPhrase(statusCode: Double): String = js.native
  
  @JSImport("http-status-codes/build/cjs/utils-functions", "getStatusCode")
  @js.native
  def getStatusCode(reasonPhrase: String): Double = js.native
  
  @JSImport("http-status-codes/build/cjs/utils-functions", "getStatusText")
  @js.native
  val getStatusText: js.Function1[/* statusCode */ Double | String, String] = js.native
}
