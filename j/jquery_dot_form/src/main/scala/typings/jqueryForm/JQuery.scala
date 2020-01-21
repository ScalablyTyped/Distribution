package typings.jqueryForm

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("ajaxForm")
  var ajaxForm_Original: JQueryForm = js.native
  @JSName("ajaxSubmit")
  var ajaxSubmit_Original: JQueryFormWithDebug = js.native
  def ajaxForm(): JQuery = js.native
  def ajaxForm(callback: js.Function): JQuery = js.native
  def ajaxForm(options: JQueryFormOptions): JQuery = js.native
  def ajaxFormUnbind(): JQuery = js.native
  def ajaxSubmit(): JQuery = js.native
  def ajaxSubmit(callback: js.Function): JQuery = js.native
  def ajaxSubmit(options: JQueryFormOptions): JQuery = js.native
  def clearFields(): JQuery = js.native
  def clearForm(): JQuery = js.native
  def enable(): JQuery = js.native
  def enable(enable: Boolean): JQuery = js.native
  def fieldSerialize(): String = js.native
  def fieldValue(): js.Array[String] = js.native
  def fieldValue(successful: Boolean): js.Array[String] = js.native
  def formSerialize(): String = js.native
  def formToArray(): js.Array[_] = js.native
  def formToArray(semantic: Boolean): js.Array[_] = js.native
  def formToArray(semantic: Boolean, elements: js.Array[Element]): js.Array[_] = js.native
  def resetForm(): JQuery = js.native
  def selected(): JQuery = js.native
  def selected(select: Boolean): JQuery = js.native
}

