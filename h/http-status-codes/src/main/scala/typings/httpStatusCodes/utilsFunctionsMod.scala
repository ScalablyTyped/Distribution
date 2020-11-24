package typings.httpStatusCodes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-status-codes/build/cjs/utils-functions", JSImport.Namespace)
@js.native
object utilsFunctionsMod extends js.Object {
  
  def getReasonPhrase(statusCode: String): String = js.native
  def getReasonPhrase(statusCode: Double): String = js.native
  
  def getStatusCode(reasonPhrase: String): Double = js.native
  
  val getStatusText: js.Function1[/* statusCode */ Double | String, String] = js.native
}
