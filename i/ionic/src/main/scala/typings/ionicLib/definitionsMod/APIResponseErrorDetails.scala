package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIResponseErrorDetails extends js.Object {
  var error_type: java.lang.String
  var errors: js.Array[java.lang.String]
  var parameter: java.lang.String
}

object APIResponseErrorDetails {
  @scala.inline
  def apply(error_type: java.lang.String, errors: js.Array[java.lang.String], parameter: java.lang.String): APIResponseErrorDetails = {
    val __obj = js.Dynamic.literal(error_type = error_type, errors = errors, parameter = parameter)
  
    __obj.asInstanceOf[APIResponseErrorDetails]
  }
}

