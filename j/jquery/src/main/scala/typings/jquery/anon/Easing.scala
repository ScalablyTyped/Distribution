package typings.jquery.anon

import typings.jquery.JQuery._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Easing
  extends _SpeedSettings[js.Any] {
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: String = js.native
}

object Easing {
  @scala.inline
  def apply(easing: String): Easing = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easing]
  }
  @scala.inline
  implicit class EasingOps[Self <: Easing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
  }
  
}

