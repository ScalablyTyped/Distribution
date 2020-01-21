package typings.jquerySimplemodal

import typings.jquerySimplemodal.SimpleModal.JQueryExtension
import typings.jquerySimplemodal.SimpleModal.SimpleModalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("modal")
  var modal_Original: JQueryExtension = js.native
  def modal(): JQuery = js.native
  def modal(options: SimpleModalOptions): JQuery = js.native
}

