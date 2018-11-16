package typings
package jqueryDotTimeagoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeagoStatic extends js.Object {
  var settings: TimeagoSetings = js.native
  def apply(timestamp: java.lang.String): java.lang.String = js.native
  def apply(timestamp: JQuery): java.lang.String = js.native
  def apply(timestamp: scala.Double): java.lang.String = js.native
  def apply(timestamp: stdLib.Date): java.lang.String = js.native
  def apply(timestamp: stdLib.Element): java.lang.String = js.native
  def datetime(element: JQuery): stdLib.Date = js.native
  def datetime(element: stdLib.Element): stdLib.Date = js.native
  def inWords(distanceMillis: scala.Double): java.lang.String = js.native
  def inWords(distanceMillis: stdLib.Date): java.lang.String = js.native
  def isTime(element: JQuery): scala.Boolean = js.native
  def isTime(element: stdLib.Element): scala.Boolean = js.native
  def parse(iso8601: java.lang.String): stdLib.Date = js.native
}

