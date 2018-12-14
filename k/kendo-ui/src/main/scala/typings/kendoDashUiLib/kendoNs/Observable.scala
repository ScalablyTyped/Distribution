package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.Observable")
@js.native
class Observable () extends Class {
  def bind(eventName: java.lang.String, handler: js.Function): Observable = js.native
  def bind(events: js.Array[java.lang.String], handler: js.Function): Observable = js.native
  def bind(
    events: js.Array[java.lang.String],
    handlers: org.scalablytyped.runtime.StringDictionary[js.Function]
  ): Observable = js.native
  def first(eventName: java.lang.String, handler: js.Function): Observable = js.native
  def first(events: js.Array[java.lang.String], handler: js.Function): Observable = js.native
  def first(
    events: js.Array[java.lang.String],
    handlers: org.scalablytyped.runtime.StringDictionary[js.Function]
  ): Observable = js.native
  def init(args: js.Any*): scala.Unit = js.native
  def one(eventName: java.lang.String, handler: js.Function): Observable = js.native
  def one(events: js.Array[java.lang.String], handler: js.Function): Observable = js.native
  def one(
    events: js.Array[java.lang.String],
    handlers: org.scalablytyped.runtime.StringDictionary[js.Function]
  ): Observable = js.native
  def trigger(eventName: java.lang.String): scala.Boolean = js.native
  def trigger(eventName: java.lang.String, e: js.Any): scala.Boolean = js.native
  def unbind(eventName: java.lang.String): Observable = js.native
  def unbind(eventName: java.lang.String, handler: js.Any): Observable = js.native
}

@JSGlobal("kendo.Observable")
@js.native
object Observable extends js.Object {
  var fn: kendoDashUiLib.kendoNs.Observable = js.native
  def extend(prototype: js.Object): kendoDashUiLib.kendoNs.Observable = js.native
}

