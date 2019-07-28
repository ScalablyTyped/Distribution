package typings.graphemeDashSplitter.graphemeDashSplitterMod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphemeSplitter extends js.Object {
  /** count the number of grapheme clusters in a string */
  def countGraphemes(s: String): Double
  /** iterate the string to an iterable iterator of grapheme clusters */
  def iterateGraphemes(s: String): IterableIterator[String]
  /** split the string to an array of grapheme clusters */
  def splitGraphemes(s: String): js.Array[String]
}

object GraphemeSplitter {
  @scala.inline
  def apply(
    countGraphemes: String => Double,
    iterateGraphemes: String => IterableIterator[String],
    splitGraphemes: String => js.Array[String]
  ): GraphemeSplitter = {
    val __obj = js.Dynamic.literal(countGraphemes = js.Any.fromFunction1(countGraphemes), iterateGraphemes = js.Any.fromFunction1(iterateGraphemes), splitGraphemes = js.Any.fromFunction1(splitGraphemes))
  
    __obj.asInstanceOf[GraphemeSplitter]
  }
}

