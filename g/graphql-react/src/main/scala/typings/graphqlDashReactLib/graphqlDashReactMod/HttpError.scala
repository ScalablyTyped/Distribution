package typings
package graphqlDashReactLib.graphqlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpError extends js.Object {
  var status: scala.Double
  var statusText: java.lang.String
}

object HttpError {
  @scala.inline
  def apply(status: scala.Double, statusText: java.lang.String): HttpError = {
    val __obj = js.Dynamic.literal(status = status, statusText = statusText)
  
    __obj.asInstanceOf[HttpError]
  }
}

