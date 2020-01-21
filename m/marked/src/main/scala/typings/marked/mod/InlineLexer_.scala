package typings.marked.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "InlineLexer")
@js.native
class InlineLexer_ protected () extends js.Object {
  def this(links: js.Array[String]) = this()
  def this(links: js.Array[String], options: MarkedOptions) = this()
  var links: js.Array[String] = js.native
  var options: MarkedOptions = js.native
  var renderer: Renderer = js.native
  var rules: Rules = js.native
  def mangle(text: String): String = js.native
  def output(src: String): String = js.native
  def outputLink(cap: js.Array[String], link: String): String = js.native
  def smartypants(text: String): String = js.native
}

/* static members */
@JSImport("marked", "InlineLexer")
@js.native
object InlineLexer_ extends js.Object {
  var rules: Rules = js.native
  def escapes(text: String): String = js.native
  def output(src: String, links: js.Array[String]): String = js.native
  def output(src: String, links: js.Array[String], options: MarkedOptions): String = js.native
}

