package typings
package jqueryDotTimeagoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("timeago")
  var timeago_Original: TimeagoStatic = js.native
  def timeago(timestamp: java.lang.String): java.lang.String = js.native
  def timeago(timestamp: JQuery): java.lang.String = js.native
  def timeago(timestamp: scala.Double): java.lang.String = js.native
  def timeago(timestamp: stdLib.Date): java.lang.String = js.native
  def timeago(timestamp: stdLib.Element): java.lang.String = js.native
}

