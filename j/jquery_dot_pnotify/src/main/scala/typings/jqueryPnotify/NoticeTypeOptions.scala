package typings.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jqueryPnotify.jqueryPnotifyStrings.notice
  - typings.jqueryPnotify.jqueryPnotifyStrings.info
  - typings.jqueryPnotify.jqueryPnotifyStrings.success
  - typings.jqueryPnotify.jqueryPnotifyStrings.error
*/
trait NoticeTypeOptions extends js.Object

object NoticeTypeOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.jqueryPnotify.jqueryPnotifyStrings.error = this.cast("error")
  @scala.inline
  def info: typings.jqueryPnotify.jqueryPnotifyStrings.info = this.cast("info")
  @scala.inline
  def notice: typings.jqueryPnotify.jqueryPnotifyStrings.notice = this.cast("notice")
  @scala.inline
  def success: typings.jqueryPnotify.jqueryPnotifyStrings.success = this.cast("success")
}

