package typings.jqueryTimeago

import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeagoStatic extends js.Object {
  var settings: TimeagoSetings = js.native
  def apply(timestamp: String): String = js.native
  def apply(timestamp: Double): String = js.native
  def apply(timestamp: JQuery): String = js.native
  def apply(timestamp: Date): String = js.native
  def apply(timestamp: Element): String = js.native
  def datetime(element: JQuery): Date = js.native
  def datetime(element: Element): Date = js.native
  def inWords(distanceMillis: Double): String = js.native
  def inWords(distanceMillis: Date): String = js.native
  def isTime(element: JQuery): Boolean = js.native
  def isTime(element: Element): Boolean = js.native
  def parse(iso8601: String): Date = js.native
}

