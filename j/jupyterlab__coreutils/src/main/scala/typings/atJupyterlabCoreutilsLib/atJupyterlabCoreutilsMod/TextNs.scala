package typings
package atJupyterlabCoreutilsLib.atJupyterlabCoreutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "Text")
@js.native
object TextNs extends js.Object {
  /**
    * Convert a unicode character offset to a javascript string index.
    *
    * @param charIdx - The index in unicode characters
    *
    * @param text - The text in which the offset is calculated
    *
    * @returns The js-native index
    */
  def charIndexToJsIndex(charIdx: scala.Double, text: java.lang.String): scala.Double = js.native
  /**
    * Convert a javascript string index into a unicode character offset
    *
    * @param jsIdx - The javascript string index (counting surrogate pairs)
    *
    * @param text - The text in which the offset is calculated
    *
    * @returns The unicode character offset
    */
  def jsIndexToCharIndex(jsIdx: scala.Double, text: java.lang.String): scala.Double = js.native
  /**
    * Given a string, title case the words in the string.
    *
    * @param str: the string to title case.
    *
    * @returns the same string, but with each word capitalized.
    */
  def titleCase(str: java.lang.String): java.lang.String = js.native
}

