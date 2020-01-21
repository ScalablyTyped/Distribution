package typings.jquery

import typings.jquery.JQuery_.Duration
import typings.jquery.JQuery_._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration
  extends _SpeedSettings[js.Any] {
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: Duration
}

object AnonDuration {
  @scala.inline
  def apply(duration: Duration): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDuration]
  }
}

