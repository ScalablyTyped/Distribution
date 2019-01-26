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

