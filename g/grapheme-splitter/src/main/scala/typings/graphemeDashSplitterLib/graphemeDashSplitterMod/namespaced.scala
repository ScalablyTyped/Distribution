package typings
package graphemeDashSplitterLib.graphemeDashSplitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grapheme-splitter", JSImport.Namespace)
@js.native
class namespaced () extends GraphemeSplitter {
  /** count the number of grapheme clusters in a string */
  /* CompleteClass */
  override def countGraphemes(s: java.lang.String): scala.Double = js.native
  /** iterate the string to an iterable iterator of grapheme clusters */
  /* CompleteClass */
  override def iterateGraphemes(s: java.lang.String): stdLib.IterableIterator[java.lang.String] = js.native
  /** split the string to an array of grapheme clusters */
  /* CompleteClass */
  override def splitGraphemes(s: java.lang.String): js.Array[java.lang.String] = js.native
}

