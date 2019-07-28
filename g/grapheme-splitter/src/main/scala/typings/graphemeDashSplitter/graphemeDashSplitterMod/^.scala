package typings.graphemeDashSplitter.graphemeDashSplitterMod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grapheme-splitter", JSImport.Namespace)
@js.native
class ^ () extends GraphemeSplitter {
  /** count the number of grapheme clusters in a string */
  /* CompleteClass */
  override def countGraphemes(s: String): Double = js.native
  /** iterate the string to an iterable iterator of grapheme clusters */
  /* CompleteClass */
  override def iterateGraphemes(s: String): IterableIterator[String] = js.native
  /** split the string to an array of grapheme clusters */
  /* CompleteClass */
  override def splitGraphemes(s: String): js.Array[String] = js.native
}

