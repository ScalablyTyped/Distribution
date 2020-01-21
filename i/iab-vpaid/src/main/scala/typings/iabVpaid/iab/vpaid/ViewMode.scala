package typings.iabVpaid.iab.vpaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The vpaid view mode set on init or on resize */
/* Rewritten from type alias, can be one of: 
  - typings.iabVpaid.iabVpaidStrings.normal
  - typings.iabVpaid.iabVpaidStrings.thumbnail
  - typings.iabVpaid.iabVpaidStrings.fullscreen
*/
trait ViewMode extends js.Object

object ViewMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fullscreen: typings.iabVpaid.iabVpaidStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def normal: typings.iabVpaid.iabVpaidStrings.normal = this.cast("normal")
  @scala.inline
  def thumbnail: typings.iabVpaid.iabVpaidStrings.thumbnail = this.cast("thumbnail")
}

