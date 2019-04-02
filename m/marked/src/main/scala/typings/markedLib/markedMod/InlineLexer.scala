package typings
package markedLib.markedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "InlineLexer")
@js.native
class InlineLexer protected ()
  extends markedLib.markedMod.markedNs.InlineLexer {
  def this(links: js.Array[java.lang.String]) = this()
  def this(links: js.Array[java.lang.String], options: markedLib.markedMod.markedNs.MarkedOptions) = this()
  /* CompleteClass */
  override def mangle(text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def output(src: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def outputLink(cap: js.Array[java.lang.String], link: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def smartypants(text: java.lang.String): java.lang.String = js.native
}

/* static members */
@JSImport("marked", "InlineLexer")
@js.native
object InlineLexer extends js.Object {
  var rules: markedLib.markedMod.markedNs.Rules = js.native
  def escapes(text: java.lang.String): java.lang.String = js.native
  def output(src: java.lang.String, links: js.Array[java.lang.String]): java.lang.String = js.native
  def output(
    src: java.lang.String,
    links: js.Array[java.lang.String],
    options: markedLib.markedMod.markedNs.MarkedOptions
  ): java.lang.String = js.native
}

