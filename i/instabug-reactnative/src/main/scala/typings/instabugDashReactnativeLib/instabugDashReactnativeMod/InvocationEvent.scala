package typings
package instabugDashReactnativeLib.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvocationEvent extends js.Object {
  var floatingButton: java.lang.String
  var none: java.lang.String
  var screenshot: java.lang.String
  var shake: java.lang.String
  var twoFingersSwipe: java.lang.String
}

object InvocationEvent {
  @scala.inline
  def apply(
    floatingButton: java.lang.String,
    none: java.lang.String,
    screenshot: java.lang.String,
    shake: java.lang.String,
    twoFingersSwipe: java.lang.String
  ): InvocationEvent = {
    val __obj = js.Dynamic.literal(floatingButton = floatingButton, none = none, screenshot = screenshot, shake = shake, twoFingersSwipe = twoFingersSwipe)
  
    __obj.asInstanceOf[InvocationEvent]
  }
}

