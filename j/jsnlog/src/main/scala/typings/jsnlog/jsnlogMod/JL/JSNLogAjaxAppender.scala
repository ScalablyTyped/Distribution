package typings.jsnlog.jsnlogMod.JL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSNLogAjaxAppender extends JSNLogAppender {
  @JSName("setOptions")
  var setOptions_JSNLogAjaxAppender: js.UndefOr[js.Function1[/* options */ JSNLogAjaxAppenderOptions, JSNLogAjaxAppender]] = js.undefined
}

object JSNLogAjaxAppender {
  @scala.inline
  def apply(
    sendBatch: () => Unit = null,
    setOptions: /* options */ JSNLogAjaxAppenderOptions => JSNLogAjaxAppender = null
  ): JSNLogAjaxAppender = {
    val __obj = js.Dynamic.literal()
    if (sendBatch != null) __obj.updateDynamic("sendBatch")(js.Any.fromFunction0(sendBatch))
    if (setOptions != null) __obj.updateDynamic("setOptions")(js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[JSNLogAjaxAppender]
  }
}

