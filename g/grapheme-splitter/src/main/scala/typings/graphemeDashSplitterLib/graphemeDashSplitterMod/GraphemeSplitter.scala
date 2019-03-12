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
    countGraphemes: java.lang.String => scala.Double,
    iterateGraphemes: java.lang.String => stdLib.IterableIterator[java.lang.String],
    splitGraphemes: java.lang.String => js.Array[java.lang.String]
  ): GraphemeSplitter = {
    val __obj = js.Dynamic.literal(countGraphemes = js.Any.fromFunction1(countGraphemes), iterateGraphemes = js.Any.fromFunction1(iterateGraphemes), splitGraphemes = js.Any.fromFunction1(splitGraphemes))
  
    __obj.asInstanceOf[GraphemeSplitter]
  }
}

