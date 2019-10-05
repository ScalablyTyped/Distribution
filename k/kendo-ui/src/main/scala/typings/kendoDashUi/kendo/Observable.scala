package typings.kendoDashUi.kendo

import org.scalablytyped.runtime.StringDictionary
import typings.kendoDashUi.kendo.data.ObservableObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.Observable")
@js.native
class Observable () extends Class {
  def bind(eventName: String, handler: js.Function): Observable = js.native
  def bind(events: js.Array[String], handler: js.Function): Observable = js.native
  def bind(events: js.Array[String], handlers: StringDictionary[js.Function]): Observable = js.native
  def first(eventName: String, handler: js.Function): Observable = js.native
  def first(events: js.Array[String], handler: js.Function): Observable = js.native
  def first(events: js.Array[String], handlers: StringDictionary[js.Function]): Observable = js.native
  def init(args: js.Any*): Unit = js.native
  def one(eventName: String, handler: js.Function): Observable = js.native
  def one(events: js.Array[String], handler: js.Function): Observable = js.native
  def one(events: js.Array[String], handlers: StringDictionary[js.Function]): Observable = js.native
  def trigger(eventName: String): Boolean = js.native
  def trigger(eventName: String, e: js.Any): Boolean = js.native
  def unbind(eventName: String): Observable = js.native
  def unbind(eventName: String, handler: js.Any): Observable = js.native
}

/* static members */
@JSGlobal("kendo.Observable")
@js.native
object Observable extends js.Object {
  var fn: Observable = js.native
  def extend(prototype: js.Object): Observable = js.native
}

@JSGlobal("kendo.observable")
@js.native
object observable extends js.Object {
  def apply(data: js.Any): ObservableObject = js.native
}

