package typings.iabDashVpaid.iab.vpaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The vpaid view mode set on init or on resize */
/* Rewritten from type alias, can be one of: 
  - typings.iabDashVpaid.iabDashVpaidStrings.normal
  - typings.iabDashVpaid.iabDashVpaidStrings.thumbnail
  - typings.iabDashVpaid.iabDashVpaidStrings.fullscreen
*/
trait ViewMode extends js.Object

object ViewMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fullscreen: typings.iabDashVpaid.iabDashVpaidStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def normal: typings.iabDashVpaid.iabDashVpaidStrings.normal = this.cast("normal")
  @scala.inline
  def thumbnail: typings.iabDashVpaid.iabDashVpaidStrings.thumbnail = this.cast("thumbnail")
}

