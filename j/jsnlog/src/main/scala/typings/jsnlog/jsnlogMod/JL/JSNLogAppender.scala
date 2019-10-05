package typings.jsnlog.jsnlogMod.JL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// setOptions and sendBatch have to be optional, so you can use a Winston transport as
// as a JSNLogAppender
trait JSNLogAppender extends js.Object {
  var sendBatch: js.UndefOr[js.Function0[Unit]] = js.undefined
  var setOptions: js.UndefOr[js.Function1[/* options */ JSNLogAppenderOptions, JSNLogAppender]] = js.undefined
}

object JSNLogAppender {
  @scala.inline
  def apply(
    sendBatch: () => Unit = null,
    setOptions: /* options */ JSNLogAppenderOptions => JSNLogAppender = null
  ): JSNLogAppender = {
    val __obj = js.Dynamic.literal()
    if (sendBatch != null) __obj.updateDynamic("sendBatch")(js.Any.fromFunction0(sendBatch))
    if (setOptions != null) __obj.updateDynamic("setOptions")(js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[JSNLogAppender]
  }
}

