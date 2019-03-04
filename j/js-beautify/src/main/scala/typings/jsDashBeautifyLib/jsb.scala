package typings
package jsDashBeautifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jsb extends js.Object {
  def apply(js_source_text: java.lang.String): java.lang.String = js.native
  def apply(js_source_text: java.lang.String, options: JsBeautifyOptions): java.lang.String = js.native
  def css(js_source_text: java.lang.String): java.lang.String = js.native
  def css(js_source_text: java.lang.String, options: CSSBeautifyOptions): java.lang.String = js.native
  def css_beautify(js_source_text: java.lang.String): java.lang.String = js.native
  def css_beautify(js_source_text: java.lang.String, options: CSSBeautifyOptions): java.lang.String = js.native
  def html(js_source_text: java.lang.String): java.lang.String = js.native
  def html(js_source_text: java.lang.String, options: HTMLBeautifyOptions): java.lang.String = js.native
  def html_beautify(js_source_text: java.lang.String): java.lang.String = js.native
  def html_beautify(js_source_text: java.lang.String, options: HTMLBeautifyOptions): java.lang.String = js.native
  @JSName("js")
  def js_(js_source_text: java.lang.String): java.lang.String = js.native
  @JSName("js")
  def js_(js_source_text: java.lang.String, options: JsBeautifyOptions): java.lang.String = js.native
  def js_beautify(js_source_text: java.lang.String): java.lang.String = js.native
  def js_beautify(js_source_text: java.lang.String, options: JsBeautifyOptions): java.lang.String = js.native
}

