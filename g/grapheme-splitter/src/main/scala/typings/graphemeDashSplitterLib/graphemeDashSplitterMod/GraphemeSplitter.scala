package typings
package graphemeDashSplitterLib.graphemeDashSplitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphemeSplitter extends js.Object {
  /** count the number of grapheme clusters in a string */
  def countGraphemes(s: java.lang.String): scala.Double
  /** iterate the string to an iterable iterator of grapheme clusters */
  def iterateGraphemes(s: java.lang.String): stdLib.IterableIterator[java.lang.String]
  /** split the string to an array of grapheme clusters */
  def splitGraphemes(s: java.lang.String): js.Array[java.lang.String]
}

object GraphemeSplitter {
  @scala.inline
  def apply(
    countGraphemes: js.Function1[java.lang.String, scala.Double],
    iterateGraphemes: js.Function1[java.lang.String, stdLib.IterableIterator[java.lang.String]],
    splitGraphemes: js.Function1[java.lang.String, js.Array[java.lang.String]]
  ): GraphemeSplitter = {
    val __obj = js.Dynamic.literal(countGraphemes = countGraphemes, iterateGraphemes = iterateGraphemes, splitGraphemes = splitGraphemes)
  
    __obj.asInstanceOf[GraphemeSplitter]
  }
}

