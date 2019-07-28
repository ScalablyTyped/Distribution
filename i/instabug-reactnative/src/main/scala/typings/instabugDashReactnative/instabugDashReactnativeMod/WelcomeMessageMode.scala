package typings.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WelcomeMessageMode extends js.Object {
  var beta: String
  var disabled: String
  var live: String
}

object WelcomeMessageMode {
  @scala.inline
  def apply(beta: String, disabled: String, live: String): WelcomeMessageMode = {
    val __obj = js.Dynamic.literal(beta = beta, disabled = disabled, live = live)
  
    __obj.asInstanceOf[WelcomeMessageMode]
  }
}

