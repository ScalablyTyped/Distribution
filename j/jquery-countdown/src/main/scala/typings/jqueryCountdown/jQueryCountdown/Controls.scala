package typings.jqueryCountdown.jQueryCountdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jqueryCountdown.jqueryCountdownStrings.start
  - typings.jqueryCountdown.jqueryCountdownStrings.stop
  - typings.jqueryCountdown.jqueryCountdownStrings.pause
  - typings.jqueryCountdown.jqueryCountdownStrings.resume
*/
trait Controls extends js.Object

object Controls {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pause: typings.jqueryCountdown.jqueryCountdownStrings.pause = this.cast("pause")
  @scala.inline
  def resume: typings.jqueryCountdown.jqueryCountdownStrings.resume = this.cast("resume")
  @scala.inline
  def start: typings.jqueryCountdown.jqueryCountdownStrings.start = this.cast("start")
  @scala.inline
  def stop: typings.jqueryCountdown.jqueryCountdownStrings.stop = this.cast("stop")
}

