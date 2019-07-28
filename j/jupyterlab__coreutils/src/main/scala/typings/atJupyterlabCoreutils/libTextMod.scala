package typings.atJupyterlabCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/text", JSImport.Namespace)
@js.native
object libTextMod extends js.Object {
  @JSName("Text")
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
    def charIndexToJsIndex(charIdx: Double, text: String): Double = js.native
    /**
      * Convert a javascript string index into a unicode character offset
      *
      * @param jsIdx - The javascript string index (counting surrogate pairs)
      *
      * @param text - The text in which the offset is calculated
      *
      * @returns The unicode character offset
      */
    def jsIndexToCharIndex(jsIdx: Double, text: String): Double = js.native
    /**
      * Given a string, title case the words in the string.
      *
      * @param str: the string to title case.
      *
      * @returns the same string, but with each word capitalized.
      */
    def titleCase(str: String): String = js.native
  }
  
}

