package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipSettings extends ISettings {
  var DefaultSkip: Double = js.native
  var Skip: Double = js.native
}

object SkipSettings {
  @scala.inline
  def apply(DefaultSkip: Double, Skip: Double, isSet: () => Boolean, reset: () => Unit): SkipSettings = {
    val __obj = js.Dynamic.literal(DefaultSkip = DefaultSkip.asInstanceOf[js.Any], Skip = Skip.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[SkipSettings]
  }
  @scala.inline
  implicit class SkipSettingsOps[Self <: SkipSettings] (val x: Self) extends AnyVal {
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
    def setDefaultSkip(value: Double): Self = this.set("DefaultSkip", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkip(value: Double): Self = this.set("Skip", value.asInstanceOf[js.Any])
  }
  
}

