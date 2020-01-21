package typings.kendoUi.kendo

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.Observable")
@js.native
class Observable_ () extends Class {
  def bind(eventName: String, handler: js.Function): Observable_ = js.native
  def bind(events: js.Array[String], handler: js.Function): Observable_ = js.native
  def bind(events: js.Array[String], handlers: StringDictionary[js.Function]): Observable_ = js.native
  def first(eventName: String, handler: js.Function): Observable_ = js.native
  def first(events: js.Array[String], handler: js.Function): Observable_ = js.native
  def first(events: js.Array[String], handlers: StringDictionary[js.Function]): Observable_ = js.native
  def init(args: js.Any*): Unit = js.native
  def one(eventName: String, handler: js.Function): Observable_ = js.native
  def one(events: js.Array[String], handler: js.Function): Observable_ = js.native
  def one(events: js.Array[String], handlers: StringDictionary[js.Function]): Observable_ = js.native
  def trigger(eventName: String): Boolean = js.native
  def trigger(eventName: String, e: js.Any): Boolean = js.native
  def unbind(eventName: String): Observable_ = js.native
  def unbind(eventName: String, handler: js.Any): Observable_ = js.native
}

/* static members */
@JSGlobal("kendo.Observable")
@js.native
object Observable_ extends js.Object {
  var fn: Observable_ = js.native
  def extend(prototype: js.Object): Observable_ = js.native
}

