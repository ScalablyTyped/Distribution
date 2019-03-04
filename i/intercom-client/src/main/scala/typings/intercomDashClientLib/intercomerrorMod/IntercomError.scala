package typings
package intercomDashClientLib.intercomerrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntercomError extends js.Object {
  var body: intercomDashClientLib.Anon_Errorlist
  var headers: intercomDashClientLib.Anon_K
  var statusCode: scala.Double
}

object IntercomError {
  @scala.inline
  def apply(
    body: intercomDashClientLib.Anon_Errorlist,
    headers: intercomDashClientLib.Anon_K,
    statusCode: scala.Double
  ): IntercomError = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, statusCode = statusCode)
  
    __obj.asInstanceOf[IntercomError]
  }
}

