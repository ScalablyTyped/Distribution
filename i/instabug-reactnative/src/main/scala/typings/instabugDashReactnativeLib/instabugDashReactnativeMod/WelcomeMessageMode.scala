package typings
package instabugDashReactnativeLib.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WelcomeMessageMode extends js.Object {
  var beta: java.lang.String
  var disabled: java.lang.String
  var live: java.lang.String
}

object WelcomeMessageMode {
  @scala.inline
  def apply(beta: java.lang.String, disabled: java.lang.String, live: java.lang.String): WelcomeMessageMode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beta")(beta)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("live")(live)
    __obj.asInstanceOf[WelcomeMessageMode]
  }
}

