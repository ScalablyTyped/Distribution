package typings.jquerySimplemodal.SimpleModal

import typings.jquerySimplemodal.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends js.Object {
  
  def apply(element: JQuery): JQuery = js.native
  def apply(element: JQuery, options: SimpleModalOptions): JQuery = js.native
  def apply(html: String): JQuery = js.native
  def apply(html: String, options: SimpleModalOptions): JQuery = js.native
  
  def close(): Unit = js.native
  
  var defaults: SimpleModalOptions = js.native
}
