package typings.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvocationEvent extends js.Object {
  var floatingButton: String
  var none: String
  var screenshot: String
  var shake: String
  var twoFingersSwipe: String
}

object InvocationEvent {
  @scala.inline
  def apply(floatingButton: String, none: String, screenshot: String, shake: String, twoFingersSwipe: String): InvocationEvent = {
    val __obj = js.Dynamic.literal(floatingButton = floatingButton, none = none, screenshot = screenshot, shake = shake, twoFingersSwipe = twoFingersSwipe)
  
    __obj.asInstanceOf[InvocationEvent]
  }
}

