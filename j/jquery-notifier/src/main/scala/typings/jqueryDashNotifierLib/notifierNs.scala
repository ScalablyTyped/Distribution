package typings
package jqueryDashNotifierLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("notifier")
@js.native
object notifierNs extends js.Object {
  def hide(notificationId: java.lang.String): scala.Boolean = js.native
  def hide(notificationId: scala.Double): scala.Boolean = js.native
  /**
       * notifier.show(title, msg, type, icon, timeout);
       * {title} title
       * {msg} msg
       *  {type} type
       * {icon} icon
       * {timeout} timeout
       */
  def show(title: java.lang.String, msg: java.lang.String, `type`: java.lang.String, icon: java.lang.String): java.lang.String | scala.Double = js.native
  /**
       * notifier.show(title, msg, type, icon, timeout);
       * {title} title
       * {msg} msg
       *  {type} type
       * {icon} icon
       * {timeout} timeout
       */
  def show(
    title: java.lang.String,
    msg: java.lang.String,
    `type`: java.lang.String,
    icon: java.lang.String,
    timeout: scala.Double
  ): java.lang.String | scala.Double = js.native
}

