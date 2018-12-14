package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datepicker
  extends Widget
     with DatepickerOptions {
  var regional: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def formatDate(format: java.lang.String, date: stdLib.Date): java.lang.String = js.native
  def formatDate(format: java.lang.String, date: stdLib.Date, settings: DatepickerFormatDateOptions): java.lang.String = js.native
  def iso8601Week(date: stdLib.Date): scala.Double = js.native
  def noWeekends(date: stdLib.Date): js.Array[_] = js.native
  def parseDate(format: java.lang.String, date: java.lang.String): stdLib.Date = js.native
  def parseDate(format: java.lang.String, date: java.lang.String, settings: DatepickerFormatDateOptions): stdLib.Date = js.native
  def setDefaults(defaults: DatepickerOptions): scala.Unit = js.native
}

