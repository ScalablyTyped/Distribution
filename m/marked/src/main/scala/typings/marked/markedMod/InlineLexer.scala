package typings.marked.markedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "InlineLexer")
@js.native
class InlineLexer protected () extends js.Object {
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
object InlineLexer extends js.Object {
  var rules: Rules = js.native
  def escapes(text: String): String = js.native
  def output(src: String, links: js.Array[String]): String = js.native
  def output(src: String, links: js.Array[String], options: MarkedOptions): String = js.native
}

@JSImport("marked", "inlineLexer")
@js.native
object inlineLexer extends js.Object {
  /**
    * @param src String of markdown source to be compiled
    * @param links Array of links
    * @param options Hash of options
    * @return String of compiled HTML
    */
  def apply(src: String, links: js.Array[String]): String = js.native
  def apply(src: String, links: js.Array[String], options: MarkedOptions): String = js.native
}

