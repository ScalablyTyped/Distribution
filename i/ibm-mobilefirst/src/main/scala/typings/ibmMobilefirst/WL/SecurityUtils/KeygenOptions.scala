package typings.ibmMobilefirst.WL.SecurityUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeygenOptions extends js.Object {
  var iterations: Double
  var password: String
  var salt: String
}

object KeygenOptions {
  @scala.inline
  def apply(iterations: Double, password: String, salt: String): KeygenOptions = {
    val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeygenOptions]
  }
}

