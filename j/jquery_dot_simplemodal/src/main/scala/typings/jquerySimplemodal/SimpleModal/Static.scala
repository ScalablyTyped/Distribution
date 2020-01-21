package typings.jquerySimplemodal.SimpleModal

import typings.jquerySimplemodal.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var defaults: SimpleModalOptions = js.native
  def apply(element: JQuery): JQuery = js.native
  def apply(element: JQuery, options: SimpleModalOptions): JQuery = js.native
  def apply(html: String): JQuery = js.native
  def apply(html: String, options: SimpleModalOptions): JQuery = js.native
  def close(): Unit = js.native
}

