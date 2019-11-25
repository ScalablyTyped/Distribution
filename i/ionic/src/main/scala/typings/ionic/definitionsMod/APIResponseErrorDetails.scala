package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIResponseErrorDetails extends js.Object {
  var error_type: String
  var errors: js.Array[String]
  var parameter: String
}

object APIResponseErrorDetails {
  @scala.inline
  def apply(error_type: String, errors: js.Array[String], parameter: String): APIResponseErrorDetails = {
    val __obj = js.Dynamic.literal(error_type = error_type.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[APIResponseErrorDetails]
  }
}

