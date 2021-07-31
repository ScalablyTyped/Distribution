package typings.kendoUi.kendo

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observable
  extends StObject
     with Class {
  
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
  
  def unbind(): Observable = js.native
  def unbind(eventName: String): Observable = js.native
  def unbind(eventName: String, handler: js.Any): Observable = js.native
  def unbind(eventName: Unit, handler: js.Any): Observable = js.native
}
