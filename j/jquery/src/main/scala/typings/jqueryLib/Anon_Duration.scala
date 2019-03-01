package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration
  extends jqueryLib.JQueryNs._SpeedSettings[js.Any] {
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: jqueryLib.JQueryNs.Duration
}

object Anon_Duration {
  @scala.inline
  def apply(duration: jqueryLib.JQueryNs.Duration): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Duration]
  }
}

