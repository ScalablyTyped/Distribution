package typings.jquery.anon

import typings.jquery.JQuery._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration
  extends _SpeedSettings[js.Any] {
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: typings.jquery.JQuery.Duration
}

object Duration {
  @scala.inline
  def apply(duration: typings.jquery.JQuery.Duration): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

