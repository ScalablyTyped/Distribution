package typings.jqueryCountdown.jQueryCountdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jqueryCountdown.jqueryCountdownStrings.updateDotcountdown
  - typings.jqueryCountdown.jqueryCountdownStrings.finishDotcountdown
  - typings.jqueryCountdown.jqueryCountdownStrings.stopDotcountdown
*/
trait Methods extends js.Object

object Methods {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def finishDotcountdown: typings.jqueryCountdown.jqueryCountdownStrings.finishDotcountdown = this.cast("finish.countdown")
  @scala.inline
  def stopDotcountdown: typings.jqueryCountdown.jqueryCountdownStrings.stopDotcountdown = this.cast("stop.countdown")
  @scala.inline
  def updateDotcountdown: typings.jqueryCountdown.jqueryCountdownStrings.updateDotcountdown = this.cast("update.countdown")
}

