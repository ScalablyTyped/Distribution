package typings
package ibmDashMobilefirstLib.WLNs.SecurityUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeygenOptions extends js.Object {
  var iterations: scala.Double
  var password: java.lang.String
  var salt: java.lang.String
}

object KeygenOptions {
  @scala.inline
  def apply(iterations: scala.Double, password: java.lang.String, salt: java.lang.String): KeygenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iterations")(iterations)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("salt")(salt)
    __obj.asInstanceOf[KeygenOptions]
  }
}

