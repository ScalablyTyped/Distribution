package typings.jquery.anon

import typings.jquery.JQuery._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duration
  extends _SpeedSettings[js.Any] {
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: typings.jquery.JQuery.Duration = js.native
}

object Duration {
  @scala.inline
  def apply(duration: typings.jquery.JQuery.Duration): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
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
    def setDuration(value: typings.jquery.JQuery.Duration): Self = this.set("duration", value.asInstanceOf[js.Any])
  }
  
}

