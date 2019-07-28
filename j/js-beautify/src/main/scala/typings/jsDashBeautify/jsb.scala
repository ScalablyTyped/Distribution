package typings.jsDashBeautify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jsb extends js.Object {
  def apply(js_source_text: String): String = js.native
  def apply(js_source_text: String, options: JsBeautifyOptions): String = js.native
  def css(js_source_text: String): String = js.native
  def css(js_source_text: String, options: CSSBeautifyOptions): String = js.native
  def css_beautify(js_source_text: String): String = js.native
  def css_beautify(js_source_text: String, options: CSSBeautifyOptions): String = js.native
  def html(js_source_text: String): String = js.native
  def html(js_source_text: String, options: HTMLBeautifyOptions): String = js.native
  def html_beautify(js_source_text: String): String = js.native
  def html_beautify(js_source_text: String, options: HTMLBeautifyOptions): String = js.native
  @JSName("js")
  def js_(js_source_text: String): String = js.native
  @JSName("js")
  def js_(js_source_text: String, options: JsBeautifyOptions): String = js.native
  def js_beautify(js_source_text: String): String = js.native
  def js_beautify(js_source_text: String, options: JsBeautifyOptions): String = js.native
}

