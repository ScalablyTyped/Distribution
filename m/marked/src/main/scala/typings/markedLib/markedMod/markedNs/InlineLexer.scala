package typings
package markedLib.markedMod.markedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineLexer extends js.Object {
  def mangle(text: java.lang.String): java.lang.String
  def output(src: java.lang.String): java.lang.String
  def outputLink(cap: js.Array[java.lang.String], link: java.lang.String): java.lang.String
  def smartypants(text: java.lang.String): java.lang.String
}

object InlineLexer {
  @scala.inline
  def apply(
    mangle: java.lang.String => java.lang.String,
    output: java.lang.String => java.lang.String,
    outputLink: (js.Array[java.lang.String], java.lang.String) => java.lang.String,
    smartypants: java.lang.String => java.lang.String
  ): InlineLexer = {
    val __obj = js.Dynamic.literal(mangle = js.Any.fromFunction1(mangle), output = js.Any.fromFunction1(output), outputLink = js.Any.fromFunction2(outputLink), smartypants = js.Any.fromFunction1(smartypants))
  
    __obj.asInstanceOf[InlineLexer]
  }
}

