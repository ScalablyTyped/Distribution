package typings
package jasmineDashNodeLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Env extends js.Object {
  var defaultTimeoutInterval: scala.Double
}

object Env {
  @scala.inline
  def apply(defaultTimeoutInterval: scala.Double): Env = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultTimeoutInterval")(defaultTimeoutInterval)
    __obj.asInstanceOf[Env]
  }
}

