package typings.jquery

import typings.jquery.JQuery_._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEasing
  extends _SpeedSettings[js.Any] {
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: String
}

object AnonEasing {
  @scala.inline
  def apply(easing: String): AnonEasing = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEasing]
  }
}

